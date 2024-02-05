/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principioobjetos;

import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class PrincipioObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] numeros = {5,7,6,12};
         int contador = 0;
    
        Objetos p = new Objetos();
//        p.objeto(sc.nextLine(),sc.nextInt());
//        System.out.println(p.todo);
        
        p.multiplicar(numeros);
        while(contador <numeros.length){
        
            System.out.println(numeros[contador]);
            contador++;
        }
    }
    
}
