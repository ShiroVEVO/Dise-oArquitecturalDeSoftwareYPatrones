package Model.Repository.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection conn;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/example"; // REEMPLAZAR POR EL PUERTO Y DIRECCIÓN IP
                                                                             // QUE USAN EN MYSQL WORKBENCH
    private static final String USER = "root"; // REEMPLAZAR POR EL USUARIO QUE USAN EN MYSQL WORKBENCH
    private static final String PASS = "pass"; // REEMPLAZAR POR LA CONTRASEÑA QUE USAN EN MYSQL WORKBENCH

    @SuppressWarnings("deprecation")
    public void connect() throws SQLException {
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Problem:" + e);
        }
    }

    public void disconnect() throws SQLException {
        if (conn != null) {
            if (!conn.isClosed()) {
                conn.close();
            }
        }
    }
}