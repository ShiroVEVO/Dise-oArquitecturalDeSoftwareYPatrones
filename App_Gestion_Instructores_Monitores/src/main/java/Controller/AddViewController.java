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
import View.AddView;

public class AddViewController implements ActionListener {
    private AddView addView;
    private InterfaceDAO<Person> personDAO;
    private InterfaceDAO<Role> roleDAO;

    public AddViewController(AddView addView, InterfaceDAO<Person> personDAO, InterfaceDAO<Role> roleDAO) {
        this.addView = addView;
        this.personDAO = personDAO;
        this.roleDAO = roleDAO;

        this.addView.addPersonButton.addActionListener(this);
        this.addView.addRoleButton.addActionListener(this);
    }

    public void start() throws SQLException {
        addView.setVisible(true);
        List<Role> listRole = roleDAO.readEveryone();
        if (!listRole.isEmpty()) {
            for (int i = 0; i < listRole.size(); i++) {
                addView.personRoleSelector.addItem(listRole.get(i).getRoleName());
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addView.addPersonButton) {
            try {
                addPerson();
            } catch (Exception e1) {
                System.out.println("An error occurred, " + e1);
            }
        } else if (e.getSource() == addView.addRoleButton) {
            try {
                addRole();
            } catch (Exception e1) {
                System.out.println("An error occurred, " + e1);
            }
        }
    }

    public void addPerson() throws SQLException, ParseException {
        // CHAMBONADA EN PROCESO
        List<Person> listPersons = personDAO.readEveryone();
        int idPerson = listPersons.size() + 1;
        // CHAMBONADA FINALIZADA
        String name = addView.personNameTextField.getText();
        String phoneNumber = addView.phoneNumberTextField.getText();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dateUtil = format.parse(addView.birthDateTextField.getText());
        Date dateSQL = new Date(dateUtil.getTime());

        String address = addView.addressTextField.getText();
        String email = addView.emailTextField.getText();
        int idSelectedRole = addView.personRoleSelector.getSelectedIndex() + 1;
        Role role = roleDAO.readOne(idSelectedRole);
        personDAO.create(new Person(idPerson, name, phoneNumber, dateSQL, address,
                email, role));
    }

    public void addRole() throws SQLException {
        // CHAMBONADA EN PROCESO
        List<Role> listRoles = roleDAO.readEveryone();
        int idRole = listRoles.size() + 1;
        // CHAMBONADA FINALIZADA
        String roleName = addView.roleNameTextField.getText();
        addView.roleNameTextField.setText("");
        roleDAO.create(new Role(idRole, roleName));
    }
}
