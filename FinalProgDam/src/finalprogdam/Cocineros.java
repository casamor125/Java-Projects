package finalprogdam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * En esta clase mostramos la tabla de cocineros y su plato estrella
 * el cual viene de la tabla de platos.
 * 
 * @author bielc
 */
public class Cocineros extends JFrame {

    JTable table = new JTable();
    JScrollPane scrollPane = new JScrollPane(table);

    /**
     * Constructor de la clase Cocineros.
     * Le da los parámetros necesarios al JFrame y accede al método para
     * cargar la base de datos.
     */
    public Cocineros() {
        setTitle("Tabla de Cocineros");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(scrollPane);

        try {
            cargarCocinerosDesdeDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para cargar todos los datos de la tabla de cocineros
     * dentro de una tabla accediendo a la base de datos y metiendo los datos
     * en la tabla mediante un bucle while.
     * 
     * @throws SQLException si ocurre un error de acceso a la base de datos.
     */
    private void cargarCocinerosDesdeDB() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/proyectofinalprogdam";
        String usuario = "root";
        String contraseña = "";
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

        PreparedStatement myst = conexion.prepareStatement("SELECT "
                + "cocinero.nombre AS NombreCocinero, "
                + "cocinero.edad AS Edad, "
                + "plato.nombre AS PlatoEstrella "
                + "FROM "
                + "cocinero "
                + "JOIN "
                + "cocinero_plato ON cocinero.ID = cocinero_plato.id_cocinero "
                + "JOIN "
                + "plato ON cocinero_plato.id_plato = plato.ID;");
        
        ResultSet rs = myst.executeQuery();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Edad");
        model.addColumn("Plato Estrella");

        while (rs.next()) {
            String nombre = rs.getString("NombreCocinero");
            int edad = rs.getInt("Edad");
            String plato = rs.getString("PlatoEstrella");
            model.addRow(new Object[]{nombre, edad, plato});
        }

        table.setModel(model);

        rs.close();
        myst.close();
        conexion.close();
    }
}
