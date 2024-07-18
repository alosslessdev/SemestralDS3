/*
 * Created by JFormDesigner on Mon Jul 15 00:01:54 GMT-05:00 2024
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
public class NuevoCliente extends JInternalFrame {
    public NuevoCliente() {

        super("Nuevo Cliente", true, true, true, false);
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") || !textField2.getText().equals("")
        || !textField3.getText().equals("") || !textField4.getText().equals("")
        || comboBox1.getSelectedItem() != null
                || comboBox2.getSelectedItem() != null){
            InsertarUpdate insertarUpdate = new InsertarUpdate();
            insertarUpdate.setParametroString(
                    "INSERT INTO [dbo].[Clientes] " +
                            "([Nombre]," +
                            "[Apellido]," +
                            "[ID_Personal]," +
                            "[Num_Tarjeta]," +
                            "[Tipo_Tarjeta])" +
                            "VALUES " +
                            "(?, ?, ?, ?, ?) "
            );
            insertarUpdate.setParametros(new String[]{
                    textField1.getText(),
                    textField2.getText(),
                    textField3.getText(),
                    textField4.getText(),
                    Objects.requireNonNull(comboBox1.getSelectedItem()).toString(),
                    Objects.requireNonNull(comboBox2.getSelectedItem()).toString()
            });
            insertarUpdate.insertar();
        }else{
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan en blanco", "Sin datos",
                    1);        }

    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
    }

    private void comboBox2ItemStateChanged(ItemEvent e) {
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
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();

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
        button1.setText("Crear");
        button1.addActionListener(e -> button1(e));

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "Debito",
            "Credito"
        }));
        comboBox1.addItemListener(e -> comboBox1ItemStateChanged(e));

        //---- comboBox2 ----
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
            "Basico",
            "Normal",
            "Ultra"
        }));
        comboBox2.addItemListener(e -> comboBox2ItemStateChanged(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(249, 249, 249)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label1))
                        .addComponent(label2, GroupLayout.Alignment.TRAILING)
                        .addComponent(label3, GroupLayout.Alignment.TRAILING)
                        .addComponent(label4, GroupLayout.Alignment.TRAILING)
                        .addComponent(label5, GroupLayout.Alignment.TRAILING)
                        .addComponent(label6, GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField4)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3)
                        .addComponent(textField2)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(button1)
                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(290, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label5)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(button1)
                    .addContainerGap(179, Short.MAX_VALUE))
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
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
