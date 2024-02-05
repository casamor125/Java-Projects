/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letrasrn;

import java.util.Random;

/**
 *
 * @author bielc
 */
public class Letrasrn {
    private void letras(){
    char c;
    c =(char) ('A' + ((new Random()).nextInt('Z'-'A' + 1)));
    System.out.println(c);
    
    }
    public static void main(String[] args) {
        (new Letrasrn()).letras();
        
    }
    
}
