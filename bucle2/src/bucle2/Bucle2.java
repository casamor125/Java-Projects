/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle2;

/**
 *
 * @author bielc
 */
public class Bucle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       /* LT lector = new LT();
        int r = lector.leerEntero();        
        int n ;
        int total = 1 ;
       
        for(n=r;n>0;n--){
        total = n*total;
            System.out.println(n);
        }
        System.out.println(total);

       LT lector = new LT();
       int n ;
       int suma = 0;
       do{
       n=  lector.leerEntero();
       suma = n + suma;
       }
        while(n!=0);
        System.out.println(suma);

       LT lector= new LT();
       int n ;
       int countimp=0;
       int countpar=0;
       //do{
       n= lector.leerEntero();
            while(n!=0){
                  System.out.print(n+" ");
           if(n%2==0){
            countpar++;
               System.out.println("és parell");}
           else{System.out.println("és imparell");
            countimp++;}
               n = lector.leerEntero();
       }
            System.out.println("numero de pares ="+countpar);
            System.out.println("numero de impares ="+countimp);
          */
       LT lector = new LT();
       int n = lector.leerEntero();
       int r = 0 ;
       while(r<=n){
       r++;
       if(n%r==0){
           System.out.print(r+" ");}
       }
        System.out.print("són divisors de "+n+" ");
    }
       
}
