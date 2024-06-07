/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalprogdam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * El main solo lo utilizamos para hacer visible nuestro menu principal
 * @author bielc
 */
public class FinalProgDam {

    /**
     *El main solo lo utilizamos para hacer visible nuestro menu principal
     * @param args the command line arguments

     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here        
                new Pantallas().setVisible(true);

        
    }
    
}