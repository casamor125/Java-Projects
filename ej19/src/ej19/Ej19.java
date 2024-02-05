/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej19;

/**
 *
 * @author bielc
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LT lector = new LT();
        int l = lector.leerEntero();
        int total = 0;
       int contador = 1 ;
       while(contador<l){
           if(contador%l==0){
               total = total +contador;
           }
           contador++;
           
       }
       if(total == l){
           System.out.println(l+" es perfecto");}
       else if(total <l){
           System.out.println(l +" es deficiente");}
       else if (total > l)
            System.out.println(l+" es abundante");
       
       
    }
    
}
