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
 * Clase utilizada para visualizar los valores dentro de la tabla "critica".
 * Muestra las críticas registradas junto con la puntuación, el año y el nombre del plato.
 * Los datos se obtienen de la base de datos.
 * 
 * @author bielc
 */
public class Criticas extends JFrame {

    JTable table = new JTable();
    JScrollPane scrollPane = new JScrollPane(table);

    /**
     * Constructor de la clase Criticas.
     * Configura la interfaz gráfica para mostrar la tabla de críticas.
     */
    public Criticas() {
        setTitle("Tabla de Críticas");
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
     * Método que carga los datos de las críticas desde la base de datos
     * y los muestra en la tabla.
     * 
     * @throws SQLException si ocurre un error de acceso a la base de datos.
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
        model.addColumn("Puntuación");
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
