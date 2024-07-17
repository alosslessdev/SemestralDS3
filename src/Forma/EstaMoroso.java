/*
 * Created by JFormDesigner on Tue Jul 16 20:59:44 GMT-05:00 2024
 */

package Forma;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class EstaMoroso extends JInternalFrame {
    public EstaMoroso() {
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
        textField1 = new JTextField();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("text");
        button1.addActionListener(e -> button1(e));

        //---- label1 ----
        label1.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(label1)
                            .addGap(31, 31, 31)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(button1)))
                    .addContainerGap(34, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addComponent(button1)
                    .addContainerGap(84, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JButton button1;
    private JLabel label1;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
