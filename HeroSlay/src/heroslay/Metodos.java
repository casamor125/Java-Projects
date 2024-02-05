/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroslay;

import java.util.Random;

/**
 *
 * @author bielc
 */
public class Metodos {
 
    Random rm = new Random();
    int indice;
    
    public boolean moneda() {
        indice = rm.nextInt(2);
        boolean primero;
        if (indice == 0) {
            primero = true;
            System.out.println("Locutor:"
                    + "Tienes ventaja! Empiezas jugando el turno"
                    + ", momento de atacar");
            
        } else {
            primero = false;
            System.out.println("Locutor:"
                    + "Ohh no! El enemigo empieza este turno");
        }
        return primero;

    }
    public boolean CambioJugador(boolean j){
    
    if(j){
    j = false;
    return j;
    }else
        j = true;
    return j;
    
    
    }
}
