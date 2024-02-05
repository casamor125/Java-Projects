/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeralista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author bielc
 */
public class PrimeraLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List <String> listadias = new ArrayList<>(Arrays.asList("Lunes","Martes",
               "Miercoles","jueves","viernes","sabado","domingo"));
       listadias.add(4, "juernes");
       List <String> listaDos = List.copyOf(listadias);
       listadias.addAll(listaDos);
       System.out.println("posicion3 "+listadias.get(3)+" posicion 4 " + listadias.get(4));
        System.out.println("posicion 0 "+listadias.get(0)+" ultima posicion "+listadias.get(listadias.size()-1));
        listadias.remove("juernes");
        System.out.println("aqui estaba juernes pero ahora esta "+listadias.get(4));
        System.out.println("Valores de la lista:");
        for (String dia :listadias) {
            System.out.println(dia);
        }
        if(listadias.contains("Lunes")){
            System.out.println("si que hay un elemento lunes");
        }
        for (String dia :listadias) {
           if( dia.equalsIgnoreCase("lunes")){
               System.out.println("si que hay elementos lunes");
           }
            
        }
        Collections.reverse(listadias);
        System.out.println(listadias);
        listadias.sort(c);
        System.out.println(listadias);
        
        
        
        
    }
    
}
