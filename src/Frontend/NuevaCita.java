/*
 * Created by JFormDesigner on Tue Jul 16 20:58:15 GMT-05:00 2024
 */

package Frontend;

import DBConsultas.Consultas;
import DBConsultas.InsertarUpdate;

import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class NuevaCita extends JInternalFrame {

    public NuevaCita() {
        super("Nueva Cita", true, true, true, false);

        initComponents();
    }



    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField3.getText().equals("") || !textField4.getText().equals("")
                || !textField5.getText().equals("")){
            InsertarUpdate objInsertarUpdate = new InsertarUpdate();

            objInsertarUpdate.setParametroString(
                    "INSERT INTO [Citas] " +
                            "([ID_Cliente], " +
                            "[ID_Programa], " +
                            "[Fecha_Cita]) " +
                            "VALUES " +
                            "(?, ?, ?) "
            );
            objInsertarUpdate.setParametros(new String[]{
                    textField3.getText(),
                    textField4.getText(),
                    textField5.getText(),
            });

            objInsertarUpdate.insertar();

        }else{
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan en blanco", "Sin datos",
                    1);        }

    }

    private void checkBox1ItemStateChanged(ItemEvent e) {
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
        textField5 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        textField6 = new JTextField();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("Crear");
        button1.addActionListener(e -> button1(e));

        //---- label1 ----
        label1.setText("C\u00f3digo de cliente");

        //---- label2 ----
        label2.setText("ID de Programa");

        //---- label5 ----
        label5.setText("Fecha de Cita");

        //---- label6 ----
        label6.setText("ID de doctor");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(241, 241, 241)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addGap(6, 6, 6)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2)
                            .addGap(6, 6, 6)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label5)
                            .addGap(6, 6, 6)
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label6)
                            .addGap(6, 6, 6)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(258, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(367, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(349, 349, 349))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
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
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label5))
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label6))
                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(button1)
                    .addContainerGap(263, Short.MAX_VALUE))
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
    private JTextField textField5;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
