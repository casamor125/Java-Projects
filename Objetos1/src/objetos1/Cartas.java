/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos1;

/**
 *
 * @author bielc
 */
public class Cartas {
    public int[] fuerza;
    private int salud;
    private String nombre;
    private String propietario;
    int[] cartas ;
    int i = 0;
    
    public Cartas(int f , int s , String n){
    
     this.fuerza = new int[10];
     this.salud = s;
     this.nombre = n;
        System.out.println("puntos fuerza = "+f+"puntos salud = "+s+" nombre: "+n);
    }
    
    public void setPropietario(String n){
    
    this.propietario = n;
        System.out.println(propietario);
    }
    public String getPropietario(){
    
    return propietario;
    }
    public void getfuerza(int f){
    fuerza[i]= f;
      i++;
    }
    public int fuerzamayor(){
    int cont = 0;
    int fuerzamayor = 0;
        while(cont<=fuerza.length-1 ){
        
            if(fuerza[cont]>fuerzamayor){
                fuerzamayor = fuerza[cont];
            }
        cont++;
        }
    return fuerzamayor;
    
    }
}
