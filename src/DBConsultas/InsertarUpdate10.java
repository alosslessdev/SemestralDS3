package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarUpdate10 {
    private String parametro1;
    private String parametro2;
    private String parametro3;
    private String parametro4;
    private String parametro5;
    private String parametro6;
    private String parametro7;
    private String parametro8;
    private String parametro9;
    private String parametro10;
    private String parametroString;
    private AppLogs objLogs = new AppLogs(InsertarUpdate10.class);


    //private AppLogs objLogs = new AppLogs(Insertar.class);

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
    public void setParametro9(String parametro9) {
        this.parametro9 = parametro9;
    }
    public void setParametro10(String parametro10) {
        this.parametro10 = parametro10;
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
                pst.setString(9, parametro9);
                pst.setString(10, parametro10);
                pst.executeQuery();


            }catch (SQLException ex){
                objLogs.errorLogs(ex);
            }
        } catch (SQLException e) {
            objLogs.errorLogs(e);
        }


    }
}
