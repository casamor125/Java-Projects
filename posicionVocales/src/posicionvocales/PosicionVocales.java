/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posicionvocales;

/**
 *
 * @author bielc
 */
public class PosicionVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LT lector = new LT();
        char l = lector.leerCaracter();
        int cont = 1;
        int conta = 0;
        int conte = 0;
        int conti = 0;
        int conto = 0;
        int contu = 0;

        while (l != '.') {

            if (l == 'a' && conta == 0) {
                conta = cont;
            } else if (l == 'e' && conte == 0) {
                conte = cont;
            } else if (l == 'i' && conte == 0) {
                conti = cont;
            } else if (l == 'o' && conte == 0) {
                conto = cont;
            } else if (l == 'u' && conte == 0) {
                contu = cont;
            }
            cont++;
            l = lector.leerCaracter();
        }

        if (conta > 0) {
            System.out.println("La primera a està a la posició " + conta);
        } else {
            System.out.println("No se ha encontrado ninguna a");
        }
        if (conte > 0) {
            System.out.println("La primera e està a la posició " + conte);
        } else {
            System.out.println("No se ha encontrado ninguna e");
        }
        if (conti > 0) {
            System.out.println("La primera i està a la posició " + conti);
        } else {
            System.out.println("No se ha encontrado ninguna i");
        }
        if (conto > 0) {
            System.out.println("La primera o està a la posició " + conto);
        } else {
            System.out.println("No se ha encontrado ninguna o");
        }
        if (contu > 0) {
            System.out.println("La primera u està a la posició " + contu);
        } else {
            System.out.println("No se ha encontrado ninguna u");
        }

    }

}
