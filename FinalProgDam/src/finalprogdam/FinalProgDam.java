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
 * Esta clase solo la utilizamos para hacer visible el menu principal
 * @author bielc
 */
public class FinalProgDam {

    /**
     * @param args the command line arguments
     * El main solo lo utilizamos para hacer visible nuestro menu principal
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here        
                new Pantallas().setVisible(true);

        
    }
    
}
