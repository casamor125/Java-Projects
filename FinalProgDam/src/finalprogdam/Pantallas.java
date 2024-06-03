/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprogdam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

/**
 * 
 * @author bielc
 * Esta clase pantallas la usaremos para implementar un menu principal
 * con dos botones que nos llevaran a las cuatro tablas principales
 * de nuestra base de datos
 */
public class Pantallas extends JFrame implements ActionListener{
    private JButton cocinero , critica , plato , restaurante;
    
  JFrame ventanaCocineros = new Cocineros();
  JFrame ventanaCriticas = new Criticas();
  JFrame ventanaPlatos = new Platos();
  JFrame ventanaRestaurantes = new Restaurantes();

    public Pantallas() throws SQLException{
    
     setTitle("Final Prog Dam");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null);

        critica = new JButton("Ver Criticas");
        critica.addActionListener(this);
        plato = new JButton("Ver Platos");
        plato.addActionListener(this);
        restaurante = new JButton("Ver Restaurantes");
        restaurante.addActionListener(this);
        cocinero = new JButton("Ver Cocineros");
        cocinero.addActionListener(this);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2)); 

        
        panel.add(cocinero);
        panel.add(plato);
        panel.add(critica);
        panel.add(restaurante);


        // Agregar panel a la ventana
        add(panel);
         
        
    }
    /**
     * 
     * @param e 
     * en este action listener dependiendo de que boton haya sido clicado
     * se gestiona el abrir la ventana que muestra una tabla o otra
     */

    @Override
        public void actionPerformed(ActionEvent e) {
        
          if (e.getSource() == cocinero) {
            if (!ventanaCocineros.isVisible()) {
                ventanaCocineros.setVisible(true);
            }
        } else if (e.getSource() == critica) {
            if (!ventanaCriticas.isVisible()) {
                ventanaCriticas.setVisible(true);
            }
        } else if (e.getSource() == plato) {
            if (!ventanaPlatos.isVisible()) {
                ventanaPlatos.setVisible(true);
            }
        } else if (e.getSource() == restaurante) {
            if (!ventanaRestaurantes.isVisible()) {
                ventanaRestaurantes.setVisible(true);
            }
        }
       }
}
