package finalprogdam;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author bielc
 * Implementacion grafica de la tabla Restaurantes y sus platos estrellas 
 * los cuales provienen de la tabla plato ademas de la implementacion de 
 * un JTextField para filtrar los restaurantes segun su precio
 */

public class Restaurantes extends JFrame {

    private JTextField filtro = new JTextField(10);
    private JButton botonFiltro = new JButton("Filtrar");
    private JTable table = new JTable();
    private JScrollPane scrollPane = new JScrollPane(table);
    
    /**
     * Le pasamos los parametros necesarios al JFrame y implementamos
     * un JTextField y un boton que usaremos para filtrar los restaurantes
     */

    public Restaurantes() {
        setTitle("Tabla de Restaurantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        setLocation(950, 425);

        panel.add(new JLabel("Precio Maximo"));
        panel.add(filtro);
        panel.add(botonFiltro);
        panel.add(scrollPane);
        add(panel);

        /**
         * Gestor del actionListener donde obtenemos el valor del JTextField
         * para filtrar por precio los restaurantes
         */
        botonFiltro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String filtroTexto = filtro.getText();
                    cargarRestaurantesDesdeDB(filtroTexto);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }catch (NumberFormatException ex) {
                    System.out.println("El precio debe ser un número.");
                }
            }
        });

        try {
            cargarRestaurantesDesdeDB("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 
     * @param filtro
     * @throws SQLException 
     * metodo que accede a la base de datos y mediante un bucle va cargando 
     * los datos dentro de la tabla que mostramos
     */
    private void cargarRestaurantesDesdeDB(String filtro) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/proyectofinalprogdam";
        String usuario = "root";
        String contraseña = "";
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

        PreparedStatement myst;
        if (filtro.isEmpty()) {
            myst = conexion.prepareStatement("SELECT restaurante.nombre AS Nombre, "
                    + "restaurante.cocina AS Cocina, "
                    + "restaurante.precioMedio AS PrecioMedio, "
                    + "plato.nombre AS PlatoEstrella "
                    + "FROM restaurante "
                    + "JOIN restaurante_plato ON restaurante.ID = restaurante_plato.id_restaurante "
                    + "JOIN plato ON restaurante_plato.id_plato = plato.ID;");
        } else {
            Float precioFiltro = Float.parseFloat(filtro);
            myst = conexion.prepareStatement("SELECT restaurante.nombre AS Nombre, "
                    + "restaurante.cocina AS Cocina, "
                    + "restaurante.precioMedio AS PrecioMedio, "
                    + "plato.nombre AS PlatoEstrella "
                    + "FROM restaurante "
                    + "JOIN restaurante_plato ON restaurante.ID = restaurante_plato.id_restaurante "
                    + "JOIN plato ON restaurante_plato.id_plato = plato.ID "
                    + "WHERE restaurante.precioMedio <= ?");
            myst.setFloat(1, precioFiltro);
        }
        ResultSet rs = myst.executeQuery();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Tipo de cocina");
        model.addColumn("Precio Medio");
        model.addColumn("Plato Estrella");

        while (rs.next()) {
            String nombre = rs.getString("Nombre");
            String cocina = rs.getString("Cocina");
            Float precioMedio = rs.getFloat("PrecioMedio");
            String platoEstrella = rs.getString("PlatoEstrella");
            model.addRow(new Object[]{nombre, cocina, precioMedio, platoEstrella});
        }

        table.setModel(model);

        rs.close();
        myst.close();
        conexion.close();
    }
}
