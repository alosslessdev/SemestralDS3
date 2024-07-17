/*
 * Created by JFormDesigner on Tue Jul 16 20:58:15 GMT-05:00 2024
 */

package Forma;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class NuevaCita extends JInternalFrame {
    public NuevaCita() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdfsf
        button1 = new JButton();
        label1 = new JLabel();
        textField3 = new JTextField();
        label2 = new JLabel();
        textField4 = new JTextField();
        comboBox1 = new JComboBox();
        label3 = new JLabel();
        checkBox1 = new JCheckBox();
        label4 = new JLabel();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("text");
        button1.addActionListener(e -> button1(e));

        //---- label1 ----
        label1.setText("text");

        //---- label2 ----
        label2.setText("text");

        //---- label3 ----
        label3.setText("text");

        //---- label4 ----
        label4.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addGap(6, 6, 6)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addGap(6, 6, 6)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label3)
                                .addComponent(label4))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(168, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label1))
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label2))
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(checkBox1)
                        .addComponent(label4))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addGap(14, 14, 14)
                    .addComponent(button1)
                    .addGap(46, 46, 46))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JButton button1;
    private JLabel label1;
    private JTextField textField3;
    private JLabel label2;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JLabel label3;
    private JCheckBox checkBox1;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
