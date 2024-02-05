/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentaespacios;

/**
 *
 * @author bielc
 */
public class CuentaEspacios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LT lector = new LT();
        char l = lector.leerCaracter();
        int contador = 0 ;
        while((l !='.')&&(l!='t')&&(l != 'T')){
        l = lector.leerCaracter();
        }
        
        l = lector.leerCaracter();
        
        while(l !='.'){
        
            if(l == ' '){
                contador++;
                }
           
            
            l = lector.leerCaracter();
        }
        if (contador == 0){
            System.out.println("no hay espacios");
        }
        System.out.println("numero de espacios es igual a "+contador);
        
    }
    
           
}
