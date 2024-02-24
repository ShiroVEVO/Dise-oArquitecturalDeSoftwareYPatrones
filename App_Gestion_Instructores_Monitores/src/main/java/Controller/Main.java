package Controller;

import java.sql.SQLException;

import Model.Role;
import Model.Repository.Implementations.PersonDAO;
import Model.Repository.Implementations.RoleDAO;

public class Main {
    public static void main(String[] args) throws SQLException {
        RoleDAO roleDAO = new RoleDAO();
        PersonDAO personDAO = new PersonDAO();
        roleDAO.createTable();
        personDAO.createTable();

        Role role1 = new Role(1, "Instructor");
        Role role2 = new Role(2, "Monitor");
        // roleDAO.create(role1);
        // roleDAO.create(role2);
        // roleDAO.readOne(2);
        // roleDAO.delete(1);
        roleDAO.update(new Role(3, "IDK"));

        System.out.println("Connection working...");

    }
}
