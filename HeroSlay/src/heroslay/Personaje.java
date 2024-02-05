/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroslay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class Personaje {

    Scanner sc = new Scanner(System.in);
    Random rm = new Random();
    public String nombre;
    public int vida;
    public List<Carta> CartasMazo;
    public boolean aturdido;
    int primera;
    int segunda;

    public Personaje(String nombre) {
        CartasMazo = new ArrayList<>();
        this.aturdido = false;
        this.vida = 100;
        this.nombre = nombre;
    }

    public boolean isAturdido(Personaje p) {
        if (p.aturdido == true) {
            return true;
        } else {
            return false;
        }

    }

    public void AddMazo(Carta c1, Carta c2, Carta c3,
            Carta c4, Carta c5, Carta c6) {
        CartasMazo.add(c1);
        CartasMazo.add(c2);
        CartasMazo.add(c3);
        CartasMazo.add(c4);
        CartasMazo.add(c5);
        CartasMazo.add(c6);

    }

    public void ShowMazo() {

        primera = rm.nextInt(CartasMazo.size() - 1);
        segunda = rm.nextInt(CartasMazo.size() - 1);
        while (primera == segunda) {
            segunda = rm.nextInt(CartasMazo.size() - 1);
        }

        System.out.println("Cartas:");
        System.out.println("-1 " + CartasMazo.get(primera).Nombre + " Tipo: "
                + CartasMazo.get(primera).tipo + " Daño: "
                + CartasMazo.get(primera).daño);
        System.out.println("-2 " + CartasMazo.get(segunda).Nombre + " Tipo: "
                + CartasMazo.get(segunda).tipo + " Daño: "
                + CartasMazo.get(segunda).daño);

    }

    public boolean isAturdido() {
        return aturdido;
    }

    public void elegir(Personaje v) {
        System.out.println("elige que carta usar:");
        int decision;
        decision = sc.nextInt();

        switch (decision) {
            case 1:
                System.out.println("Usaste "+CartasMazo.get(primera).Nombre);
                if (CartasMazo.get(primera).tipo == CartaTipo.CURACION) {
                    this.vida = this.vida + CartasMazo.get(primera).daño;
                } else {
                    v.vida = v.vida - CartasMazo.get(primera).daño;
                }
                if (CartasMazo.get(primera).tipo == CartaTipo.ATURDIR) {
                    v.aturdido = true;
                }
                break;
            case 2:
                System.out.println("Usaste "+CartasMazo.get(segunda).Nombre);
                if (CartasMazo.get(segunda).tipo == CartaTipo.CURACION) {
                    this.vida = this.vida + CartasMazo.get(segunda).daño;
                } else {
                    v.vida = v.vida - CartasMazo.get(segunda).daño;
                }
                if (CartasMazo.get(segunda).tipo == CartaTipo.ATURDIR) {
                    v.aturdido = true;
                }

                break;

            default:
            // Código a ejecutar si ninguno de los casos anteriores coincide con el valor de expresion
        }

    }

    public void ResetAturdido() {
        this.aturdido = false;
    }

    public void VillanoJuega(Personaje h) {

        int cartaJugada = rm.nextInt(CartasMazo.size() - 1);
        System.out.println("Bad-minton uso "+CartasMazo.get(cartaJugada).Nombre);
        if (CartasMazo.get(cartaJugada).tipo == CartaTipo.CURACION) {
                    this.vida = this.vida + CartasMazo.get(cartaJugada).daño;
                } else {
                    h.vida = h.vida - CartasMazo.get(cartaJugada).daño;
                }
        if (CartasMazo.get(cartaJugada).tipo == CartaTipo.ATURDIR) {
            h.aturdido = true;
        }

    }
}
