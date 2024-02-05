/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta2primereslletres;

/**
 *
 * @author bielc
 */
public class MiClase {

    private char[] DosPrimeras = new char[2];
    private char[] frase;
    int Iguals = 0;
    LT lector = new LT();

    public void inicio() {

       // DosLetras();
        DosPrimeras = lector.leerLinea().toCharArray();
        frase = lector.leerLinea().toCharArray();
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == DosPrimeras[0]) {
                if (frase[i + 1] == DosPrimeras[1]) {
                    Iguals++;
                }
            }
        }
        System.out.println("Les dues primeres lletres se repeteixen " + Iguals + " vegades");

    }
/*
    private char[] DosLetras() {
        for (int i = 0; i < 2; i++) {
            DosPrimeras[i] = lector.leerCaracter();
        }
        return DosPrimeras;
    }
*/
}
