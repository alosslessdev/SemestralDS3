package DBConexion;

import LogsApp.AppLogs;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConexionSQL implements AutoCloseable{
    // Atributos de la clase
    private Connection conexion; // Objeto de conexión a la base de datos
    private AppLogs objLogs = new AppLogs(ConexionSQL.class); // Objeto para gestionar logs

    // Método getter para obtener la conexión a la base de datos
    public Connection getConexion() {
        return conexion;
    }

    // Método para establecer la conexión a la base de datos
    public void conectarDb() {
        // Crear objeto LeerXml para obtener los datos de conexión desde un archivo XML
        LeerXml objXml = new LeerXml();
        try {
            objXml.datosXML(); // Leer y cargar los datos de conexión desde el archivo XML
            // Construir la URL de conexión JDBC
            String dbUrl = "jdbc:sqlserver://" + objXml.getServerName() + ":" + objXml.getPuerto() +
                    ";databaseName=" + objXml.getDbName() +
                    ";user=" + objXml.getUsuario() +
                    ";password=" + objXml.getPass() +
                    ";encrypt=true;trustServerCertificate=true;";
            try {
                conexion = DriverManager.getConnection(dbUrl); // Establecer la conexión a la base de datos
                objLogs.infoLogs("Conexion Realizada"); // Registrar un log de conexión exitosa
               // impresionDialogo("Conexion Realizada", "Conexión", JOptionPane.INFORMATION_MESSAGE); // Mostrar un mensaje de éxito
            } catch (SQLException e) {
                objLogs.errorLogs(e); // Registrar un log de error en la conexión
                impresionDialogo("Error al conectarse [Comuniquese con Tecnología]", "Error en Conexión", JOptionPane.ERROR_MESSAGE); // Mostrar un mensaje de error
            }
        } catch (Exception ex) {
            objLogs.errorLogs(ex); // Registrar un log de error al leer los datos del archivo XML
            impresionDialogo("Error al leer los datos XML [Comuniquese con Tecnología]", "Error en Configuración", JOptionPane.ERROR_MESSAGE); // Mostrar un mensaje de error
        }
    }

    // Método para cerrar la conexión a la base de datos
    public void desconectarDb() {
        if (conexion != null) { // Verificar si la conexión está abierta
            try {
                conexion.close(); // Cerrar la conexión
                objLogs.infoLogs("Desconexión realizada"); // Registrar un log de desconexión exitosa
            } catch (SQLException e) {
                objLogs.errorLogs(e); // Registrar un log de error al cerrar la conexión
                impresionDialogo("Error al desconectar [Comuniquese con Tecnología]", "Error", JOptionPane.ERROR_MESSAGE); // Mostrar un mensaje de error
            }
        }
    }

    public void close() throws SQLException {
        desconectarDb(); // Llamar al método para cerrar la conexión
    }

    // Método privado para mostrar un cuadro de diálogo
    private void impresionDialogo(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, icono); // Mostrar un cuadro de diálogo
    }

    public int intentarLogin(Connection conn, String nombreUsuario, String contraseña) throws SQLException {
        String sql = "{call sp_IntentarLogin(?, ?, ?)}";
        try (CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setString(1, nombreUsuario);
            stmt.setString(2, contraseña);
            stmt.registerOutParameter(3, Types.INTEGER);

            stmt.execute();
            int resultado = stmt.getInt(3);
            return resultado;
        }
    }
}

