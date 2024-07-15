/*
 * Created by JFormDesigner on Sun Jul 14 21:17:48 GMT-05:00 2024
 */

package Forma;

import java.awt.*;
import java.awt.event.*;
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

    private void IMenuMaterialEntrada(ActionEvent e) {
        // TODO add your code here
        InsertarMaterialEntrada Entrada = new InsertarMaterialEntrada();
        Entrada.setSize(desktopPane1.getSize());
        Entrada.setMaximum()
    }

    private void IMenuMaterialSalida(ActionEvent e) {
        // TODO add your code here
    }

    private void IMenuGastos(ActionEvent e) {
        // TODO add your code here
    }

    private void iMenuGanancias(ActionEvent e) {
        // TODO add your code here
    }

    private void iMenuPiezas(ActionEvent e) {
        // TODO add your code here
    }

    private void iMenuMaquinas(ActionEvent e) {
        // TODO add your code here
    }

    private void iMenuMantenimiento(ActionEvent e) {
        // TODO add your code here
    }

    private void iMenuEmpleado(ActionEvent e) {
        // TODO add your code here
    }

    private void AMenuGastos2(ActionEvent e) {
        // TODO add your code here
    }

    private void AMenuPiezas2(ActionEvent e) {
        // TODO add your code here
    }

    private void AMenuEmpleado2(ActionEvent e) {
        // TODO add your code here
    }

    private void menuItem1(ActionEvent e) {
        // TODO add your code here
    }

    private void menuItem4(ActionEvent e) {
        // TODO add your code here
    }

    private void cMenuMaterial(ActionEvent e) {
        // TODO add your code here
    }

    private void cMenuMaterialSalida(ActionEvent e) {
        // TODO add your code here
    }

    private void cMenuMaquinas(ActionEvent e) {
        // TODO add your code here
    }

    private void cMenuEmpleado(ActionEvent e) {
        // TODO add your code here
    }

    private void cMenuGastos(ActionEvent e) {
        // TODO add your code here
    }

    private void cMenuPiezas(ActionEvent e) {
        // TODO add your code here
    }

    private void cMenuMantenimiento(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        IMenuMaterialEntrada2 = new JMenuItem();
        IMenuMaterialSalida2 = new JMenuItem();
        IMenuGastos2 = new JMenuItem();
        iMenuGanancias2 = new JMenuItem();
        menu2 = new JMenu();
        AMenuGastos3 = new JMenuItem();
        menu3 = new JMenu();
        menuItem2 = new JMenuItem();
        desktopPane1 = new JDesktopPane();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Usuario");

                //---- IMenuMaterialEntrada2 ----
                IMenuMaterialEntrada2.setText("Pagos");
                IMenuMaterialEntrada2.addActionListener(e -> IMenuMaterialEntrada(e));
                menu1.add(IMenuMaterialEntrada2);

                //---- IMenuMaterialSalida2 ----
                IMenuMaterialSalida2.setText("Preferencias");
                IMenuMaterialSalida2.addActionListener(e -> IMenuMaterialSalida(e));
                menu1.add(IMenuMaterialSalida2);

                //---- IMenuGastos2 ----
                IMenuGastos2.setText("Solictud");
                IMenuGastos2.addActionListener(e -> IMenuGastos(e));
                menu1.add(IMenuGastos2);

                //---- iMenuGanancias2 ----
                iMenuGanancias2.setText("Ver Programa");
                iMenuGanancias2.addActionListener(e -> iMenuGanancias(e));
                menu1.add(iMenuGanancias2);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Programas");

                //---- AMenuGastos3 ----
                AMenuGastos3.setText("Gastos");
                AMenuGastos3.addActionListener(e -> {
			IMenuGastos(e);
			AMenuGastos2(e);
		});
                menu2.add(AMenuGastos3);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("Estadisticas");

                //---- menuItem2 ----
                menuItem2.setText("Procesados por sucursal");
                menuItem2.addActionListener(e -> menuItem1(e));
                menu3.add(menuItem2);
            }
            menuBar1.add(menu3);
        }
        setJMenuBar(menuBar1);

        //======== desktopPane1 ========
        {

            //---- button1 ----
            button1.setText("Iniciar Sesi\u00f3n");
            desktopPane1.add(button1, JLayeredPane.DEFAULT_LAYER);
            button1.setBounds(145, 95, 110, button1.getPreferredSize().height);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(desktopPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(desktopPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem IMenuMaterialEntrada2;
    private JMenuItem IMenuMaterialSalida2;
    private JMenuItem IMenuGastos2;
    private JMenuItem iMenuGanancias2;
    private JMenu menu2;
    private JMenuItem AMenuGastos3;
    private JMenu menu3;
    private JMenuItem menuItem2;
    private JDesktopPane desktopPane1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
