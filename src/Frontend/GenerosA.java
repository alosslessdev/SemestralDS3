/*
 * Created by JFormDesigner on Mon Jul 15 00:05:19 GMT-05:00 2024
 */

package Frontend;

import DBConsultas.Consultas;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class GenerosA extends JInternalFrame {
    public GenerosA() {

        super("Generos", true, true, true, false);
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
            Consultas objConsultas = new Consultas();
            objConsultas.setTitulo(new String[]{
                    "Genero",
                    "Popularidad"});
            objConsultas.setDatos(new String[]{
                    "Genero",
                    "Popularidad"});
            objConsultas.setParametroString(
                    "select Genero, COUNT(Genero) as Popularidad from Programas group by Genero order by Genero ASC;");
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
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(358, 358, 358)
                            .addComponent(button1)))
                    .addContainerGap(94, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61))
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
