/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author bielc
 */
public class Circulo {
    
    private double radio = 1.0;
    private String color;
    
    
    public Circulo(){
        
}
    public Circulo(double radio){
        this.radio = radio;

}
    public void setColor(String Color){
    this.color = Color;
    }
    public double getRadio (){
        return this.radio;
    }
     public double getArea (){
        return radio*2*Math.PI;
    }
     public String getColor (){
     return this.color;
     }
     
}
