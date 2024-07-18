package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarUpdate {
    private String [] parametros;
    private String parametroString;
    private AppLogs objLogs = new AppLogs(InsertarUpdate.class);

    public void setParametros(String[] parametros) {
        this.parametros = parametros;
    }
    public void setParametroString(String parametroString) {
        this.parametroString = parametroString;
    }


    public void insertar() {
        //String titulo []={"No Factura","Nombre Cliente", "Total"};
        //DefaultTableModel consulta = new DefaultTableModel(null,titulo);
        String sql=parametroString;
        try(ConexionSQL conexion= new ConexionSQL()){
            conexion.conectarDb();
            //TYPE_SCROLL_INSENSITIVE moverse hacia adelante y atraz
            //CONCUR_READ_ONLY
            try(Connection conectar = conexion.getConexion()) {
                PreparedStatement pst = conectar.prepareStatement(sql);
                if (parametros != null){

                    for (int i = 1; i <= parametros.length; i++) {
                    pst.setString(i, parametros[i-1]);
                    }
                }
                pst.executeQuery();
                JOptionPane.showMessageDialog(null, "Informacion registrada correctamente",
                        "Insertado",
                        JOptionPane.INFORMATION_MESSAGE);

            }catch (SQLException ex){
                objLogs.errorLogs(ex);
            }
        } catch (SQLException e) {
            objLogs.errorLogs(e);
        }


    }
}
