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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Implementación gráfica de la tabla platos y un botón para abrir
 * la clase Anadir para añadir nuevos platos.
 * 
 * @author bielc
 */
public class Platos extends JFrame {
    
    JButton anadir = new JButton("Añadir Nuevo Plato");
    JTable table = new JTable();
    JScrollPane scrollPane = new JScrollPane(table);

    /**
     * Constructor de la clase Platos.
     * Le da los parámetros necesarios al JFrame además de crear un botón
     * para acceder a la clase Anadir.
     */
    public Platos() {
        setTitle("Tabla de Platos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(950, 0);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(anadir);
        panel.add(scrollPane);
        add(panel);

        anadir.addActionListener(new ActionListener() {
            /**
             * Action listener que gestiona cuándo abrir la pestaña para crear
             * nuevos platos.
             * 
             * @param e El evento de acción que desencadena este método.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                new Anadir().AnadirPlato();
                try {
                    cargarPlatosDesdeDB();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        try {
            cargarPlatosDesdeDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que accede a la base de datos y mediante un bucle va cargando
     * los datos dentro de la tabla que mostramos.
     * 
     * @throws SQLException si ocurre un error de acceso a la base de datos.
     */
    private void cargarPlatosDesdeDB() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/proyectofinalprogdam";
        String usuario = "root";
        String contraseña = "";
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

        PreparedStatement myst = conexion.prepareStatement("select * from plato");
        ResultSet rs = myst.executeQuery();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Tipo cocina");

        while (rs.next()) {
            String nombre = rs.getString("nombre");
            Float precio = rs.getFloat("precio");
            String cocina = rs.getString("cocina");
            model.addRow(new Object[]{nombre, precio, cocina});
        }

        table.setModel(model);

        rs.close();
        myst.close();
        conexion.close();
    }
}
