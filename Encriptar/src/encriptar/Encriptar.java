/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encriptar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class Encriptar {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un usuario, email y contraseña");
       String usuario = sc.nextLine();
       String email = sc.nextLine();
       String contraseña = sc.nextLine();
       Usuario U = new Usuario(usuario,email,contraseña);
       U.Encriptar();
       U.DesEncriptar();
       
       
       
    }
    
}
