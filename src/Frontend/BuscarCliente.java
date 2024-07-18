/*
 * Created by JFormDesigner on Tue Jul 16 20:59:30 GMT-05:00 2024
 */

package Frontend;

import DBConsultas.Consultas;
import DBConsultas.ExecProcedimientos;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class BuscarCliente extends JInternalFrame {
    public BuscarCliente() {
        super("Buscar Cliente", true, true, true, false);

        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("")){
            ExecProcedimientos execProcedimientos = new ExecProcedimientos();
            execProcedimientos.setTitulo(new String[]{
                    "ID de cliente",
                    "Nombre",
                    "Apellido",
                    "ID de Personal"});
            execProcedimientos.setDatos(new String[]{
                    "ID_cliente",
                    "Nombre",
                    "Apellido",
                    "ID_Personal"});
            execProcedimientos.setParametroString(
                    "{call BuscarCliente (?)}");
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
        button1 = new JButton();
        label1 = new JLabel();
        textField1 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("Ver");
        button1.addActionListener(e -> button1(e));

        //---- label1 ----
        label1.setText("Nombre de Cliente");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(label1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button1)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 696, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(40, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JButton button1;
    private JLabel label1;
    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
