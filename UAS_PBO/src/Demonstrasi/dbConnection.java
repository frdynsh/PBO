package Demonstrasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FERDI YANSAH
 */
public class dbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/laundry_app";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi berhasil!");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Gagal menghubungkan ke database: " + e.getMessage());
            }
        }
        return connection;
    }
    
    // Method untuk mengambil data pesanan dari database
    public static ResultSet getPesanan() {
        Connection conn = getConnection();
        if (conn != null) {
            try {
                String query = "SELECT * FROM pesanan";
                Statement stmt = conn.createStatement();
                return stmt.executeQuery(query);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal mengambil data pesanan: " + e.getMessage());
            }
        }
        return null;
    }
}