package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarUpdate8 {
    private String parametro1;
    private String parametro2;
    private String parametro3;
    private String parametro4;
    private String parametro5;
    private String parametro6;
    private String parametro7;
    private String parametro8;
    private String parametroString;
    private AppLogs objLogs = new AppLogs(InsertarUpdate8.class);

    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
    }
    public void setParametro2(String parametro2) {
        this.parametro2 = parametro2;
    }
    public void setParametro3(String parametro3) {
        this.parametro3 = parametro3;
    }
    public void setParametro4(String parametro4) {
        this.parametro4 = parametro4;
    }
    public void setParametro5(String parametro5) {
        this.parametro5 = parametro5;
    }
    public void setParametro6(String parametro6) {
        this.parametro6 = parametro6;
    }
    public void setParametro7(String parametro7) {
        this.parametro7 = parametro7;
    }
    public void setParametro8(String parametro8) {
        this.parametro8 = parametro8;
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
                pst.setString(2, parametro2);
                pst.setString(3, parametro3);
                pst.setString(4, parametro4);
                pst.setString(5, parametro5);
                pst.setString(6, parametro6);
                pst.setString(7, parametro7);
                pst.setString(8, parametro8);

                pst.executeQuery();


            }catch (SQLException ex){
                objLogs.errorLogs(ex);
                //throw new RuntimeException(ex);

            }
        } catch (SQLException e) {
           objLogs.errorLogs(e);
           // throw new RuntimeException(e);

        }


    }
}
