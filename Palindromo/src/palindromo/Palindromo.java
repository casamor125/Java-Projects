/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String Palabra ;
        char[] array;
        Palabra = sc.nextLine();
        array = Palabra.toCharArray();
        int contat = array.length - 1;
        int contad = 0;
        boolean capicua = true;
        
        
        while( contad < contat) {  
             if(array[contad]!=array[contat]){
            capicua = false;
            }
            contat--;
            contad++;
        }
        
        if(capicua == false){
            System.out.println("No son capicuas");
            }else{
            System.out.println("Si son capicuas");
        }
        
        
    }
    
}
