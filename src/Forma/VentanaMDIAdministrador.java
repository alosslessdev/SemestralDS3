/*
 * Created by JFormDesigner on Sun Jul 14 21:17:48 GMT-05:00 2024
 */

package Forma;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyVetoException;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class VentanaMDIAdministrador extends JFrame {
    public VentanaMDIAdministrador() {
        initComponents();
    }

    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        VentanaMDIAdministrador MDI = new VentanaMDIAdministrador();
        MDI.setSize(800, 600);
        MDI.setLocationRelativeTo(null);
        MDI.setVisible(true);
        MDI.setTitle("Ventana Principal");
    }

    private void PagosMenu(ActionEvent e) {
        // TODO add your code here
        Pagos pagos = new Pagos();
        pagos.setSize(desktopPane1.getSize());
        try {
            pagos.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(pagos);
        pagos.show();    }

    private void PreferenciasMenu(ActionEvent e) {
        // TODO add your code here
        Preferencias preferencias = new Preferencias();
        preferencias.setSize(desktopPane1.getSize());
        try {
            preferencias.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(preferencias);
        preferencias.show();    }

    private void SolictudMenu(ActionEvent e) {
        // TODO add your code here
        Solicitud solicitud = new Solicitud();
        solicitud.setSize(desktopPane1.getSize());
        try {
            solicitud.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(solicitud);
        solicitud.show();    }

    private void VerProgramaMenu(ActionEvent e) {
        // TODO add your code here
        VerPrograma verPrograma = new VerPrograma();
        verPrograma.setSize(desktopPane1.getSize());
        try {
            verPrograma.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(verPrograma);
        verPrograma.show();
    }

    private void BuscarMenu(ActionEvent e) {
        // TODO add your code here
        Buscar buscar = new Buscar();
        buscar.setSize(desktopPane1.getSize());
        try {
            buscar.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(buscar);
        buscar.show();    }

    private void GenerosMenu(ActionEvent e) {
        // TODO add your code here
        GenerosA generosA = new GenerosA();
        generosA.setSize(desktopPane1.getSize());
        try {
            generosA.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(generosA);
        generosA.show();    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        PagosMenu = new JMenuItem();
        PreferenciasMenu = new JMenuItem();
        SolictudMenu = new JMenuItem();
        VerProgramaMenu = new JMenuItem();
        menu2 = new JMenu();
        BuscarMenu = new JMenuItem();
        menu3 = new JMenu();
        GenerosMenu = new JMenuItem();
        desktopPane1 = new JDesktopPane();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Usuario");

                //---- PagosMenu ----
                PagosMenu.setText("Pagos");
                PagosMenu.addActionListener(e -> PagosMenu(e));
                menu1.add(PagosMenu);

                //---- PreferenciasMenu ----
                PreferenciasMenu.setText("Preferencias");
                PreferenciasMenu.addActionListener(e -> PreferenciasMenu(e));
                menu1.add(PreferenciasMenu);

                //---- SolictudMenu ----
                SolictudMenu.setText("Solictud");
                SolictudMenu.addActionListener(e -> SolictudMenu(e));
                menu1.add(SolictudMenu);

                //---- VerProgramaMenu ----
                VerProgramaMenu.setText("Ver Programa");
                VerProgramaMenu.addActionListener(e -> VerProgramaMenu(e));
                menu1.add(VerProgramaMenu);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Programas");

                //---- BuscarMenu ----
                BuscarMenu.setText("Buscar");
                BuscarMenu.addActionListener(e -> BuscarMenu(e));
                menu2.add(BuscarMenu);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("Estadisticas");

                //---- GenerosMenu ----
                GenerosMenu.setText("Generos");
                GenerosMenu.addActionListener(e -> GenerosMenu(e));
                menu3.add(GenerosMenu);
            }
            menuBar1.add(menu3);
        }
        setJMenuBar(menuBar1);

        //======== desktopPane1 ========
        {

            //---- button1 ----
            button1.setText("Iniciar Sesi\u00f3n");
            desktopPane1.add(button1, JLayeredPane.DEFAULT_LAYER);
            button1.setBounds(330, 235, 110, button1.getPreferredSize().height);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(desktopPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(desktopPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem PagosMenu;
    private JMenuItem PreferenciasMenu;
    private JMenuItem SolictudMenu;
    private JMenuItem VerProgramaMenu;
    private JMenu menu2;
    private JMenuItem BuscarMenu;
    private JMenu menu3;
    private JMenuItem GenerosMenu;
    private JDesktopPane desktopPane1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
