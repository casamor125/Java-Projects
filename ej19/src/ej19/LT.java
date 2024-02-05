/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej19;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LT {

     private char[] leerln() {
         String res = "";
         BufferedReader br = null;
         try {
             br = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
             res = br.readLine();
         } catch (Exception e) {
             e.printStackTrace();
         }
         return res.toCharArray();
     }

     public Integer leerEntero() {
         Integer res = 0;
         try {
             char[] pal = leerln();
             res = Integer.parseInt(new String(pal));
         } catch (Exception e) {
             res = null;
         }
         return res;
     }

     public Double leerReal() {
         Double res = 0.0;
         try {
             char[] pal = leerln();
             res = Double.parseDouble(new String(pal));
         } catch (Exception e) {
             res = null;
         }
         return res;
     }

     public String leerLinea() {
         String res;
             char[] pal = leerln();
             res = new String(pal);
         return res;
     }

     public Character leerCaracter() {
         Character res;
             char[] pal = leerln();
             String s = new String(pal);
             if (s.length()==0) {
                 res = null;
             } else {
                 res = new Character(s.charAt(0));
             }
         return res;
     }
}
