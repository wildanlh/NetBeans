/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listitem;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Connect {
    private static java.sql.Connection connectionDatabase;
    
    public static java.sql.Connection connectionDB() throws SQLException {
        try {
            String DB = "jdbc:mysql://localhost:3306/sale";
            String user = "root";
            String pass = "root";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connectionDatabase = DriverManager.getConnection(DB, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Connection", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return connectionDatabase;
    }
}
