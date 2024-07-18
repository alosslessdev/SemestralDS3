/*
 * Created by JFormDesigner on Mon Jul 15 00:07:03 GMT-05:00 2024
 */

package Frontend;

import DBConsultas.Consultas;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class ListaDeProgramas extends JInternalFrame {
    public ListaDeProgramas() {

        super("Lista De Programas", true, true, true, false);
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField2.getText().equals("") || textField3.getText().equals("")){
            Consultas objConsultas = new Consultas();
            objConsultas.setTitulo(new String[]{
                    "ID de Programa",
                    "Nombre de Programa",
                    "Duracion",
                    "Ano de Inicio",
                    "Edad de Recomendada"});
            objConsultas.setDatos(new String[]{
                    "ID_Programa",
                    "Nombre_Programa",
                    "Duracion",
                    "Ano_Inicio",
                    "Edad_Recomendada"});
            objConsultas.setParametroString(
                    "{call BuscarProgramasPorEdad (?)}");
            objConsultas.setParametros(new String[]{
                    textField2.getText(),
            });

            table1.setModel(objConsultas.consultas());
            objConsultas.setDatosc(null);
        }else if (!textField3.getText().equals("") || textField2.getText().equals("") ){
            Consultas objConsultas = new Consultas();
            objConsultas.setTitulo(new String[]{
                    "ID de Programa",
                    "Nombre de Programa",
                    "Duracion",
                    "Ano de Inicio",
                    "Edad de Recomendada"});
            objConsultas.setDatos(new String[]{
                    "ID_Programa",
                    "Nombre_Programa",
                    "Duracion",
                    "Ano_Inicio",
                    "Edad_Recomendada"});
            objConsultas.setParametroString(
                    "{call BuscarProgramasPorGenero (?)}");
            objConsultas.setParametros(new String[]{
                    textField3.getText(),
            });

            table1.setModel(objConsultas.consultas());
            objConsultas.setDatosc(null);

        }else if (!textField3.getText().equals("") || !textField2.getText().equals("")){
            Consultas objConsultas = new Consultas();
            objConsultas.setTitulo(new String[]{
                    "ID de Programa",
                    "Nombre de Programa",
                    "Duracion",
                    "Ano de Inicio",
                    "Edad de Recomendada"});
            objConsultas.setDatos(new String[]{
                    "ID_Programa",
                    "Nombre_Programa",
                    "Duracion",
                    "Ano_Inicio",
                    "Edad_Recomendada"});
            objConsultas.setParametroString(
                    "SELECT " +
                            "ID_Programa, " +
                            "Nombre_Programa, " +
                            "Duracion, " +
                            "Ano_Inicio, " +
                            "Edad_Recomendada, " +
                            "CASE " +
                            "WHEN Genero = 'TE' THEN 'Telemedicina' " +
                            "WHEN Genero = 'CO' THEN 'Comercial' " +
                            "WHEN Genero = 'PR' THEN 'Presencial' " +
                            "END AS Tipo_Programa " +
                            "FROM " +
                            "Programas " +
                            "WHERE " +
                            "Genero = ? AND Edad_Recomendada = ? " +
                            "ORDER BY  " +
                            "Nombre_Programa ");
            objConsultas.setParametros(new String[]{
                    textField2.getText(),
                    textField3.getText()
            });

            table1.setModel(objConsultas.consultas());
            objConsultas.setDatosc(null);
        } else if (textField3.getText().equals("") || textField2.getText().equals("") ) {
                Consultas objConsultas = new Consultas();
                objConsultas.setTitulo(new String[]{
                        "ID de Programa",
                        "Nombre de Programa",
                        "Duracion",
                        "Ano de Inicio",
                        "Edad de Recomendada"});
                objConsultas.setDatos(new String[]{
                        "ID_Programa",
                        "Nombre_Programa",
                        "Duracion",
                        "Ano_Inicio",
                        "Edad_Recomendada"});
                objConsultas.setParametroString(
                        "{call ListarProgramasDisponibles}");
                objConsultas.setParametros(null);

                table1.setModel(objConsultas.consultas());
                objConsultas.setDatosc(null);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdfsf
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label1 = new JLabel();
        label2 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- label1 ----
        label1.setText("G\u00e9nero");

        //---- label2 ----
        label2.setText("Edad");

        //---- button1 ----
        button1.setText("Ver");
        button1.addActionListener(e -> button1(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 694, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2))
                                .addComponent(button1))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(8, 8, 8)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
