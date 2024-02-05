/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testestanteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author bielc
 */
public class Estanteria {

  
    public List<Llibre> LlibresEstanteria;

    public Estanteria() {
          LlibresEstanteria = new ArrayList<>();
    }

    public Estanteria(Llibre libro) {
        LlibresEstanteria = new ArrayList<>();
        if (this.LlibresEstanteria.size() < 10) {
            this.LlibresEstanteria.add(libro);
        } else {
            System.out.println("No hi caben més llibres a aquesta estanteria");
        }

    }

    public void AfegirLlibre(Llibre libro) {
        if(this.LlibresEstanteria.contains(libro)){
            System.out.println("Aquest llibre ya hi es a sa estanteria");
        }else if (this.LlibresEstanteria.size() < 10) {
            this.LlibresEstanteria.add(libro);
        } else {
            System.out.println("No hi caben més llibres a aquesta estanteria");
        }

    }

    public void EliminarLlibreAutor(String autor) {
        
        for (int i = 0; i < this.LlibresEstanteria.size(); i++) {
            if(this.LlibresEstanteria.get(i).getAutor()== autor){
            this.LlibresEstanteria.remove(i);
            }
            
        }
        

    }
    public void EliminarLlibreTitol(String autor) {
        
        for (int i = 0; i < this.LlibresEstanteria.size(); i++) {
            if(this.LlibresEstanteria.get(i).getTitol()== autor){
            this.LlibresEstanteria.remove(i);
            }
            
        }
        

    }

    public void Top10() {

    Collections.sort(LlibresEstanteria, Comparator.comparingDouble(Llibre::getQualificacio).reversed());
        System.out.println("TOP 10");
       for (int i = 0; i < this.LlibresEstanteria.size(); i++) {

            System.out.println("-"+this.LlibresEstanteria.get(i).pintarInfo());
            
        }
       
        
    }

    public void MostrarEstanteria() {
        System.out.println("Estanteria:");
        for (int i = 0; i < this.LlibresEstanteria.size(); i++) {

            System.out.println(this.LlibresEstanteria.get(i).pintarInfo());
            
        }
    }
}
