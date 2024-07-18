/*
 * Created by JFormDesigner on Wed Jul 17 20:17:25 GMT-05:00 2024
 */

package Frontend;

import DBConexion.ConexionSQL;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;


public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    ConexionSQL conn = new ConexionSQL();


    private void buttonLogin(ActionEvent e){
        // TODO add your code here
        String usuario = textFieldUsuario.getText();
        String contraseña = String.valueOf(passwordField1.getPassword());
        conn.conectarDb();
        try
        {
            int resultado = conn.intentarLogin(conn.getConexion(), usuario, contraseña);
            if(resultado == -2 || resultado == 0)
            {
                JOptionPane.showMessageDialog(this,"Usuario o Contraseña incorrecta");
                conn.desconectarDb();
            } else if (resultado == -1)
            {
                JOptionPane.showMessageDialog(this,"Cuenta Bloqueado [Comuniquese con Tecnología]");
                conn.desconectarDb();
            } else if (resultado == 1) {
                JOptionPane.showMessageDialog(this,"Login Exitoso");

            }
        }catch(SQLException e1)
        {
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new Login();
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(40, 40, 40));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Enrique
        panel2 = new JPanel();
        labelLogin = new JLabel();
        labelUsuario = new JLabel();
        textFieldUsuario = new JTextField();
        labelContra = new JLabel();
        passwordField1 = new JPasswordField();
        buttonLogin = new JToggleButton();

        //======== this ========
        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 600));
        setMaximumSize(new Dimension(1920, 1080));
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.darkGray);
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets 0,hidemode 3,align center center",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[fill]"));

        //======== panel2 ========
        {
            panel2.setForeground(Color.lightGray);
            panel2.setBackground(Color.darkGray);
            panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new Font ("D\u0069alog" ,Font .BOLD ,12 ), Color. red) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            panel2.setLayout(new MigLayout(
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
            panel2.add(labelLogin, "cell 0 0");

            //---- labelUsuario ----
            labelUsuario.setText("Usuario:");
            labelUsuario.setForeground(Color.white);
            panel2.add(labelUsuario, "cell 0 1");

            //---- textFieldUsuario ----
            textFieldUsuario.setBackground(Color.gray);
            textFieldUsuario.setFont(new Font("Inter", Font.BOLD, 14));
            textFieldUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            textFieldUsuario.setCaretColor(Color.lightGray);
            textFieldUsuario.setMargin(new Insets(2, 5, 2, 5));
            textFieldUsuario.setForeground(Color.lightGray);
            textFieldUsuario.setPreferredSize(new Dimension(49, 36));
            textFieldUsuario.setBorder(null);
            panel2.add(textFieldUsuario, "cell 0 2");

            //---- labelContra ----
            labelContra.setText("Contrase\u00f1a:");
            labelContra.setForeground(Color.white);
            panel2.add(labelContra, "cell 0 3");

            //---- passwordField1 ----
            passwordField1.setBackground(Color.gray);
            passwordField1.setFont(new Font("Agency FB", Font.PLAIN, 13));
            passwordField1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            passwordField1.setCaretColor(Color.lightGray);
            passwordField1.setForeground(Color.lightGray);
            passwordField1.setPreferredSize(new Dimension(49, 36));
            passwordField1.setBorder(null);
            panel2.add(passwordField1, "cell 0 4");

            //---- buttonLogin ----
            buttonLogin.setText("Login");
            buttonLogin.setForeground(Color.white);
            buttonLogin.setBackground(new Color(0x282828));
            buttonLogin.setBorder(null);
            buttonLogin.setPreferredSize(new Dimension(72, 35));
            buttonLogin.addActionListener(e -> buttonLogin(e));
            panel2.add(buttonLogin, "cell 0 5");
        }
        contentPane.add(panel2, "cell 1 0,width 400,height 300");
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Enrique
    private JPanel panel2;
    private JLabel labelLogin;
    private JLabel labelUsuario;
    private JTextField textFieldUsuario;
    private JLabel labelContra;
    private JPasswordField passwordField1;
    private JToggleButton buttonLogin;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
