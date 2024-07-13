package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarUpdate1 {
    private String parametro1;
    private String parametroString;
    private AppLogs objLogs = new AppLogs(InsertarUpdate1.class);


    //private AppLogs objLogs = new AppLogs(Insertar.class);

    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
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
            try(Connection conectar = conexion.getConexion()){
                PreparedStatement pst = conectar.prepareStatement(sql);
                pst.setString(1, parametro1);
                pst.executeQuery();

            }catch (SQLException ex){
                objLogs.errorLogs(ex);
            }
        } catch (SQLException e) {
            objLogs.errorLogs(e);
        }


    }
}
