/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DavidB
 */
public class DBConnection {
    
    public static Connection getConnection() {
      
        try {
          
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String myDB = "jdbc:oracle:thin:@localhost:1521:globalDB";
            String usuario="LOANLIBRARY";
            String password="LOANLIBRARY";
            Connection cn = DriverManager.getConnection(myDB,usuario,password);
            
            return cn;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
    

}