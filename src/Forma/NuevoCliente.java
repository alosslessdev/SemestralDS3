/*
 * Created by JFormDesigner on Mon Jul 15 00:01:54 GMT-05:00 2024
 */

package Forma;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class NuevoCliente extends JInternalFrame {
    public NuevoCliente() {

        super("NuevoCliente", true, true, true, true);
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdfsf
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label6 = new JLabel();
        button1 = new JButton();
        comboBox1 = new JComboBox();
        comboBox2 = new JComboBox();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Identificacion");

        //---- label2 ----
        label2.setText("Nombre");

        //---- label3 ----
        label3.setText("Apellido");

        //---- label4 ----
        label4.setText("No. Tarjeta");

        //---- label5 ----
        label5.setText("Tipo de tarjeta");

        //---- label6 ----
        label6.setText("Plan");

        //---- button1 ----
        button1.setText("text");
        button1.addActionListener(e -> button1(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label6)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label5)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(label4)
                                    .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(label3)
                                    .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(label2)
                                    .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(button1)))
                    .addContainerGap(85, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label4)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(58, 58, 58)
                    .addComponent(button1)
                    .addContainerGap(31, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel label6;
    private JButton button1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
