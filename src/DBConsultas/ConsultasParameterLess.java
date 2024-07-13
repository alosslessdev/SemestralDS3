package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

public class ConsultasParameterLess {
    private String parametroString;
    private int i;

    private String [] titulo;
    private String [] datos;
    private Vector<String> datosA = new Vector<>();
    private AppLogs objLogs = new AppLogs(ConsultasParameterLess.class);

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
                        JOptionPane.showMessageDialog(null, "No hay datos para la fecha ","Info", JOptionPane.INFORMATION_MESSAGE);
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
