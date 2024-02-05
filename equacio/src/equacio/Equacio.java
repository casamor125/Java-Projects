/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equacio;

/**
 *
 * @author bielc
 */
public class Equacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Double x;
        Double y;

            LT tec = new LT();
            System.out.print("introduir valor de la Y:");
            y = tec.llegirReal();
            
             System.out.print("introduir valor de la X:");
            x = tec.llegirReal();
            
                System.out.println(-y/x);
    }
    
}
