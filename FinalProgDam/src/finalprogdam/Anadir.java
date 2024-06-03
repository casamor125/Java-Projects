/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprogdam;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * 
 * @author bielc
 * Clase que usaremos para meter los metodos que seran usados para
 * añadir nuevos valores dentro de nuestras tablas
 */
public class Anadir extends JFrame {

    Float AnadirPrecio;
    JButton anadir = new JButton("Añadir");
    String url = "jdbc:mysql://localhost:3306/proyectofinalprogdam";
    String usuario = "root";
    String contraseña = "";
    
    String[] cocinasPermitidas = {"Italiana", "Japonesa", "China", "Española", "Francesa", "Indio"};
    JComboBox<String> comboCocina = new JComboBox<>(cocinasPermitidas);
/**
 * AnadirPlato metodo que usamos para añadir platos usando el mismo metodo para
 * sacar informacion de la base de datos solo que en vez de ser un select 
 * usamos un insert into
 */
    public void AnadirPlato() {
        setTitle("Añadir Plato");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(this);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextField nombre = new JTextField(10);
        JTextField precio = new JTextField(10);
        
        panel.add(new JLabel("Nombre: "));
        panel.add(nombre);
        panel.add(new JLabel("Precio: "));
        panel.add(precio);
        panel.add(new JLabel("Tipo de Cocina: "));
        panel.add(comboCocina);
        panel.add(anadir);
        add(panel);

        /**
         * Gestion del actionListener del boton de añadir
         * donde si que insertamos los valores en la tabla
         */
        anadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombrePlato = nombre.getText();
                String precioPlato = precio.getText();
                String cocinaPlato = (String) comboCocina.getSelectedItem();

                try {
                    Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
                    AnadirPrecio = Float.parseFloat(precioPlato);

                    PreparedStatement myst = conexion.prepareStatement("INSERT INTO plato (nombre, precio, cocina) VALUES (?, ?, ?)");
                    myst.setString(1, nombrePlato);
                    myst.setFloat(2, AnadirPrecio);
                    myst.setString(3, cocinaPlato);

                    int rowsAffected = myst.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Plato añadido exitosamente.");
                    }

                    myst.close();
                    conexion.close();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (NumberFormatException ex) {
                    System.out.println("El precio debe ser un número.");
                }
            }
        });
        setVisible(true);
    }

}
