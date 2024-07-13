package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Consultas3 {
    private String parametro1;
    private String parametro2;
    private String parametro3;
    private String parametroString;
    private int i;

    private String [] titulo;
    private String [] datos;
    private Vector<String> datosA = new Vector<>();
    private AppLogs objLogs = new AppLogs(Consultas3.class);

    public void setDatos(String[] datos) {
        this.datos = datos;
    }
    public void setTitulo(String[] titulo) {
        this.titulo = titulo;
    }
    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
    }
    public void setParametro2(String parametro2) {
        this.parametro2 = parametro2;
    }
    public void setParametro3(String parametro3) {
        this.parametro3 = parametro3;
    }
    public void setParametroString(String parametroString) {
        this.parametroString = parametroString;
    }


    public DefaultTableModel consultas() {
        String[] tituloLocal = titulo;
        DefaultTableModel consulta = new DefaultTableModel(null, tituloLocal);
        String sql=parametroString;
        try(ConexionSQL conexion= new ConexionSQL()){
            conexion.conectarDb();
            //TYPE_SCROLL_INSENSITIVE moverse hacia adelante y atraz
            //CONCUR_READ_ONLY
            try(Connection conectar = conexion.getConexion()){
                PreparedStatement pst = conectar.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                pst.setString(1, parametro1);
                pst.setString(2, parametro2);
                pst.setString(3, parametro3);
                try(ResultSet resultado = pst.executeQuery()){
                    resultado.last();
                    int filas = resultado.getRow();
                    if (filas > 0) {
                        resultado.beforeFirst();
                        while(resultado.next()){
                            for(i=0;i<datos.length;i++) {
                                datosA.add(resultado.getString(datos[i]));
                            }
                            consulta.addRow(datosA);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay datos para la fecha ","Info",1);
                    }
                }
            }catch (Exception e){
                objLogs.errorLogs(e);
            }
        }catch (SQLException ex){
            objLogs.errorLogs(ex);
        }
        return consulta;
    }
    public void clear (){
        datosA.clear();
    }
}
