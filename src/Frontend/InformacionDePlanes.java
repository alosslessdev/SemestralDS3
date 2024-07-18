/*
 * Created by JFormDesigner on Sun Jul 14 23:59:01 GMT-05:00 2024
 */

package Frontend;

import DBConsultas.Consultas;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class InformacionDePlanes extends JInternalFrame {
    public InformacionDePlanes() {
        super("Informacion De Planes", true, true, true, false);
        initComponents();
    }

    private void comboBox1(ActionEvent e) {
        // TODO add your code here

    }

    private void button1(ActionEvent e) {
        // TODO add your code here

            Consultas objConsultas = new Consultas();
            objConsultas.setTitulo(new String[]{
                    "ID de cliente",
                    "Nombre",
                    "Apellido",
                    "Nombre de Plan",
                    "Costo",
                    "Fecha de Inicio"});
            objConsultas.setDatos(new String[]{
                    "ID_cliente",
                    "Nombre",
                    "Apellido",
                    "Nombre_Plan",
                    "Costo",
                    "Fecha_Inicio"});
            objConsultas.setParametroString(
                    "SELECT c.ID_cliente, c.Nombre, c.Apellido, p.Nombre_Plan, p.Costo, co.Fecha_Inicio " +
                            "FROM Clientes c " +
                            "JOIN Contratos co ON c.ID_cliente = co.ID_Cliente " +
                            "JOIN Planes p ON co.ID_Plan = p.ID_Plan " +
                            "ORDER BY c.ID_cliente;");
            objConsultas.setParametros(null);

            table1.setModel(objConsultas.consultas());
            objConsultas.setDatosc(null);

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
                    .addContainerGap(65, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(button1)
                            .addGap(364, 364, 364))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE))
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
