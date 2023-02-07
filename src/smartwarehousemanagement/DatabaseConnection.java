/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartwarehousemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lahiru
 */
public class DatabaseConnection {
    
    static Connection connection()
    {
        try
        {
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wherehouse_sys?serverTimeZone=UTC","root",""); 
           return con; 
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Data Base Connection Error"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
   
                    return null;
                }
        
    }
    
    
}
