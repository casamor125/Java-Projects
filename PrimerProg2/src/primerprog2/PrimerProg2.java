/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerprog2;

/**
 *
 * @author bielc
 */
public class PrimerProg2 {

    public static void main(String[] args) {
        LT lector = new LT();
        int numerador, denominador, resultado;
        try {
            System.out.println("Introduce un numerador");
            numerador = lector.leerEntero();
            System.out.println("introduce denominador");
            denominador = lector.leerEntero();
            System.out.println("");
        } catch (ArithmeticException error) {
            System.out.println("no se da la division ya que el denominador = 0");
        } catch (NumberFormatException error) {
            System.out.println("los datos introducidos deben ser numeros enteros");
        } catch (Exception error) {
            System.out.println("error"+error.toString());
        }
        //Si
    }
    
}
