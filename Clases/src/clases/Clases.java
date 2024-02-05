/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author bielc
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     int numero = 5;  
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatoPersonalizado = ahora.format(formatter);
        System.out.println("Fecha y hora formateadas: " + formatoPersonalizado);
    }
        
}
