package Model.Repository.Implementations;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Model.Person;
import Model.Repository.InterfaceDAO;
import Model.Repository.Configuration.DBConnection;

public class PersonDAO implements InterfaceDAO<Person> {
    private DBConnection dbConnection = new DBConnection();
    private static final String createTable = "CREATE TABLE IF NOT EXISTS `example`.`person` (" +
            "`idperson` INT UNSIGNED NOT NULL AUTO_INCREMENT," +
            "`name` VARCHAR(50) NOT NULL," +
            "`phoneNumber` VARCHAR(10) NOT NULL," +
            "`birthDate` DATE NOT NULL," +
            "`address` VARCHAR(100) NOT NULL," +
            "`email` VARCHAR(60) NOT NULL," +
            "`role_idrole` INT UNSIGNED NOT NULL," +
            "PRIMARY KEY (`idperson`)," +
            "UNIQUE INDEX `idperson_UNIQUE` (`idperson` ASC) VISIBLE," +
            "INDEX `fk_person_role_idx` (`role_idrole` ASC) VISIBLE," +
            "CONSTRAINT `fk_person_role`" +
            "FOREIGN KEY (`role_idrole`)" +
            "REFERENCES `example`.`role` (`idrole`)" +
            "ON DELETE NO ACTION " +
            "ON UPDATE NO ACTION) " +
            "ENGINE = InnoDB;";
    /*
     * private static final String select = "SELECT * FROM ODONTOLOGO;";
     * private static final String select_with_id =
     * "SELECT * FROM ODONTOLOGO WHERE NUMMATRICULA = ?";
     * private static final String insert =
     * "INSERT INTO ODONTOLOGO VALUES(?,?,?,?,?,?);";
     * private static final String delete =
     * "DELETE FROM ODONTOLOGO WHERE NUMMATRICULA = ?;";
     * private static final String update =
     * "UPDATE ODONTOLOGO SET USUARIO=?, PASSWORD=?, NOMBRE=?, APELLIDO=? WHERE NUMMATRICULA = ?;"
     * ;
     */

    @Override
    public void createTable() throws SQLException { // TESTED
        dbConnection.connect();
        Statement query = null;
        try {
            query = dbConnection.conn.createStatement();
            query.execute(createTable);
            System.out.println("Table was created");
        } catch (Exception e) {
            System.out.println("Table wasn't created - " + e);
        } finally {
            query.close();
            dbConnection.disconnect();
        }
    }

    @Override
    public Person readOne(int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOne'");
    }

    @Override
    public Person create(Person t) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void delete(int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Person update(Person t) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public List<Person> readEveryone() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readEveryone'");
    }

}
