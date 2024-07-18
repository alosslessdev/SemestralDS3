/*
 * Created by JFormDesigner on Thu Jul 18 00:41:30 GMT-05:00 2024
 */

package Frontend;

import DBConsultas.ExecProcedimientos;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class BuscarCitas extends JInternalFrame {
    public BuscarCitas() {
        super("Buscar Citas Del Cliente", true, true, true, false);

        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("")){
            ExecProcedimientos execProcedimientos = new ExecProcedimientos();
            execProcedimientos.setTitulo(new String[]{
                    "ID de Cita",
                    "Nombre de Cliente",
                    "Apellido de Cliente",
                    "Nombre de Programa",
                    "Numero de Consulta",
                    "Duracion",
                    "Descripcion",
                    "Fecha de Cita",
                    "Nombre de Doctor"});
            execProcedimientos.setDatos(new String[]{
                    "ID_Cita",
                    "NombreCliente",
                    "ApellidoCliente",
                    "Nombre_Programa",
                    "Numero_Consulta",
                    "Duracion",
                    "Descripcion",
                    "Fecha_Cita",
                    "NombreDoctor"});
            execProcedimientos.setParametroString(
                    "{call CitasClienteEspecif (?)}");
            execProcedimientos.setParametros(new String[]{
                    textField1.getText()
            });

            table1.setModel(execProcedimientos.consultas());
            execProcedimientos.setDatosc(null);
        }else{
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan en blanco", "Sin datos",
                    1);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdfsf
        this2 = new JInternalFrame();
        button1 = new JButton();
        label1 = new JLabel();
        textField1 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this2 ========
        {
            this2.setVisible(true);
            var this2ContentPane = this2.getContentPane();

            //---- button1 ----
            button1.setText("Ver");
            button1.addActionListener(e -> button1(e));

            //---- label1 ----
            label1.setText("ID_Cliente");

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }

            GroupLayout this2ContentPaneLayout = new GroupLayout(this2ContentPane);
            this2ContentPane.setLayout(this2ContentPaneLayout);
            this2ContentPaneLayout.setHorizontalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(button1))))
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 696, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(40, Short.MAX_VALUE))
            );
            this2ContentPaneLayout.setVerticalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(button1)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JInternalFrame this2;
    private JButton button1;
    private JLabel label1;
    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
