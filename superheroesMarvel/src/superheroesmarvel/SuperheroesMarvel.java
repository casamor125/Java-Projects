/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superheroesmarvel;

/**
 *
 * @author bielc
 */
public class SuperheroesMarvel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Inicializamos nuestra coleccion de heroes:
        Coleccion marvel = crearColeccionMarvel();
        
        //Pintamos todos los Superheroes de nuestra coleccion:
        marvel.pintarInfColeccion();
        
        //Per fer:
        //Crida a un metode dins Coleccio, que pinti amb un println()
        //quina es la major força dins la nostra coleccio
        
        //Per fer:
        //Crida a un metode dins Coleccio, que pinti amb un println()
        //quin es el superheroe amb major vida i quin valor te vida
        
        //Per fer: 
        //Crida a un metode dins Coleccio, que retorni amb un return 
        //quantes cartes "legendaria" hi ha a la nostra coleccio
        //Guarda el valor dins la variable nLegen
        int nLegen = 0;
        
    }
    
    /**
     * Inicializa nuestra coleccion de superheroes de marvel
     * @return 
     */
    public static Coleccion crearColeccionMarvel(){
        //Creamos los Superheroes:
        Superheroe spiderman = new Superheroe();
        spiderman.nombre = "Spiderman";
        spiderman.descripcion = "Tu amigo y vecino Spiderman";
        spiderman.vida = 7;
        spiderman.fuerza = 5;
        String[] habilidadesSpiderman = {"Sentido arácnido", "Telarañas"};
        spiderman.habilidades = habilidadesSpiderman;

        Superheroe ironman = new Superheroe("Ironman", 7, 7);
        ironman.descripcion = "Tecnologia Stark";
        ironman.rareza = "epico";
        ironman.habilidades = new String[]{"Volar", "Super fuerza"};
        
        Superheroe thor = new Superheroe("Thor", 7, 8);
        thor.descripcion = "Thor, hijo de Odín";
        thor.rareza = "legendario";
        thor.habilidades = new String[]{"Volar", "Super fuerza", "Martillo"};
        
        //Creamos la Coleccion con los superheroes anteriores:
        Coleccion coleccion = new Coleccion();
        coleccion.superheroes = new Superheroe[]{spiderman, ironman, thor};
        return coleccion;
    }
    
}