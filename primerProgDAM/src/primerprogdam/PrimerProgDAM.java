/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerprogdam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bielc
 */
public class PrimerProgDAM {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String entrada;
        String okaay = "okaay";
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    entrada = buffer.readLine();
    
    if (entrada == okaay){
        System.out.println("Vale");
    
    }else{
        System.out.println("not okaay");
    }
    }
    
}
