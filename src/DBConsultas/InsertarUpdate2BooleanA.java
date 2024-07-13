package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarUpdate2BooleanA {
    private Boolean parametro1;
    private String parametro2;
    private String parametroString;
    private AppLogs objLogs = new AppLogs(InsertarUpdate2BooleanA.class);


    //private AppLogs objLogs = new AppLogs(Insertar.class);

    public void setParametro1(Boolean parametro1) {
        this.parametro1 = parametro1;
    }
    public void setParametro2(String parametro2) {
        this.parametro2 = parametro2;
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
                pst.setBoolean(1, parametro1);
                pst.setString(2, parametro2);
                pst.executeQuery();


            }catch (SQLException ex){
                objLogs.errorLogs(ex);
            }
        } catch (SQLException e) {
            objLogs.errorLogs(e);
        }


    }
}
