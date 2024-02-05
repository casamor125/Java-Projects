/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos1;

/**
 *
 * @author bielc
 */
public class Objetos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fuerza = 8 ;
        int salud = 6;
        String nombre = "peter";
        Cartas c = new Cartas( fuerza,salud,nombre);
        c.setPropietario("yo");
        System.out.println(c.getPropietario());
        c.getfuerza(5);
        c.getfuerza(3);
        c.getfuerza(7);
        System.out.println(c.fuerzamayor());
        
    }
    
}
