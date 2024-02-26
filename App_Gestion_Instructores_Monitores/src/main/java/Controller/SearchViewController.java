package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Model.Person;
import Model.Repository.InterfaceDAO;
import View.SearchView;

public class SearchViewController implements ActionListener {
    private SearchView searchView;
    private InterfaceDAO<Person> personDAO;

    public SearchViewController(SearchView searchView, InterfaceDAO<Person> personDAO) {
        this.searchView = searchView;
        this.personDAO = personDAO;

        this.searchView.searchEveryoneButton.addActionListener(this);
        this.searchView.searchIdButton.addActionListener(this);
    }

    public void start() {
        searchView.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchView.searchIdButton) {

            try {
                searchById();
            } catch (SQLException e1) {
                System.out.println("An error occurred, " + e1);
            }
        } else if (e.getSource() == searchView.searchEveryoneButton) {
            try {
                searchEveryone();
            } catch (SQLException e1) {
                System.out.println("An error occurred, " + e1);
            }
        }
    }

    public void searchById() throws SQLException {
        int idPerson = Integer.parseInt(searchView.idTextField.getText());
        Person searchedPerson = personDAO.readOne(idPerson);

        searchView.idTextField.setText("");

        DefaultTableModel tableModel = new DefaultTableModel();
        String columnIdentifiers[] = { "Id", "Nombre", "Telefono", "Fecha de Nacimiento",
                "Dirección", "Email", "Rol" };
        tableModel.setColumnIdentifiers(columnIdentifiers);
        searchView.jTable1.setModel(tableModel);
        tableModel.addRow(new Object[] { searchedPerson.getId(), searchedPerson.getName(),
                searchedPerson.getPhoneNumber(), searchedPerson.getBirthDate(), searchedPerson.getAddress(),
                searchedPerson.getEmail(),
                searchedPerson.getRole().getRoleName() });
    }

    public void searchEveryone() throws SQLException {
        List<Person> persons = personDAO.readEveryone();
        DefaultTableModel tableModel = new DefaultTableModel();
        String columnIdentifiers[] = { "Id", "Nombre", "Telefono", "Fecha de Nacimiento",
                "Dirección", "Email", "Rol" };
        tableModel.setColumnIdentifiers(columnIdentifiers);
        searchView.jTable1.setModel(tableModel);

        for (int i = 0; i < persons.size(); i++) {
            Person searchedPerson = persons.get(i);
            tableModel.addRow(new Object[] { searchedPerson.getId(), searchedPerson.getName(),
                    searchedPerson.getPhoneNumber(), searchedPerson.getBirthDate(), searchedPerson.getAddress(),
                    searchedPerson.getEmail(),
                    searchedPerson.getRole().getRoleName() });
        }
    }
}
