/*
 * Created by JFormDesigner on Sat Jul 06 10:58:52 GMT-05:00 2024
 */

package Forma;

import DBConsultas.Consultas;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class ConsultarProcesados extends JPanel {
    public ConsultarProcesados() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("")){
            Consultas objConsultas = new Consultas();
            objConsultas.setTitulo(new String[]{"Codigo de Salida",
                    "Horario de Salida",
                    "Salida Peso",
                    "Ubicacion",
                    "Salida Tipo",
                    "Precio",
                    "Fecha",
                    "ID de Sucursal"});
            objConsultas.setDatos(new String[]{
                    "CodigoSalida",
                    "HorarioSalida",
                    "SalidaPeso",
                    "Ubicacion",
                    "SalidaTipo",
                    "Precio",
                    "Fecha",
                    "IDSucursal"});
            objConsultas.setParametroString(
                    "select * from DetallesMaterialesProcesados WHERE " +
                            "IDSucursal = ? " +
                            "GROUP BY CodigoSalida, HorarioSalida, SalidaPeso, Ubicacion, SalidaTipo, " +
                            "Precio, Fecha, IDSucursal");
            objConsultas.setParametros(new String[]{
                    textField1.getText()
            });
            table1.setModel(objConsultas.consultas());
        }else{
            //impresionDialogo("El campo esta en blanco", "Sin datos", 1);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        textField1 = new JTextField();
        label4 = new JLabel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
        0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
        . BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
        red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
        beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

        //---- label4 ----
        label4.setText("ID de Sucursal");

        //---- button1 ----
        button1.setText("Consultar");
        button1.addActionListener(e -> button1(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addComponent(button1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(label4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addContainerGap(67, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JTextField textField1;
    private JLabel label4;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
