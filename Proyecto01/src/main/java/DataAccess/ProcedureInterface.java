/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DavidB
 */
public class ProcedureInterface {
    public static void proc_person_add(int p_identification_card, String p_first_name, String p_second_name, 
            String p_first_lastname, String p_second_lastname) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:globalDB";
        String uName = "LOANLIBRARY";
        String uPass = "LOANLIBRARY";
    
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call proc_person_add(?,?,?,?,?)}");
    
        stmt.setInt(1, p_identification_card);
        stmt.setString(2, p_first_name);
        stmt.setString(3, p_second_name);
        stmt.setString(4, p_first_lastname);
        stmt.setString(5, p_second_lastname);
        stmt.execute();
}
}
