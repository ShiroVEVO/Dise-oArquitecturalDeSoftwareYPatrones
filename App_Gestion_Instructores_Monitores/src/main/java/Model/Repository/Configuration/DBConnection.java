package Model.Repository.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection conn;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/example";
    private static final String USER = "root";
    private static final String PASS = "Onepiece345";

    @SuppressWarnings("deprecation")
    public void conectar() throws SQLException {
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Problema:" + e);
        }
    }

    public void desconectar() throws SQLException {
        if (conn != null) {
            if (!conn.isClosed()) {
                conn.close();
            }
        }
    }
}