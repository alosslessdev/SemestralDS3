/*
 * Created by JFormDesigner on Thu Jul 18 07:59:44 GMT-05:00 2024
 */

package Frontend;

import java.awt.*;
import java.awt.event.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.GroupLayout;

import DBConexion.ConexionSQL;
import net.miginfocom.swing.*;

/**
 * @author pancho
 */
public class LoginMDI2 extends JInternalFrame {
    private String[] datosc;
    private int[] datos;
    private int i = 1;

    public LoginMDI2() {
        initComponents();
    }

    private void buttonLogin(ActionEvent e) {
        // TODO add your code here
        String usuario = textFieldUsuario.getText();
        String contrasena = String.valueOf(passwordField1.getPassword());
        try {
            try (ConexionSQL conn = new ConexionSQL()) {
                conn.conectarDb();
                int resultado = intentarLogin(usuario, contrasena);
                if (resultado == -2 || resultado == 0) {
                    JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrecta");
                    conn.desconectarDb();
                } else if (resultado == -1) {
                    JOptionPane.showMessageDialog(this, "Cuenta Bloqueado [Comuniquese con Tecnología]");
                    conn.desconectarDb();
                } else if (resultado == 1) {
                    JOptionPane.showMessageDialog(this, "Login Exitoso");

                }
            }
        }catch(SQLException e1)
        {
            e1.printStackTrace();
        }    }


    public int intentarLogin(String nombreUsuario, String contraseña) throws SQLException {
        ConexionSQL conn = new ConexionSQL();
        conn.conectarDb();
        String sql = "{call sp_IntentoLogin(?, ?)}";
        try (Connection conectar = conn.getConexion()) {
            CallableStatement stmt = conectar.prepareCall(sql);
            stmt.setString(1, nombreUsuario);
            stmt.setString(2, contraseña);

            try(ResultSet resultado = stmt.executeQuery()){

                datosc = new String [datos.length];
                if(!resultado.isBeforeFirst()){
                    JOptionPane.showMessageDialog(null, "No hay datos", "Info", 1);
                } else{
                    while(resultado.next()) {
                        datosc[i] = resultado.getString(datos[i]);

                    }
                }
            }
            return Integer.parseInt(datosc[i]);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdfsf
        panel1 = new JPanel();
        labelLogin = new JLabel();
        labelUsuario = new JLabel();
        textFieldUsuario = new JTextField();
        labelContra = new JLabel();
        passwordField1 = new JPasswordField();
        buttonLogin = new JToggleButton();

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(Color.lightGray);
            panel1.setBackground(Color.darkGray);
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
            .swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing
            .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
            Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.red
            ),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
            public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName(
            )))throw new RuntimeException();}});
            panel1.setLayout(new MigLayout(
                "fillx,insets 35 45 30 45,hidemode 3,wrap",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- labelLogin ----
            labelLogin.setText("Bienvenido");
            labelLogin.setForeground(Color.white);
            labelLogin.setHorizontalAlignment(SwingConstants.LEFT);
            labelLogin.setFont(new Font("Inter", Font.BOLD, 36));
            panel1.add(labelLogin, "cell 0 0");

            //---- labelUsuario ----
            labelUsuario.setText("Usuario:");
            labelUsuario.setForeground(Color.white);
            panel1.add(labelUsuario, "cell 0 1");

            //---- textFieldUsuario ----
            textFieldUsuario.setBackground(Color.gray);
            textFieldUsuario.setFont(new Font("Inter", Font.BOLD, 14));
            textFieldUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            textFieldUsuario.setCaretColor(Color.lightGray);
            textFieldUsuario.setMargin(new Insets(2, 5, 2, 5));
            textFieldUsuario.setForeground(Color.lightGray);
            textFieldUsuario.setPreferredSize(new Dimension(49, 36));
            textFieldUsuario.setBorder(null);
            panel1.add(textFieldUsuario, "cell 0 2");

            //---- labelContra ----
            labelContra.setText("Contrase\u00f1a:");
            labelContra.setForeground(Color.white);
            panel1.add(labelContra, "cell 0 3");

            //---- passwordField1 ----
            passwordField1.setBackground(Color.gray);
            passwordField1.setFont(new Font("Agency FB", Font.PLAIN, 13));
            passwordField1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            passwordField1.setCaretColor(Color.lightGray);
            passwordField1.setForeground(Color.lightGray);
            passwordField1.setPreferredSize(new Dimension(49, 36));
            passwordField1.setBorder(null);
            panel1.add(passwordField1, "cell 0 4");

            //---- buttonLogin ----
            buttonLogin.setText("Login");
            buttonLogin.setForeground(Color.white);
            buttonLogin.setBackground(new Color(0x282828));
            buttonLogin.setBorder(null);
            buttonLogin.setPreferredSize(new Dimension(72, 35));
            buttonLogin.addActionListener(e -> buttonLogin(e));
            panel1.add(buttonLogin, "cell 0 5");
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JPanel panel1;
    private JLabel labelLogin;
    private JLabel labelUsuario;
    private JTextField textFieldUsuario;
    private JLabel labelContra;
    private JPasswordField passwordField1;
    private JToggleButton buttonLogin;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
