/*
 * Created by JFormDesigner on Thu Jun 20 10:46:54 EST 2024
 */

package Forma;

import DBConsultas.InsertarUpdate;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

public class InsertarMaterialEntrada extends JPanel {
    public InsertarMaterialEntrada() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") && !textField2.getText().equals("") && !textField3.getText().equals("")) {
            InsertarUpdate objInsertarUpdate = new InsertarUpdate();
            objInsertarUpdate.setParametroString(
                    "insert into MaterialEntrada (EntradaTipo, EntradaPeso, EntradaOrigen, HorarioEntrada, date) " +
                            "values (?, ?, ?, convert(varchar(10), GETDATE(), 108), GETDATE()) ");

            objInsertarUpdate.setParametros(new String[]{
                    textField1.getText(),
                    textField2.getText(),
                    textField3.getText()
            });
            objInsertarUpdate.insertar();
            JOptionPane.showMessageDialog(null, "Operacion completada con exito", "Mensaje", 1);

        }else{
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan en blanco ","Error",1);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        label6 = new JLabel();
        textField3 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))
        throw new RuntimeException();}});

        //---- label4 ----
        label4.setText("Peso");

        //---- label5 ----
        label5.setText("Origen");

        //---- button1 ----
        button1.setText("Insertar");
        button1.addActionListener(e -> button1(e));

        //---- label6 ----
        label6.setText("Descripcion");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(161, 161, 161)
                            .addComponent(button1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label6)
                                .addComponent(label5)
                                .addComponent(label4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(44, 44, 44))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JButton button1;
    private JLabel label6;
    private JTextField textField3;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
