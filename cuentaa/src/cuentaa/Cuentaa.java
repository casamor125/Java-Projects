/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaa;

/**
 *
 * @author bielc
 */
public class Cuentaa {
private void Cuenta(){
    
   LT tec = new LT ();
   Character c;
   int n;
   n = 0;
   System.out.println("introdueix lletras cuan acabis introdueix un '.' y yo te dira cuantes a has posat");
   c = tec.llegirCaracter();
   while(c != '.'){
       if(c == 'a'){
           n++;
   
   }
       c = tec.llegirCaracter();
           }
System.out.println("el nombre de a="+n);
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        (new Cuentaa()).Cuenta();
        
            }
    
}
