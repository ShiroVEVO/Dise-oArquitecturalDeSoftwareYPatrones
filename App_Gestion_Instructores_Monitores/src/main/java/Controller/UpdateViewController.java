package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import Model.Person;
import Model.Role;
import Model.Repository.InterfaceDAO;
import View.UpdateView;

public class UpdateViewController implements ActionListener {
    private UpdateView updateView;
    private InterfaceDAO<Person> personDAO;
    private InterfaceDAO<Role> roleDAO;

    public UpdateViewController(UpdateView updateView, InterfaceDAO<Person> personDAO, InterfaceDAO<Role> roleDAO) {
        this.updateView = updateView;
        this.personDAO = personDAO;
        this.roleDAO = roleDAO;

        this.updateView.searchPersonButton.addActionListener(this);
        this.updateView.searchRoleButton.addActionListener(this);
        this.updateView.updatePersonButton.addActionListener(this);
        this.updateView.updateRoleButton.addActionListener(this);
    }

    public void start() throws SQLException {
        updateView.setVisible(true);
        List<Role> listRole = roleDAO.readEveryone();
        if (!listRole.isEmpty()) {
            for (int i = 0; i < listRole.size(); i++) {
                updateView.personRoleSelector.addItem(listRole.get(i).getRoleName());
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == updateView.searchPersonButton) {

            try {
                searchPerson();
            } catch (Exception e1) {
                System.out.println("An error occurred, " + e1);
            }
        } else if (e.getSource() == updateView.searchRoleButton) {
            try {
                searchRole();
            } catch (Exception e1) {
                System.out.println("An error occurred, " + e1);
            }
        } else if (e.getSource() == updateView.updatePersonButton) {
            try {
                updatePerson();
            } catch (Exception e1) {
                System.out.println("An error occurred, " + e1);
            }
        } else if (e.getSource() == updateView.updateRoleButton) {
            try {
                updateRole();
            } catch (SQLException e1) {
                System.out.println("An error occurred, " + e1);
            }
        }
    }

    public void searchPerson() throws NumberFormatException, SQLException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Person searchedPerson = personDAO.readOne(Integer.parseInt(updateView.idPersonTextField.getText()));
        updateView.personNameTextField.setText(searchedPerson.getName());
        updateView.phoneNumberTextField.setText(searchedPerson.getPhoneNumber());
        updateView.birthDateTextField.setText(format.format(searchedPerson.getBirthDate()));
        updateView.addressTextField.setText(searchedPerson.getAddress());
        updateView.emailTextField.setText(searchedPerson.getEmail());
        updateView.personRoleSelector.setSelectedIndex(searchedPerson.getId());
    }

    public void searchRole() throws NumberFormatException, SQLException {
        Role searchedRole = roleDAO.readOne(Integer.parseInt(updateView.idRoleTextField.getText()));
        updateView.roleNameTextField.setText(searchedRole.getRoleName());
    }

    public void updatePerson() throws SQLException, ParseException {
        int idPerson = Integer.parseInt(updateView.idPersonTextField.getText());
        String name = updateView.personNameTextField.getText();
        String phoneNumber = updateView.phoneNumberTextField.getText();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dateUtil = format.parse(updateView.birthDateTextField.getText());
        Date dateSQL = new Date(dateUtil.getTime());

        String address = updateView.addressTextField.getText();
        String email = updateView.emailTextField.getText();
        int idSelectedRole = updateView.personRoleSelector.getSelectedIndex() + 1;
        Role role = roleDAO.readOne(idSelectedRole);
        personDAO.update(new Person(idPerson, name, phoneNumber, dateSQL, address,
                email, role));
    }

    public void updateRole() throws SQLException {
        int idRole = Integer.parseInt(updateView.idRoleTextField.getText());
        String roleName = updateView.roleNameTextField.getText();
        updateView.roleNameTextField.setText("");
        roleDAO.update(new Role(idRole, roleName));
    }

}
