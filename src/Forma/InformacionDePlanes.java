/*
 * Created by JFormDesigner on Sun Jul 14 23:59:01 GMT-05:00 2024
 */

package Forma;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class InformacionDePlanes extends JInternalFrame {
    public InformacionDePlanes() {
        super("InformacionDePlanes", true, true, true, true);
        initComponents();
    }

    private void comboBox1(ActionEvent e) {
        // TODO add your code here

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdfsf
        label1 = new JLabel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        comboBox1 = new JComboBox();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("text");

        //---- button1 ----
        button1.setText("text");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- comboBox1 ----
        comboBox1.addActionListener(e -> comboBox1(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(label1)
                            .addGap(18, 18, 18)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(52, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(52, 52, 52)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JLabel label1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JComboBox comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
