/*
 * Created by JFormDesigner on Mon Jun 24 11:32:35 EST 2024
 */

package Forma;

import DBConsultas.InsertarUpdate5;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;


public class InsertarGastos extends JPanel {
    public InsertarGastos() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") && !textField2.getText().equals("") && 
                !textField3.getText().equals("") &&
                !textField4.getText().equals("") && !textField5.getText().equals("")) {
            InsertarUpdate5 objInsertarUpdate5 = new InsertarUpdate5();
            objInsertarUpdate5.setParametroString(
                    "insert into Gastos (EnergiaElectrica, Mantenimiento, IDGerente, Mes, Año) " +
                            "values (?, ?, ?, ?, ?)");

            objInsertarUpdate5.setParametro1(textField1.getText());
            objInsertarUpdate5.setParametro2(textField2.getText());
            objInsertarUpdate5.setParametro3(textField3.getText());
            objInsertarUpdate5.setParametro4(textField4.getText());
            objInsertarUpdate5.setParametro5(textField5.getText());
            objInsertarUpdate5.insertar();
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
        textField2 = new JTextField();
        button1 = new JButton();
        label6 = new JLabel();
        label7 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label1 = new JLabel();
        textField5 = new JTextField();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;

        //---- label4 ----
        label4.setText("IDGerente");

        //---- label5 ----
        label5.setText("Mes");

        //---- button1 ----
        button1.setText("Insertar");
        button1.addActionListener(e -> button1(e));

        //---- label6 ----
        label6.setText("Energia el\u00e9ctrica");

        //---- label7 ----
        label7.setText("Mantenimiento");

        //---- label1 ----
        label1.setText("text");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createParallelGroup()
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(80, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup()
                                    .addComponent(label4, GroupLayout.Alignment.TRAILING)
                                    .addComponent(label5, GroupLayout.Alignment.TRAILING)
                                    .addComponent(label1, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label6)
                                    .addComponent(label7))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup()
                                    .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(button1)))
                    .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label6)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label7)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label5)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addComponent(button1)
                    .addGap(38, 38, 38))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel label1;
    private JTextField textField5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
