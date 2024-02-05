/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerdiadam;

import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class PrimerDiaDAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        char[] array  = {'a','b','c'};
        char[] a = new char[5];
        

//        System.out.println("De que quieres calcular el area :");
//        System.out.println("Pentagono(introduzca 1)");
//        System.out.println("Cuadrado(introduzca 2)");
//        System.out.println("Triangulo(introduzca 3)");
//
//        int a = sc.nextInt();
//
//        switch (a) {
//            case 1:
//                Pentagono();
//                break;
//            case 2:
//                Cuadrado();
//                break;
//            case 3:
//                Triangulo();
//                break;
//            default:
//                System.out.println("Error no has elegido ninguna opcion");
//
//        }

    }

    public static void Pentagono() {
        Scanner sc = new Scanner(System.in);
        int base;
        int apotema;
        System.out.println("Quieres calcular el area de un pentagono");
        System.out.println("introduzca uno de los lados: ");
        base = sc.nextInt();
        System.out.println("introduzca el apotema:");
        apotema = sc.nextInt();

        float area = (5 * base * apotema) / 2;
        System.out.println("El area del pentagono es = ");
    }

    public static void Triangulo() {
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;
        System.out.println("Quieres calcular el area de un Cuadrado");
        System.out.println("introduzca uno de los lados: ");
        base = sc.nextInt();
        System.out.println("introduzca el altura del trianngulo:");
        altura = sc.nextInt();

        float area = (base * altura) / 2;
        System.out.println("El area del triangulo es = " + area);

    }

    public static void Cuadrado() {
        Scanner sc = new Scanner(System.in);
        int base;
        System.out.println("Quieres calcular el area de un Cuadrado");
        System.out.println("introduzca uno de los lados");
        base = sc.nextInt();

        float area = base * base;
        System.out.println("el area del cuadrado es = " + area);
    }
}
