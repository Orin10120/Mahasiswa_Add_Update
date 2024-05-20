
package config;

import java.sql.*;

public class koneksi {
    private static Connection conn;
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://127.0.0.1:3306/mahasiswa";
                String user = "root";
                String pass = "root123";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection)DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return conn;
    }
}
