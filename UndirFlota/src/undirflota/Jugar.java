/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undirflota;

import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class Jugar {

    boolean[][] tablero = {
        {false, false, false, false, false},
        {false, false, false, true, false},
        {false, false, true, false, false},
        {false, false, false, false, false},
        {false, true, false, false, false}
    };
    int barcos = 3;
    int municion = 5;

    public void Partida() {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;

        while (barcos > 0 && municion > 0) {
            System.out.println("introduce la cordenada vertical");
            i = sc.nextInt();
            System.out.println("introduce la cordenada horizontal");
            j = sc.nextInt();
                        
            if (tablero[i][j] == true) {
                tablero[i][j] = false;
                barcos--;
                municion--;
                System.out.println("Fantastico! les has dado cadete ");
                if(barcos==0){
                }else{
                System.out.println("ahora solo te faltan " + barcos);
                }
            } else {
                municion--;
                System.out.println("arggg se nos estan escapando");
                System.out.println("espabila cadete ");
                System.out.println("solo te quedan " + municion + " de municion");

            }

            
        }
        if (barcos > 0) {

            System.out.println("Esos bastardos se nos han escapado");
            System.out.println("No debi dejarte al mando");

        } else {

            System.out.println("Muy bien gracias a ti");
            System.out.println("Hemos conseguido la victoria");
        }
    }

}
