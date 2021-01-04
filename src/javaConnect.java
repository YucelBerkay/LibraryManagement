 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author berkaypc
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {
    Connection conn;
    
    public static Connection ConnectrDb() {
        try {
            // Fix the connection error
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:"
                    + "/home/berkaypc/NetBeansProjects/LibraryManagement/LibraryDatabase");
            return conn;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null; 
        }
    }
}
