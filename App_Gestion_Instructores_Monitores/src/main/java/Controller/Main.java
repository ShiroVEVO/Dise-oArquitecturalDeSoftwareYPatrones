package Controller;

import java.sql.SQLException;
import java.sql.Date;

import Model.Person;
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
        Person person1 = new Person(1, "juan", "0123456789", new Date(System.currentTimeMillis()),
                "P sherman Calle Wallaby 42 Sydney", "email@email.com", role2);
        Person person2 = new Person(2, "pedro", "9876543210", new Date(System.currentTimeMillis()),
                "P sherman Calle Wallaby 42 Sydney", "email@email.com", role1);
        Person personUpdate = new Person(2, "null", "null", new Date(System.currentTimeMillis()), "null", "null",
                role2);
        personDAO.create(person1);
        // roleDAO.readOne(2);
        // roleDAO.delete(1);
        // roleDAO.update(new Role(3, "IDK"));
        // personDAO.readEveryone();
        personDAO.update(personUpdate);
        System.out.println("Connection working...");

    }
}
