import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Panel {
    //declaración método main
    public static void main(String[] args) { 
        new Panel().metodoPrincipal();
    }
    
    //declaración método metodoPrncipal
    public void metodoPrincipal() {  
        //DECLARACIÓN Y DEFINICIÓN CONTENEDOR JFrame
        JFrame ventana = new JFrame("VISUALIZADOR IMAGEN");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //DECLARACIÓN PANEL JContentPane DEL CONTENEDOR JFrame ventana
        Container panelContenidos=ventana.getContentPane();    

        //DECLARACIÓN COMPONENTE DE VISUALIZACIÓN      
        panelImagen visualizador=new panelImagen("Punpun.jfif");
        
        //introducción componente JComponent visualizador en el visualizador de contenidos 
        //del contenedor JFrame
        panelContenidos.add(visualizador);
        
        //ajuste dimensión contenedor JFrame ventana 
        ventana.setSize(312,340);

        //activar el cierre interactivo del contenedor ventana para finalizar
        //ejecución
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //activar visualización contenedor ventana
        ventana.setVisible(true);
    }
    
    private class panelImagen extends JComponent {
        private Image imagen;

        public panelImagen(String nombre) {
            imagen = Toolkit.getDefaultToolkit().getImage(nombre);
        }

        @Override
        public void paintComponent(Graphics g) {            
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(imagen,0,0,this);
        }    

        //La componente decide su tamaño en función de la dimensión de
        //imagen
        @Override
        public Dimension getPreferredSize() {
            if (imagen == null) {
                return new Dimension(200, 200);
            } else {
                return new Dimension(imagen.getWidth(this), imagen.getHeight(this));
            }
        }
    }    
}
