/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recorridobusqueda;

/**
 *
 * @author bielc
 */
public class RecorridoBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        LT lector = new LT();
        char letra = lector.leerCaracter();
        int as = 0 ;
        int es = 0 ;
        int is = 0 ;
        int os = 0 ;
        int us = 0 ;
            while(letra != '.'){
                if(letra =='a'){
                as++;}
                else if (letra == 'e'){
                es++;}
                else if (letra == 'i'){
                is++;}
                else if (letra == 'o'){
                os++;}
                else if (letra == 'u'){
                us++;}
                    letra = lector.leerCaracter();
        }
            System.out.println("has esctrito "+as+" a");
            System.out.println("has esctrito "+es+" e");
            System.out.println("has esctrito "+is+" i");
            System.out.println("has esctrito "+os+" o");
            System.out.println("has esctrito "+us+" u");

        LT lector = new LT();
        char letra = lector.leerCaracter();
        int mayor = 0;
         while(letra != '.'){
             if(letra> mayor){
             mayor = letra;
             }
             letra = lector.leerCaracter();
         }
         System.out.println("el valor ascii més gran és "+(char)mayor);
*/
        LT lector = new LT();
        char letra = lector.leerCaracter();
        
        
            while((letra != '.') && !((letra == 'a')||(letra == 'e')||
                    (letra == 'i')||(letra == 'o')||(letra == 'u'))){
                                                
                    letra = lector.leerCaracter();
                    
             
                    }
            if((letra =='a')||(letra == 'e')||(letra == 'i')||(letra == 'o')||(letra == 'u')){
                     System.out.println("la primera vocal es una "+letra);
                             letra = lector.leerCaracter();;
                             System.out.println("y la letra de despues es una "+letra);
            }
            else{
                System.out.println("no hay vocales");}
                         
            
           
            
                               
        }
    }
    

