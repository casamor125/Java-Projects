package finalprogdam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

/**
 * Esta clase Pantallas la usaremos para implementar un menú principal
 * con dos botones que nos llevarán a las cuatro tablas principales
 * de nuestra base de datos.
 * 
 * @author bielc
 */
public class Pantallas extends JFrame implements ActionListener {
    private JButton cocinero, critica, plato, restaurante;

    JFrame ventanaCocineros = new Cocineros();
    JFrame ventanaCriticas = new Criticas();
    JFrame ventanaPlatos = new Platos();
    JFrame ventanaRestaurantes = new Restaurantes();

    /**
     * Constructor de la clase Pantallas.
     * 
     * @throws SQLException si ocurre un error de acceso a la base de datos.
     */
    public Pantallas() throws SQLException {
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
     * En este action listener, dependiendo de qué botón haya sido clicado,
     * se gestiona el abrir la ventana que muestra una tabla u otra.
     * 
     * @param e El evento de acción que desencadena este método.
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
