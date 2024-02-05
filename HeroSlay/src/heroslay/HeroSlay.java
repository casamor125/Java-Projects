/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heroslay;

/**
 *
 * @author bielc
 */
public class HeroSlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Personaje h = new Personaje("good-minton");
        Personaje v = new Personaje("Bad-minton");
        Metodos m = new Metodos();

        Carta c1 = new Carta("Bola De Fuego", 33, CartaTipo.ATAQUE);
        Carta c2 = new Carta("Golpe de Karate", 10, CartaTipo.ATURDIR);
        Carta c3 = new Carta("Poty", 50, CartaTipo.CURACION);
        Carta c4 = new Carta("tormenta de magma", 66, CartaTipo.ATAQUE);
        Carta c5 = new Carta("paralisis del sueño", 0, CartaTipo.ATURDIR);
        Carta c6 = new Carta("mini-escudo", 25, CartaTipo.CURACION);

        h.AddMazo(c1, c2, c3, c4, c5, c6);
        v.AddMazo(c1, c2, c3, c4, c5, c6);

        boolean Jugador = m.moneda();
        while (h.vida > 0 && v.vida > 0) {
          
            if (Jugador) {
                if (h.isAturdido()) {
                    System.out.println("Estas Aturdidoooo. Te quedas sin jugar");
                    h.ResetAturdido();

                } else {
                    h.ShowMazo();
                    h.elegir(v);
                    

                }

            } else {

                if (v.isAturdido()) {
                    System.out.println("El rival esta aturdido. Aprovecha el turno");
                    v.ResetAturdido();

                } else {
                    
                    v.VillanoJuega(h);

                }

            }
            System.out.println("vida "+h.nombre+": "+h.vida+
                    " vida "+v.nombre+": "+ v.vida );
            Jugador = m.CambioJugador(Jugador);
        }
        if(h.vida>0){
        System.out.println("El bien siempre se alza con la victoria!");
            System.out.println("Good-minton GANA!");
        }else{
            System.out.println("Nunca estuviste a mi altura!");
            System.out.println("Perdiste: Bad-minton Gana");
        }
    }

}
