/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamificacio1;

/**
 *
 * @author bielc
 */
public class Gamificacio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //el programa principal lo he usado para hacer el menu
            System.out.println("------------------------------------");
            System.out.println("Eligeix Programa (si has acabat pitja '.')");
            System.out.println("-EjercisiA (pitja A/a)");
            System.out.println("-EjercisiB (pitja B/b)");
            System.out.println("------------------------------------");
            
        LT lector = new LT();    
        //Para el menu he usado un while por si el usuario no introduce lo esperado
        //Dentro del while hay unos IF que dependiendo de el ejercicio que elijas 
        //Inicializa el ejercicioA o el ejercicioB
        //Aparte tiene un println para cuando acabe los ejercicios
        char l = lector.leerCaracter();
        while(l != '.'){                        
        if((l == 'A')||(l =='a')){              
            EjercicioA A = new EjercicioA();
            A.inicioA();
            System.out.println("Torna a triar programa(o si has acabat pitja '.')");
        }
        else if((l == 'B')||(l =='b')){
        EjercicioB B =new EjercicioB();
            B.inicioB();
            System.out.println("Torna a triar programa(o si has acabat pitja '.')");
        }
        else{
            System.out.println("Perfavor tria un projecte");
        }
       l = lector.leerCaracter();
            }
    }
    
}
