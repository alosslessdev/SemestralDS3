/*
 * Created by JFormDesigner on Tue Jul 16 20:59:44 GMT-05:00 2024
 */

package Frontend;

import DBConsultas.Consultas;
import DBConsultas.ExecProcedimientos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class EstaMoroso extends JInternalFrame {
    public EstaMoroso() {
        super("Lista de clientes morosos", true, true, true, false);

        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        ExecProcedimientos execProcedimientos = new ExecProcedimientos();
        execProcedimientos.setTitulo(new String[]{
                "Nombre",
                "Apellido",
                "ID_cliente",
                "ID_Contrato",
                "Nombre de Plan",
                "Ultimo Pago"});
        execProcedimientos.setDatos(new String[]{
                "Nombre",
                "Apellido",
                "ID_cliente",
                "ID_Contrato",
                "Nombre_Plan",
                "UltimoPago"});
        execProcedimientos.setParametroString(
                "{call ClientesConPagosAtrasados}");
        execProcedimientos.setParametros(null);
        table1.setModel(execProcedimientos.consultas());
        execProcedimientos.setDatosc(null);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdfsf
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("Ver");
        button1.addActionListener(e -> button1(e));

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
                            .addGap(74, 74, 74)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 627, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(362, 362, 362)
                            .addComponent(button1)))
                    .addContainerGap(77, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
