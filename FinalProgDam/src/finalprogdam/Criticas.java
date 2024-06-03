/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprogdam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bielc
 * Clase que usamos para ver los valores dentro de la tabla critica
 */
public class Criticas extends JFrame {

    JTable table = new JTable();
    JScrollPane scrollPane = new JScrollPane(table);

    /**
     * Le pasamos los parametros necesarios al JFrame y cargamos la tabla donde
     * guardamos los datos de criticas
     */
    public Criticas() {
        setTitle("Tabla de Criticas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(0, 425);

        add(scrollPane);

        try {
            cargarCriticasDesdeDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
    * 
    * @throws SQLException 
    * metodo que accede a la base de datos y mediante un bucle va cargando 
    * los datos dentro de la tabla que mostramos
    */
    private void cargarCriticasDesdeDB() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/proyectofinalprogdam";
        String usuario = "root";
        String contraseña = "";
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

        String consultaSQL = "SELECT critica.ID, critica.Puntuacion, critica.año, plato.nombre AS Plato "
                + "FROM critica "
                + "JOIN plato ON critica.id_plato = plato.ID";
        PreparedStatement myst = conexion.prepareStatement(consultaSQL);
        ResultSet rs = myst.executeQuery();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Puntuacion");
        model.addColumn("Año");
        model.addColumn("Plato");

        while (rs.next()) {

            String puntuacion = rs.getString("Puntuacion");
            Date año = rs.getDate("año");
            String plato = rs.getString("Plato");
            model.addRow(new Object[]{puntuacion, año, plato});
        }

        table.setModel(model);

        rs.close();
        myst.close();
        conexion.close();

    }

}
