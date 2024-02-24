package Model.Repository.Implementations;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Person;
import Model.Role;
import Model.Repository.InterfaceDAO;
import Model.Repository.Configuration.DBConnection;

public class PersonDAO implements InterfaceDAO<Person> {
    private DBConnection dbConnection = new DBConnection();
    private PreparedStatement query = null;
    private RoleDAO roleDAO = new RoleDAO();
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS `example`.`person` (" +
            "`idperson` INT UNSIGNED NOT NULL AUTO_INCREMENT," +
            "`name` VARCHAR(50) NOT NULL," +
            "`phoneNumber` VARCHAR(10) NOT NULL," +
            "`birthDate` DATE NOT NULL," +
            "`address` VARCHAR(100) NOT NULL," +
            "`email` VARCHAR(60) NOT NULL," +
            "`person_idperson` INT UNSIGNED NOT NULL," +
            "PRIMARY KEY (`idperson`)," +
            "UNIQUE INDEX `idperson_UNIQUE` (`idperson` ASC) VISIBLE," +
            "INDEX `fk_person_person_idx` (`person_idperson` ASC) VISIBLE," +
            "CONSTRAINT `fk_person_person`" +
            "FOREIGN KEY (`person_idperson`)" +
            "REFERENCES `example`.`person` (`idperson`)" +
            "ON DELETE NO ACTION " +
            "ON UPDATE NO ACTION) " +
            "ENGINE = InnoDB;";
    private static final String INSERT = "INSERT INTO person VALUES(?,?,?,?,?,?,?);";
    private static final String SELECT = "SELECT * FROM person;";
    private static final String SELECT_ONE = "SELECT * FROM person WHERE idperson = ?;";
    private static final String DELETE = "DELETE FROM person WHERE idperson = ?;";
    private static final String UPDATE = "UPDATE person SET name = ?, phoneNumber = ?, birthDate = ?, address = ?, email = ?, role_idrole = ? WHERE idperson = ?;";

    @Override
    public void createTable() throws SQLException { // TESTED
        dbConnection.connect();
        Statement query = null;
        try {
            query = dbConnection.conn.createStatement();
            query.execute(CREATE_TABLE);
            System.out.println("Table was created");
        } catch (Exception e) {
            System.out.println("Table wasn't created - " + e);
        } finally {
            query.close();
            dbConnection.disconnect();
        }
    }

    @Override
    public Person create(Person person) throws SQLException { // TESTED
        try {
            dbConnection.connect();
            query = dbConnection.conn.prepareStatement(INSERT);
            query.setInt(1, person.getId());
            query.setString(2, person.getName());
            query.setString(3, person.getPhoneNumber());
            query.setDate(4, person.getBirthDate());
            query.setString(5, person.getAddress());
            query.setString(6, person.getEmail());
            query.setInt(7, person.getRole().getId());
            query.execute();
            System.out.println("person was saved: " + person.toString());
        } catch (Exception e) {
            System.out.println("person wasn't saved - " + e);
        } finally {
            query.close();
            dbConnection.disconnect();
        }
        return person;
    }

    @Override
    public List<Person> readEveryone() throws SQLException { // TESTED
        Statement query = null;
        ResultSet results = null;
        List<Person> personList = new ArrayList<>();
        try {
            dbConnection.connect();
            query = dbConnection.conn.createStatement();
            results = query.executeQuery(SELECT);
            while (results.next()) {
                int idPerson = results.getInt(1);
                String name = results.getString(2);
                String phoneNumber = results.getString(3);
                Date birthDate = results.getDate(4);
                String address = results.getString(5);
                String email = results.getString(6);
                int idRole = results.getInt(7);
                Role role = roleDAO.readOne(idRole);
                // ------ SUJETO DE MODIFICACIÓN SEGUN MANEJO DEL ERROR
                if (role != null) {
                    Person person = new Person(idPerson, name, phoneNumber, birthDate, address, email, role);
                    System.out.println("Person was selected, " + person.toString());
                    personList.add(person);
                } else {
                    System.out.println("The role associated to this person doesn't exist");
                }
                // -------------
            }
        } catch (Exception e) {
            System.out.println("An error occurred, " + e);
        } finally {
            results.close();
            query.close();
            dbConnection.disconnect();
        }
        return personList;
    }

    @Override
    public Person readOne(int idPerson) throws SQLException { // TESTED
        ResultSet results = null;
        Person person = null;
        try {
            dbConnection.connect();
            query = dbConnection.conn.prepareStatement(SELECT_ONE);
            query.setInt(1, idPerson);
            results = query.executeQuery();
            if (results.next()) {
                int idPersonSelected = results.getInt(1);
                String name = results.getString(2);
                String phoneNumber = results.getString(3);
                Date birthDate = results.getDate(4);
                String address = results.getString(5);
                String email = results.getString(6);
                int idRole = results.getInt(7);
                Role role = roleDAO.readOne(idRole);
                // ------ SUJETO DE MODIFICACIÓN SEGUN MANEJO DEL ERROR
                if (role != null) {
                    person = new Person(idPersonSelected, name, phoneNumber, birthDate, address, email, role);
                    System.out.println("Person was selected, " + person.toString());
                } else {
                    System.out.println("The role associated to this person doesn't exist");
                }
                // -------------
            }
        } catch (Exception e) {
            System.out.println("An error occurred, " + e);
        } finally {
            results.close();
            query.close();
            dbConnection.disconnect();
        }
        return person;
    }

    @Override
    public void delete(int idPerson) throws SQLException { // TESTED
        try {
            dbConnection.connect();
            query = dbConnection.conn.prepareStatement(DELETE);
            query.setInt(1, idPerson);
            query.executeUpdate();
            System.out.println("Person with id: " + idPerson + " was successfully eliminated");
        } catch (Exception e) {
            System.out.println("Person couldn't be eliminated, " + e);
        } finally {
            dbConnection.disconnect();
        }
    }

    @Override
    public Person update(Person person) throws SQLException {
        // FALTA AGREGAR SI EXISTE O NO
        try {
            dbConnection.connect();
            query = dbConnection.conn.prepareStatement(UPDATE);
            query.setString(1, person.getName());
            query.setString(2, person.getPhoneNumber());
            query.setDate(3, person.getBirthDate());
            query.setString(4, person.getAddress());
            query.setString(5, person.getEmail());
            query.setInt(6, person.getRole().getId());
            query.setInt(7, person.getId());
            query.executeUpdate();
            System.out
                    .println("Person with id: " + person.getId() + " was successfully updated to " + person.toString());
        } catch (Exception e) {
            System.out.println("Person couldn't be updated, " + e);
        } finally {
            query.close();
            dbConnection.disconnect();
        }
        return person;
    }

}
