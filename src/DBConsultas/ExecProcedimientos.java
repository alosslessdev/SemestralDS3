//Modificado por Francisco Herrera a partir de codigo por prof. José Chirú

package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

public class ExecProcedimientos {
    private String parametroString;
    private int i;
    private String [] parametros;
    private String [] titulo;
    private String [] datos;
    private String [] datosc;

    //private AppLogs objLogs = new AppLogs(Consultas.class);

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
                CallableStatement cst = conectar.prepareCall(sql);
                if (parametros != null){
                    for(i=1; i<= parametros.length; i++) {
                        cst.setString(i, parametros[i-1]);
                    }
                }
                try(ResultSet resultado = cst.executeQuery()){

                    datosc = new String [datos.length];
                    if(!resultado.isBeforeFirst()){
                        JOptionPane.showMessageDialog(null, "No hay datos", "Info", 1);
                    } else{
                        while(resultado.next()) {
                            for (i = 0; i < datos.length; i++) {
                                datosc[i] = resultado.getString(datos[i]);
                            }
                            consulta.addRow(datosc);
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return consulta;
    }

    public DefaultTableModel consultasSinParametros() {
        String[] tituloLocal = titulo;
        DefaultTableModel consulta = new DefaultTableModel(null, tituloLocal);
        String sql=parametroString;
        try(ConexionSQL conexion= new ConexionSQL()){
            conexion.conectarDb();
            //TYPE_SCROLL_INSENSITIVE moverse hacia adelante y atraz
            //CONCUR_READ_ONLY
            try(Connection conectar = conexion.getConexion()){
                CallableStatement cst = conectar.prepareCall(sql);
                try(ResultSet resultado = cst.executeQuery()){

                    datosc = new String [datos.length];
                    if(!resultado.isBeforeFirst()){
                        JOptionPane.showMessageDialog(null, "No hay datos", "Info", 1);
                    } else{
                        while(resultado.next()) {
                            for (i = 0; i < datos.length; i++) {
                                datosc[i] = resultado.getString(datos[i]);
                            }
                            consulta.addRow(datosc);
                        }
                    }
                }
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
        return consulta;
    }

}
