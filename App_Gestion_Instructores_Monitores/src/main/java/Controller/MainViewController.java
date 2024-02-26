package Controller;

import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Repository.Implementations.PersonDAO;
import Model.Repository.Implementations.RoleDAO;

import View.AddView;
import View.DeleteView;
import View.MainView;
import View.SearchView;
import View.UpdateView;

public class MainViewController implements ActionListener {
    private MainView mainView;

    public MainViewController(MainView mainView) {
        this.mainView = mainView;
        this.mainView.addViewButton.addActionListener(this);
        this.mainView.deleteViewButton.addActionListener(this);
        this.mainView.searchViewButton.addActionListener(this);
        this.mainView.updateViewButton.addActionListener(this);
    }

    public void start() throws SQLException {
        mainView.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PersonDAO personDAO = new PersonDAO();
        RoleDAO roleDAO = new RoleDAO();

        if (e.getSource() == mainView.searchViewButton) {
            SearchViewController searchViewController = new SearchViewController(new SearchView(), personDAO);
            searchViewController.start();
        } else if (e.getSource() == mainView.addViewButton) {
            AddViewController addViewController = new AddViewController(new AddView(), personDAO, roleDAO);
            try {
                addViewController.start();
            } catch (SQLException e1) {
                System.out.println("An error occurred, " + e1);
            }
        } else if (e.getSource() == mainView.deleteViewButton) {
            DeleteViewController deleteViewController = new DeleteViewController(new DeleteView(), personDAO, roleDAO);
            deleteViewController.start();
        } else if (e.getSource() == mainView.updateViewButton) {
            UpdateViewController updateViewController = new UpdateViewController(new UpdateView(), personDAO, roleDAO);
            try {
                updateViewController.start();
            } catch (SQLException e1) {
                System.out.println("An error occurred, " + e1);
            }
        }
    }

}
