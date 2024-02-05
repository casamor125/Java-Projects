/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneda;

import java.util.Random;

/**
 *
 * @author mascport
 */
public class Moneda {

    private void inicio() {
        int vegades = numVegades(20, 50000);
        int resultats[] = new int[vegades];
        ferJugades(resultats);
        if (hiHaQuatreCaresSeguides(resultats)) {
            System.out.println("Hi ha quatre cares o més seguides!");
        } else {
            System.out.println("No hi ha quatre cares o més seguides!");
        }
    }

    public int numVegades(int a, int b) {
        Random ran = new Random();
        int res = ran.nextInt((b - a + 1)) + a;
        System.out.print("De entre " + a + " i " + b + " vegades, ");
        System.out.println("vaig a fer-ne " + res);
        return res;
    }

    public void ferJugades(int r[]) {
        Random ran = new Random();
        for (int i = 0; i < r.length; i++) {
            r[i] = ran.nextInt(2);
        }
    }

    public boolean hiHaQuatreCaresSeguides(int r[]) {
        int cont = 0;
        boolean res = false;
        for (int i = 0; (i < r.length) && (!res); i++) {
            if (r[i] == 0) {
                cont++;
            } else {
                cont = 0;
            }
            if (cont == 40) {
                res = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        (new Moneda()).inicio();
    }

}

