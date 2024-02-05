/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscapalabras;

import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class BuscaPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"casa","mar","casamor","marc"};
        Scanner sc = new Scanner(System.in);
        String lector;
        lector = sc.nextLine();
        boolean encontrado = false;
        for (String n:nombres) {
            if (n.equals(lector) ){
                System.out.println("se ha encontrado el nombre");
                encontrado = true;
            }
        }
        if(encontrado == false){
            System.out.println("no se ha encontrado");
        }
    }
    
}
