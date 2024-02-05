/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author bielc
 */
public class InputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new InputStream().MetodoPrincipl();
    }
    public void MetodoPrincipl(){
    try{
    FileInputStream FIS ;
    FIS= new FileInputStream("Fileinputstream1.txt");
    int Fin= -1;
    int lector = FIS.read();
    int resultado = 0;
    while(lector!= Fin){
        
        resultado = (resultado*10)+(lector-(int)'0');
    lector = FIS.read();
    }
        System.out.println(resultado);
    }catch(FileNotFoundException error){
        System.out.println("no se ha encontrado el fichero");
    }
    catch(IOException error){
        System.out.println("problemas para identificar el fichero");
    }
    
    
    }
    
}
