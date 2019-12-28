/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author REFİK
 */
public class DatabaseConnector {
    
    
    public static Connection GetConnection() throws ClassNotFoundException, SQLException
    {
        Connection conn;
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
        String url = "jdbc:ucanaccess://InventoryDB.accdb";
        
        conn=DriverManager.getConnection(url,"","");
        
        return conn;
       
    }
    
}
