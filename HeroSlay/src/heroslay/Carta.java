/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroslay;

/**
 *
 * @author bielc
 */
public class Carta {
    
        
    public String Nombre;
    public int daño;
    CartaTipo tipo;
    
    public Carta(String nombre, int daño, CartaTipo tipo){
    
        this.Nombre = nombre;
        this.daño = daño;
        this.tipo = tipo;
        
    }        
    
    
}
