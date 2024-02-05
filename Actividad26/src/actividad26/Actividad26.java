/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad26;

import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class Actividad26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        char[] a;
        String frase;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una frase y te dire cuantas letras o tiene");
        frase = sc.nextLine();
        a = frase.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i]==' '){
                cont++;
            }
        }
        System.out.println("tu frase contiene "+ cont+" letras o ");
       
    }
    
}
