/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinar.numero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
//        int random = rm.nextInt(51);
        int intentos = 0;
//        int numero = sc.nextInt();
//
//        while (numero != random && intentos < 4) {
//            if (numero == random) {
//                System.out.println("Molt Bé! has endevinat es numero");
//            } else if (numero > random) {
//                System.out.println(numero + " es major al numero que has de endivinar");
//            } else {
//                System.out.println(numero + " es menor al numero a endevinar");
//            }
//            intentos++;
//            numero = sc.nextInt();
//        }
//        if (numero == random) {
//                System.out.println("Molt Bé! has endevinat es numero");
//            }else{
//                System.out.println("Una pena, ja ho aconseguiras");
//        }
//

        char[] adivinar = {'c', 'a', 's', 'a'};
        String p = sc.nextLine();
        int indice ;

        boolean adivinada = false;
        while (adivinada != true && intentos < 4) {
            char[] palabra = p.toCharArray();
            
            for (indice = 0; indice < palabra.length && palabra[indice] == adivinar[indice]; indice++) {
                if (palabra[indice] == adivinar[indice]) {
                    System.out.println(palabra[indice]);
                } else {
                    System.out.print("_");
                }
            }
            
            if (indice == palabra.length) {
                System.out.println("Muy Bien! has adivinado la palabra");
                adivinada = true;
            }
            
            p = sc.nextLine();
            intentos++;
        }

        if (adivinada == true) {
            System.out.println("Muy Bien! has adivinado la palabra");
        } else {
            System.out.println("Que pena ya lo conseguiras");
        }
    }

}
