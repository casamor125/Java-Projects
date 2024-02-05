/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptar;

/**
 *
 * @author bielc
 */
public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private boolean esEncriptada;
    
    public Usuario(String nombre, String email,String contraseña){
    
    this.nombre = nombre;
    this.email = email;
    this.contraseña = contraseña;
    
    }
    public void Encriptar(){
        char[] encriptada;
        encriptada = this.contraseña.toCharArray();
        int valorAscii;
        for (int i = 0; i < encriptada.length; i++) {
           
            valorAscii = (int)encriptada[i]+5;
            encriptada[i] = (char) valorAscii;
            System.out.println(encriptada[i]);
            
        }
        this.contraseña = String.valueOf(encriptada);
        esEncriptada = true;
    }
    
    public void DesEncriptar(){
        char[] encriptada;
        encriptada = this.contraseña.toCharArray();
        int valorAscii;
        for (int i = 0; i < encriptada.length; i++) {
            
            valorAscii = (int)encriptada[i]-5;
            encriptada[i] = (char) valorAscii;
            System.out.println(encriptada[i]);
            
        }
        esEncriptada = false;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEsEncriptada(boolean esEncriptada) {
        this.esEncriptada = esEncriptada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean isEsEncriptada() {
        return esEncriptada;
    }
}
