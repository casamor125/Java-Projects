/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamificacio1;

/**
 *
 * @author bielc
 */
public class EjercicioA {
    public void inicioA(){
        
        
    int mayor = 0;
    // variable que guardara el mayor valor ascii
    int menor = 123;
    // valor que guardará el menor valor ascii
    //122 es la z asi que le he puesto un valor mas para que el char siempre sea menor
    int diferencia ;
    // int donde se guardara la diferencia entre los valores
    LT lector = new LT();
        //println que nos dicen que hacer
        System.out.println("Introdueix una serie de caràcters acabada en '.'");
        System.out.println("El programa dirà el caràcter amb posició major i ");
        System.out.println("el de posició menor segons la tabla ASCII "); 
        System.out.println("a més dirà la diferència entre aquests.");
    //un while el cual mira si el valor es mayor al guardado en mayor
    //o menor al guardado en menor usando dos IFs diferentes ya que si es con else if hay casos en los que da mal
    char l = lector.leerCaracter(); 
    while(l!='.'){
    if(l<menor){
        menor = l;
    }
    if(l>mayor){
        mayor = l ;
    }
    l = lector.leerCaracter();
    }
    //una vez salimos del while calculamos la variable diferencia restando el menor valor al mayor
    // y despues imrimimos por pantalla el resultado
        diferencia = mayor-menor;
        System.out.println("Mayor = "+(char)mayor+" Menor = "+(char)menor);
        System.out.println("La diferencia entre aquets es = "+diferencia);
    }
}