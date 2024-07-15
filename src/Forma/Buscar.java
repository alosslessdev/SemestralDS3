/*
 * Created by JFormDesigner on Sun Jul 14 23:59:01 GMT-05:00 2024
 */

package Forma;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class Buscar extends JInternalFrame {
    public Buscar() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("text");

        //---- label2 ----
        label2.setText("text");

        //---- label3 ----
        label3.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label3)
                        .addComponent(label2)
                        .addComponent(label1))
                    .addGap(27, 27, 27)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                    .addContainerGap(261, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(131, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
