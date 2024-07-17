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

public class Consultas {
    private String parametroString;
    private int i;
    private String [] parametros;
    private String [] titulo;
    private String [] datos;
    private String [] datosc;

    private AppLogs objLogs = new AppLogs(Consultas.class);

    public void setDatosc(String[] datosc) {
        this.datosc = datosc;
    }
    public void setParametros(String[] parametros) {
        this.parametros = parametros;
    }
    public void setDatos(String[] datos) {
        this.datos = datos;
    }
    public void setTitulo(String[] titulo) {
        this.titulo = titulo;
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
                for(i=1; i<= parametros.length; i++) {
                    pst.setString(i, parametros[i-1]);
                }
                try(ResultSet resultado = pst.executeQuery()){
                    resultado.last();
                    datosc = new String [datos.length];
                    int filas = resultado.getRow();
                    if (filas > 0) {
                        resultado.beforeFirst();
                        while(resultado.next()){
                            for(i=0;i<datos.length;i++) {
                                datosc[i] = resultado.getString(datos[i]);
                            }
                            consulta.addRow(datosc);
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
}
