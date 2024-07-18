/*
 * Created by JFormDesigner on Sun Jul 14 21:17:48 GMT-05:00 2024
 */

package Frontend;

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
        informacionDePlanes.show();   
    }

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
        generosA.show();   
    }

        private void NuevaCitaF(ActionEvent e) {
            // TODO add your code here
            NuevaCita nuevaCita = new NuevaCita();
            nuevaCita.setSize(desktopPane1.getSize());
            try {
                nuevaCita.setMaximum(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
            this.desktopPane1.add(nuevaCita);
            nuevaCita.show();
    }

        private void HistorialDeClienteF(ActionEvent e) {
            // TODO add your code here
            HistorialDeCliente historialDeCliente = new HistorialDeCliente();
            historialDeCliente.setSize(desktopPane1.getSize());
            try {
                historialDeCliente.setMaximum(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
            this.desktopPane1.add(historialDeCliente);
            historialDeCliente.show();      
    }

        private void NuevoClienteF(ActionEvent e) {
            // TODO add your code here
            NuevoCliente nuevoCliente = new NuevoCliente();
            nuevoCliente.setSize(desktopPane1.getSize());
            try {
                nuevoCliente.setMaximum(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
            this.desktopPane1.add(nuevoCliente);
            nuevoCliente.show();      
    }

        private void PlanDeClienteF(ActionEvent e) {
            // TODO add your code here
            PlanDeCliente planDeCliente = new PlanDeCliente();
            planDeCliente.setSize(desktopPane1.getSize());
            try {
                planDeCliente.setMaximum(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
            this.desktopPane1.add(planDeCliente);
            planDeCliente.show();      
    }

        private void PagoAtrasadoF(ActionEvent e) {
            // TODO add your code here
            EstaMoroso estaMoroso = new EstaMoroso();
            estaMoroso.setSize(desktopPane1.getSize());
            try {
                estaMoroso.setMaximum(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
            this.desktopPane1.add(estaMoroso);
            estaMoroso.show();         
    }


        private void NuevoPagoF(ActionEvent e) {
            // TODO add your code here
            NuevoPago nuevoPago = new NuevoPago();
            nuevoPago.setSize(desktopPane1.getSize());
            try {
                nuevoPago.setMaximum(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
            this.desktopPane1.add(nuevoPago);
            nuevoPago.show();        
    }

        private void ClientesPlanF(ActionEvent e) {
            // TODO add your code here
            ClientesPorPlan clientesPorPlan = new ClientesPorPlan();
            clientesPorPlan.setSize(desktopPane1.getSize());
            try {
                clientesPorPlan.setMaximum(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
            this.desktopPane1.add(clientesPorPlan);
            clientesPorPlan.show();         
    }

        private void ListaProgramasF(ActionEvent e) {
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

        private void CrearProgramaF(ActionEvent e) {
            // TODO add your code here
            CrearPrograma crearPrograma = new CrearPrograma();
            crearPrograma.setSize(desktopPane1.getSize());
            try {
                crearPrograma.setMaximum(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
            this.desktopPane1.add(crearPrograma);
            crearPrograma.show();        
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdfsf
        menuBar1 = new JMenuBar();
        menu6 = new JMenu();
        NuevaCitaF = new JMenuItem();
        ClienteF = new JMenu();
        HistorialDeClienteF = new JMenuItem();
        NuevoClienteF = new JMenuItem();
        PlanDeClienteF = new JMenuItem();
        PagoAtrasadoF = new JMenuItem();
        menu3 = new JMenu();
        GenerosMenu = new JMenuItem();
        menu7 = new JMenu();
        NuevoPagoF = new JMenuItem();
        menu4 = new JMenu();
        ListaProgramasF = new JMenuItem();
        CrearProgramaF = new JMenuItem();
        menu2 = new JMenu();
        BuscarMenu = new JMenuItem();
        ClientesPlanF = new JMenuItem();
        desktopPane1 = new JDesktopPane();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu6 ========
            {
                menu6.setText("Cita");

                //---- NuevaCitaF ----
                NuevaCitaF.setText("Nueva cita");
                NuevaCitaF.addActionListener(e -> NuevaCitaF(e));
                menu6.add(NuevaCitaF);
            }
            menuBar1.add(menu6);

            //======== ClienteF ========
            {
                ClienteF.setText("Cliente");

                //---- HistorialDeClienteF ----
                HistorialDeClienteF.setText("Historial De Pagos Del Cliente");
                HistorialDeClienteF.addActionListener(e -> HistorialDeClienteF(e));
                ClienteF.add(HistorialDeClienteF);

                //---- NuevoClienteF ----
                NuevoClienteF.setText("Nuevo Cliente");
                NuevoClienteF.addActionListener(e -> NuevoClienteF(e));
                ClienteF.add(NuevoClienteF);

                //---- PlanDeClienteF ----
                PlanDeClienteF.setText("Plan del cliente");
                PlanDeClienteF.addActionListener(e -> PlanDeClienteF(e));
                ClienteF.add(PlanDeClienteF);

                //---- PagoAtrasadoF ----
                PagoAtrasadoF.setText("Lista de clientes morosos");
                PagoAtrasadoF.addActionListener(e -> PagoAtrasadoF(e));
                ClienteF.add(PagoAtrasadoF);
            }
            menuBar1.add(ClienteF);

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

                //---- NuevoPagoF ----
                NuevoPagoF.setText("Nuevo pago");
                NuevoPagoF.addActionListener(e -> NuevoPagoF(e));
                menu7.add(NuevoPagoF);
            }
            menuBar1.add(menu7);

            //======== menu4 ========
            {
                menu4.setText("Programas");

                //---- ListaProgramasF ----
                ListaProgramasF.setText("Lista de programas");
                ListaProgramasF.addActionListener(e -> ListaProgramasF(e));
                menu4.add(ListaProgramasF);

                //---- CrearProgramaF ----
                CrearProgramaF.setText("Crear un programa");
                CrearProgramaF.addActionListener(e -> CrearProgramaF(e));
                menu4.add(CrearProgramaF);
            }
            menuBar1.add(menu4);

            //======== menu2 ========
            {
                menu2.setText("Planes");

                //---- BuscarMenu ----
                BuscarMenu.setText("Informacion De Planes Y Sus Clientes");
                BuscarMenu.addActionListener(e -> BuscarMenu(e));
                menu2.add(BuscarMenu);

                //---- ClientesPlanF ----
                ClientesPlanF.setText("Lista de clientes por plan");
                ClientesPlanF.addActionListener(e -> ClientesPlanF(e));
                menu2.add(ClientesPlanF);
            }
            menuBar1.add(menu2);
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
    private JMenuItem NuevaCitaF;
    private JMenu ClienteF;
    private JMenuItem HistorialDeClienteF;
    private JMenuItem NuevoClienteF;
    private JMenuItem PlanDeClienteF;
    private JMenuItem PagoAtrasadoF;
    private JMenu menu3;
    private JMenuItem GenerosMenu;
    private JMenu menu7;
    private JMenuItem NuevoPagoF;
    private JMenu menu4;
    private JMenuItem ListaProgramasF;
    private JMenuItem CrearProgramaF;
    private JMenu menu2;
    private JMenuItem BuscarMenu;
    private JMenuItem ClientesPlanF;
    private JDesktopPane desktopPane1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
