/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trataerroresfact;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bielc
 */
public class TrataErroresFact {

    /**
     * @param args the command line arguments
     */
    LT lector = new LT();

    public static void main(String[] args) {
        TrataErroresFact MetodoPrincipal = new TrataErroresFact();
        MetodoPrincipal.MetodoPrincipal();
    }

    public void MetodoPrincipal() {

        int opcion;
        Menu();
        opcion = lector.leerEntero();
        while (opcion != 2) {
            if (opcion == 1) {
                try {
                    Factorial();
                } catch (MiExcepcion ex) {
                    Logger.getLogger(TrataErroresFact.class.getName()).log(Level.SEVERE, null, ex);
                }
                Menu();
            } else {
                System.out.println("elija una opcion correcta por favor");
                Menu();
            }
            opcion = lector.leerEntero();

        }
    }

    public void Menu() {

        System.out.println("Elija una opcion:");
        System.out.println("1-Calcular un factorial");
        System.out.println("2-Finalizar Programa");

    }

    public void Factorial() throws MiExcepcion {

        int resultado = 1;
        int numero;

        System.out.println("Introduzca un numero entre el 0 y el 12");
        System.out.println("y calcularemos su factorial");
        numero = lector.leerEntero();
        if (numero >= 13) {
            throw new MiExcepcion("numero fuera de rango");
        } else if (numero == 0) {
            resultado = 1;
        } else {
            for (int i = 1; i <= numero; i++) {

                resultado = resultado * i;
            }

        }
        System.out.println("el factorial de su numero = " + resultado);

    }

    class MiExcepcion extends Exception {

        public MiExcepcion() {
        }

        public MiExcepcion(String msj) {
            System.out.println(msj);
        }
    }

}
