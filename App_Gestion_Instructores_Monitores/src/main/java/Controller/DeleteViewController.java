package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import Model.Person;
import Model.Role;
import Model.Repository.InterfaceDAO;
import View.DeleteView;

public class DeleteViewController implements ActionListener {
    private InterfaceDAO<Person> personDAO;
    private InterfaceDAO<Role> roleDAO;
    private DeleteView deleteView;

    public DeleteViewController(DeleteView deleteView, InterfaceDAO<Person> personDAO, InterfaceDAO<Role> roleDAO) {
        this.personDAO = personDAO;
        this.roleDAO = roleDAO;
        this.deleteView = deleteView;

        this.deleteView.deletePersonButton.addActionListener(this);
        this.deleteView.deleteRoleButton.addActionListener(this);
    }

    public void start() {
        deleteView.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deleteView.deletePersonButton) {
            try {
                deletePerson();
            } catch (SQLException e1) {
                System.out.println("An error occurred, " + e1);
            }
        } else if (e.getSource() == deleteView.deleteRoleButton) {
            try {
                deleteRole();
            } catch (SQLException e1) {
                System.out.println("An error occurred, " + e1);
            }
        }
    }

    public void deletePerson() throws SQLException {
        int idPerson = Integer.parseInt(deleteView.idPersonTextField.getText());
        personDAO.delete(idPerson);
        deleteView.idPersonTextField.setText("");
    }

    public void deleteRole() throws SQLException {
        int idRole = Integer.parseInt(deleteView.idRoleTextField.getText());
        roleDAO.delete(idRole);
        deleteView.idRoleTextField.setText("");
    }

}
