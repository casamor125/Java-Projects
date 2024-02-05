/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testestanteria;

/**
 *
 * @author bielc
 */
public class Llibre {

    private String Titol;
    private String Autor;
    private int Qualificacio;

    public Llibre(String titol, String autor, int cal) {

        this.Titol = titol;
        this.Autor = autor;
        if (cal >= 0 && cal <= 10) {
            this.Qualificacio = cal;
        } else {
            this.Qualificacio = 0;
            System.out.println("Error la qualificació ha de estar entre "
                    + "els valors 0 y 10");
            System.out.println("Qualificació donada de manera automatica = 0");
        }
    }

    public String getTitol() {
        return Titol;
    }

    public String getAutor() {
        return Autor;
    }

    public int getQualificacio() {
        return Qualificacio;
    }

    public void setTitol(String titol) {
        this.Titol = titol;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public void setQualificacio(int cal) {
        if (cal >= 0 && cal <= 10) {
            this.Qualificacio = cal;
        } else {
            this.Qualificacio = 0;
            System.out.println("Error la qualificació ha de estar entre "
                    + "els valors 0 y 10");
            System.out.println("Qualificació donada de manera automatica = 0");
        }
    }
    public String pintarInfo(){
        String info;
        info = "Titol;"+this.Titol+", Autor;"+this.Autor+", Qualificació;"+this.Qualificacio;
        return info;
    }

}
