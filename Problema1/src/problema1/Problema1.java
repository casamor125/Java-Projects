/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author bielc
 */
public class Problema1 {

     
    public static void main(String[] args) {
     /*
        double a = 4 ;
        
        
        
         if(a>0){
             System.out.println("es positiu");}
          if (a>=-1 && a <= 1){
             System.out.println("el numero està entre -1 y 1");}
            if (a == 0){
             System.out.println("a 0 ");}
                if (a!=0){
             System.out.println("a es diferent de zero");}
                     
                 
        int b = 4;
        int c = 2;
    
    if (b % c == 0){
            System.out.println("es multiplo");}
        else {
            System.out.println("no es multiplo");}
    // en los else if, lo comprobado anteriormente no hace falta volver a comprobarlo
    //if(a>= 0 && a <=4.9) else if (a<=6.9)no hace falta poner el a >4.9 pq al entrar en el else if ya sabemos que lo es 
   */
    LT lector = new LT();
    int input = lector.leerEntero();
    
    boolean es_parell = (input % 2 == 0);
        System.out.println(es_parell);
    }
}
     
                
    
    

