package Model.Repository.Implementations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Role;
import Model.Repository.InterfaceDAO;
import Model.Repository.Configuration.DBConnection;

public class RoleDAO implements InterfaceDAO<Role> {
    private DBConnection dbConnection = new DBConnection();
    private PreparedStatement query = null;
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS `example`.`role` (" +
            "`idrole` INT UNSIGNED NOT NULL AUTO_INCREMENT," +
            "`name` VARCHAR(45) NOT NULL," +
            "PRIMARY KEY (`idrole`)," +
            "UNIQUE INDEX `idrole_UNIQUE` (`idrole` ASC) VISIBLE) " +
            "ENGINE = InnoDB;";
    private static final String INSERT = "INSERT INTO role VALUES(?,?);";
    private static final String SELECT = "SELECT * FROM role;";
    private static final String SELECT_ONE = "SELECT * FROM role WHERE idrole = ?;";
    private static final String DELETE = "DELETE FROM role WHERE idrole = ?;";
    private static final String UPDATE = "UPDATE role SET name = ? WHERE idrole = ?;";

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
    public Role create(Role role) throws SQLException { // TESTED
        try {
            dbConnection.connect();
            query = dbConnection.conn.prepareStatement(INSERT);
            query.setInt(1, role.getId());
            query.setString(2, role.getRoleName());
            query.execute();
            System.out.println("Role was saved: " + role.toString());
        } catch (Exception e) {
            System.out.println("Role wasn't saved - " + e);
        } finally {
            query.close();
            dbConnection.disconnect();
        }
        return role;
    }

    @Override
    public List<Role> readEveryone() throws SQLException { // TESTED
        Statement query = null;
        ResultSet results = null;
        List<Role> roleList = new ArrayList<>();
        try {
            dbConnection.connect();
            query = dbConnection.conn.createStatement();
            results = query.executeQuery(SELECT);

            while (results.next()) {
                int idRole = results.getInt(1);
                String roleName = results.getString(2);
                Role role = new Role(idRole, roleName);
                System.out.println("Role was selected, " + role.toString());
                roleList.add(role);
            }
        } catch (Exception e) {
            System.out.println("An error occurred, " + e);
        } finally {
            results.close();
            query.close();
            dbConnection.disconnect();
        }
        return roleList;
    }

    @Override
    public Role readOne(int idRole) throws SQLException { // TESTED
        ResultSet results = null;
        Role role = null;
        try {
            dbConnection.connect();
            query = dbConnection.conn.prepareStatement(SELECT_ONE);
            query.setInt(1, idRole);
            results = query.executeQuery();
            if (results.next()) {
                int idRoleSelected = results.getInt(1);
                String roleName = results.getString(2);
                role = new Role(idRoleSelected, roleName);
                System.out.println("Role was selected, " + role.toString());
            }
        } catch (Exception e) {
            System.out.println("An error occurred, " + e);
        } finally {
            results.close();
            query.close();
            dbConnection.disconnect();
        }
        return role;
    }

    @Override
    public void delete(int idRole) throws SQLException { // TESTED
        try {
            dbConnection.connect();
            query = dbConnection.conn.prepareStatement(DELETE);
            query.setInt(1, idRole);
            query.executeUpdate();
            System.out.println("Role with id: " + idRole + " was successfully eliminated");
        } catch (Exception e) {
            System.out.println("Role couldn't be eliminated, " + e);
        } finally {
            dbConnection.disconnect();
        }
    }

    @Override
    public Role update(Role role) throws SQLException { // TESTED
        // FALTA AGREGAR SI EXISTE O NO
        try {
            dbConnection.connect();
            query = dbConnection.conn.prepareStatement(UPDATE);
            query.setString(1, role.getRoleName());
            query.setInt(2, role.getId());
            query.executeUpdate();
            System.out.println("Role with id: " + role.getId() + " was successfully updated to " + role.toString());
        } catch (Exception e) {
            System.out.println("Role couldn't be updated, " + e);
        } finally {
            query.close();
            dbConnection.disconnect();
        }
        return role;
    }

}
