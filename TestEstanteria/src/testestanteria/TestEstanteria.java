package testestanteria;


/**
 *
 * @author bielc
 */
public class TestEstanteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estanteria e = new Estanteria();
        Llibre L1 = new Llibre("asi es la puta vida","Jordi el salvaje", 8);
        Llibre L2 = new Llibre("asi es la puta vida 2","Jordi el salvaje", 7);
        e.AfegirLlibre(L1);
        e.AfegirLlibre(L2);
        e.MostrarEstanteria();
        Llibre L3 = new Llibre("Berserk","Libreria pio baroja", 10);
        Llibre L4 = new Llibre("Una pieza","Goda", 10);
        Llibre L5 = new Llibre("memorias de idhun","Laura torres", 9);
        e.AfegirLlibre(L3);
        e.AfegirLlibre(L4);
        e.AfegirLlibre(L5);
        e.Top10();
        e.EliminarLlibreAutor("Libreria pio baroja");
        e.MostrarEstanteria();
        
    }
    
}
