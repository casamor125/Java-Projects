/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package undirflota;

import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class UndirFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        System.out.println("Bienvenido a hundir la flota");
        System.out.println("Tenemos una cuadricula de 5x5");
        System.out.println("Las cordenadas van del 0 al 4");
        System.out.println("Donde hay escondidos 3 barcos");
        System.out.println("Tu objetivo es hundir-los");
        System.out.println("Tienes 5 de municion");
        System.out.println("Buena suerte");
        Jugar clase = new Jugar();
        clase.Partida();
       
    }
    
}
