/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioobjetos;

import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class Objetos {
    
  private int precio;
  private String nombre;
  public String todo;
  
    public String objeto(String nombre, int precio){
    this.nombre = nombre;
    this.precio = precio;
    todo =("el nombre es "+nombre+" y el precio: "+precio);
    return todo;
    }
    
    
    public int[] multiplicar(int[] array){
        int cont = 0;
        while(cont<array.length){
            if(array[cont]%2==0){
        array[cont] = array[cont]*2;
            }
        cont++;
        }
    
    return array;
    }
}
