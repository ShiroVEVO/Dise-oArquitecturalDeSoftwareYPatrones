package Controller;

import java.sql.SQLException;

import Model.Repository.Configuration.DBConnection;

public class Main {
    public static void main(String[] args) throws SQLException {

        DBConnection dbConnection = new DBConnection();
        dbConnection.conectar();
        System.out.println("Connection working...");
    }
}
