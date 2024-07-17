/*
 * Created by JFormDesigner on Sun Jul 14 21:17:48 GMT-05:00 2024
 */

package Forma;

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
        InformacionDePago informacionDePago = new InformacionDePago();
        informacionDePago.setSize(desktopPane1.getSize());
        try {
            informacionDePago.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(informacionDePago);
        informacionDePago.show();    }



    private void SolictudMenu(ActionEvent e) {
        // TODO add your code here
        NuevoCliente nuevoCliente = new NuevoCliente();
        nuevoCliente.setSize(desktopPane1.getSize());
        try {
            nuevoCliente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(nuevoCliente);
        nuevoCliente.show();    }

    private void VerProgramaMenu(ActionEvent e) {
        // TODO add your code here
        ListaDeProgramas listaDeProgramas = new ListaDeProgramas();
        listaDeProgramas.setSize(desktopPane1.getSize());
        try {
            listaDeProgramas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(listaDeProgramas);
        listaDeProgramas.show();
    }

    private void BuscarMenu(ActionEvent e) {
        // TODO add your code here
        InformacionDePlanes informacionDePlanes = new InformacionDePlanes();
        informacionDePlanes.setSize(desktopPane1.getSize());
        try {
            informacionDePlanes.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        this.desktopPane1.add(informacionDePlanes);
        informacionDePlanes.show();    }

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
        // Generated using JFormDesigner Evaluation license - sdfsf
        menuBar1 = new JMenuBar();
        menu6 = new JMenu();
        menuItem7 = new JMenuItem();
        menu1 = new JMenu();
        SolictudMenu = new JMenuItem();
        PagosMenu = new JMenuItem();
        menuItem3 = new JMenuItem();
        menuItem8 = new JMenuItem();
        VerProgramaMenu = new JMenuItem();
        menu8 = new JMenu();
        menuItem6 = new JMenuItem();
        menu3 = new JMenu();
        GenerosMenu = new JMenuItem();
        menu7 = new JMenu();
        menuItem4 = new JMenuItem();
        menu2 = new JMenu();
        BuscarMenu = new JMenuItem();
        menuItem1 = new JMenuItem();
        menu4 = new JMenu();
        menuItem2 = new JMenuItem();
        menuItem5 = new JMenuItem();
        desktopPane1 = new JDesktopPane();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu6 ========
            {
                menu6.setText("Cita");

                //---- menuItem7 ----
                menuItem7.setText("Nueva cita");
                menu6.add(menuItem7);
            }
            menuBar1.add(menu6);

            //======== menu1 ========
            {
                menu1.setText("Cliente");

                //---- SolictudMenu ----
                SolictudMenu.setText("Informacion de pago");
                SolictudMenu.addActionListener(e -> SolictudMenu(e));
                menu1.add(SolictudMenu);

                //---- PagosMenu ----
                PagosMenu.setText("Historial de cliente");
                PagosMenu.addActionListener(e -> PagosMenu(e));
                menu1.add(PagosMenu);

                //---- menuItem3 ----
                menuItem3.setText("Nuevo Cliente");
                menu1.add(menuItem3);

                //---- menuItem8 ----
                menuItem8.setText("Plan de cliente");
                menu1.add(menuItem8);

                //---- VerProgramaMenu ----
                VerProgramaMenu.setText("Ver si tiene pago atrasado");
                VerProgramaMenu.addActionListener(e -> VerProgramaMenu(e));
                menu1.add(VerProgramaMenu);
            }
            menuBar1.add(menu1);

            //======== menu8 ========
            {
                menu8.setText("Doctores");

                //---- menuItem6 ----
                menuItem6.setText("Lista de doctores");
                menu8.add(menuItem6);
            }
            menuBar1.add(menu8);

            //======== menu3 ========
            {
                menu3.setText("Estadisticas");

                //---- GenerosMenu ----
                GenerosMenu.setText("Generos mas usados");
                GenerosMenu.addActionListener(e -> GenerosMenu(e));
                menu3.add(GenerosMenu);
            }
            menuBar1.add(menu3);

            //======== menu7 ========
            {
                menu7.setText("Pagos");

                //---- menuItem4 ----
                menuItem4.setText("Nuevo pago");
                menu7.add(menuItem4);
            }
            menuBar1.add(menu7);

            //======== menu2 ========
            {
                menu2.setText("Planes");

                //---- BuscarMenu ----
                BuscarMenu.setText("Informacion de planes");
                BuscarMenu.addActionListener(e -> BuscarMenu(e));
                menu2.add(BuscarMenu);

                //---- menuItem1 ----
                menuItem1.setText("Lista de clientes por plan");
                menu2.add(menuItem1);
            }
            menuBar1.add(menu2);

            //======== menu4 ========
            {
                menu4.setText("Programas");

                //---- menuItem2 ----
                menuItem2.setText("Lista de programas");
                menu4.add(menuItem2);

                //---- menuItem5 ----
                menuItem5.setText("Crear un programa");
                menu4.add(menuItem5);
            }
            menuBar1.add(menu4);
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
    // Generated using JFormDesigner Evaluation license - sdfsf
    private JMenuBar menuBar1;
    private JMenu menu6;
    private JMenuItem menuItem7;
    private JMenu menu1;
    private JMenuItem SolictudMenu;
    private JMenuItem PagosMenu;
    private JMenuItem menuItem3;
    private JMenuItem menuItem8;
    private JMenuItem VerProgramaMenu;
    private JMenu menu8;
    private JMenuItem menuItem6;
    private JMenu menu3;
    private JMenuItem GenerosMenu;
    private JMenu menu7;
    private JMenuItem menuItem4;
    private JMenu menu2;
    private JMenuItem BuscarMenu;
    private JMenuItem menuItem1;
    private JMenu menu4;
    private JMenuItem menuItem2;
    private JMenuItem menuItem5;
    private JDesktopPane desktopPane1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
