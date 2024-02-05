/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprog1;

import java.util.Scanner;

/**
 * Primer examen de Programación - DAM
 *
 * @autor Gabriel Casamor
 * @fecha 26/10/2023
 */
public class ExamenProg1 {

    /* No tocar este método */
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("-1r Examen de programación 2023/24-");
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 1: ");
        ejercicio1();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 2: ");
        ejercicio2();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 3: ");
        ejercicio3();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 4: ");
        ejercicio4();
    }

    /**
     * Enunciado: Calcula el Area de un cuadrado equilátero a partir de uno de
     * sus lados. ** Nota: Puedes definir el valor del lado como una variable
     * (no usar Scanner). Nota: Se debe utilizar System.out.print para notificar
     * al usuario. Nota: Ejercicio de clase.
     */
    private static void ejercicio1() {
        // Escribe aqui el codigo del ejercicio 1

        int lado = 5;//introducir lo que mide el lado
        System.out.println("El area del cuadrado es: " + lado * lado);

    }

    /**
     * Enunciado: Queremos saber la nota final de un alumno Además, queremos
     * saber si aprobará o no la asignatura El alumno posee 3 notas: Nota del 1r
     * examen 25%, nota del 2o examen 25% i nota de la práctica 50% Si la media
     * del alumno es superior a 4.5, el alumno estará aprobado. ** Nota: Puedes
     * definir las 3 notas como variables (no usar Scanner). Nota: Se debe
     * utilizar System.out.print para notificar al usuario.
     */
    private static void ejercicio2() {
        // Escribe aqui el codigo del ejercicio 2

        Double Primero = 10.0;
        Double Segundo = 10.0;
        Double Tercero = 10.0;
        
        Double media = (Primero * 0.25 + Segundo * 0.25 + Tercero * 0.5);
        if (media >= 4.5) {
            System.out.println("La media esta aprovada.");
            System.out.println("Y su media es = " + media);

        } else {
            System.out.println("La media esta suspendida.");
            System.out.println("Y su media es = " + media);

        }

    }

    /**
     * Enunciado: Crear un contador del 0 al 20, pero que este cuente de 2 en 2
     * Ejemplo: 0, 2, 4, 6, 8, 10, 12, ... ** Pista: Utilizar un bucle while() o
     * for().
     */
    private static void ejercicio3() {
        // Escribe aqui el codigo del ejercicio 3
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }

    }

    /**
     * Enunciado: Queremos que a partir de una frase, se cuenten las vocales que
     * contiene Ejemplo: "Hola mundo" - Posee 4 vocales. ** Nota: Definir un
     * String con la frase a utilizar (no usar Scanner). Utilizar la función
     * .toCharArray(); para convertir el String a un char[] Pista: Iterar cada
     * char del array para detectar cuantas vocales hay.
     */
    private static void ejercicio4() {
        // Escribe aqui el codigo del ejercicio 4
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        int cont = 0;
        char[] a = frase.toCharArray();

        for (int i = 0; i != a.length; i++) {

            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

                cont++;
            }

        }
        System.out.println("El numero de vocals es = " + cont);

    }

}
