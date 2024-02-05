/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamificacio1;

/**
 *
 * @author bielc
 */
public class EjercicioB {
    
    public void inicioB(){
     LT lector= new LT();
     //las variables son double por que se trata con numeros con decimales
     double ahorro = 0;
     //variable ahorro donde iremos sumando todos los ahorros individuales para calcular el total
     double rebajado;
     // variable que muestra el precio rebajado
     double diferencia;
     // variable que muestra el ahorro individual(de cada precio por separado)
     //prints que indican que hace el programa
        System.out.println("Introduieix una seqüència de preus i el seguent programa");
        System.out.println("li mostrará el preu amb un descompte equivalent al IVA");
        System.out.println("Per acabar la seqüència introdueix un '0' o un numero negatiu");
        System.out.println("tot seguit el programa te mostrará el que has estalviat en total.");
        
        //El ejercicio lo trataremos con un while hasta introducirse un 0 o un numero negativo
        //este while nos calculara el precio con el descuento aplicado(rebajado = l(numero leido)/1.21)
        //el ahorro individual calculando la diferencia entre el precio normal y el rebajado l(numero leido)-rebajado
        //y nos ira sumando el ahorro total ahorro = ahorro+diferencia
        
     double l = lector.leerReal();
       while((l>0)){
           
           rebajado = l/1.21;
           diferencia = l-rebajado;
           ahorro = ahorro+diferencia;
           System.out.println(rebajado);
           
       l = lector.leerReal();
       }
       //println que nos muestra el ahorro total con la variable ahorro
        System.out.println("Has estalviat un total de "+ ahorro);
    }
   
    
}
