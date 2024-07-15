/*
 * Created by JFormDesigner on Sun Jun 16 14:42:02 EST 2024
 */

package Forma;

import DBConexion.ConexionSQL;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

public class VentanaPrincipal extends JPanel {
    public VentanaPrincipal() {
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

        JFrame frame = new JFrame("Ventana Principal");
        frame.setContentPane(new VentanaPrincipal());
        frame.pack();
        frame.setVisible(true);
    }
    
    private void iMenuGanancias(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Insertar Ganancias");
        frame.setContentPane(new InsertarGanancias());
        frame.setVisible(true);
        frame.pack();
    }

    private void iMenuPiezas(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Insertar Piezas");
        frame.setContentPane(new InsertarPiezas());
        frame.setVisible(true);
        frame.pack();
    }

    private void iMenuMaquinas(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Insertar Maquinas");
        frame.setContentPane(new InsertarMaquinas());
        frame.setVisible(true);
        frame.pack();
    }

    private void iMenuMantenimiento(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Insertar Mantenimiento");
        frame.setContentPane(new InsertarMantenimiento());
        frame.setVisible(true);
        frame.pack();
    }

    private void iMenuEmpleado(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Insertar Empleado");
        frame.setContentPane(new InsertarEmpleado());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuMaterial(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar Material de Entrada");
        frame.setContentPane(new ConsultarMaterialEntrada());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuMaterialSalida(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar Material de Salida");
        frame.setContentPane(new ConsultarMaterialSalida());
        frame.setVisible(true);
        frame.pack();    }


    private void cMenuGastos(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar Gastos");
        frame.setContentPane(new ConsultarGastos());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuPiezas(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar Piezas");
        frame.setContentPane(new ConsultarPiezas());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuMaquinas(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar Maquinas");
        frame.setContentPane(new ConsultarMaquinas());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuMantenimiento(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar Mantenimiento");
        frame.setContentPane(new ConsultarMantenimiento());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuEmpleado(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar Empleado");
        frame.setContentPane(new ConsultarEmpleado());
        frame.setVisible(true);
        frame.pack();
    }

    private void IMenuMaterialEntrada(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar Material de Entrada");
        frame.setContentPane(new InsertarMaterialEntrada());
        frame.setVisible(true);
        frame.pack();
    }

    private void IMenuMaterialSalida(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Insertar Material de Salida");
        frame.setContentPane(new InsertarMaterialSalida());
        frame.setVisible(true);
        frame.pack();
    }

    private void IMenuGastos(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Insertar Gastos");
        frame.setContentPane(new InsertarGastos());
        frame.setVisible(true);
        frame.pack();
    }



    private void AMenuGastos2(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Actualizar Gastos");
        frame.setContentPane(new UpdateGastos());
        frame.setVisible(true);
        frame.pack();
    }


    private void AMenuPiezas2(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Actualizar Piezas");
        frame.setContentPane(new UpdatePiezas());
        frame.setVisible(true);
        frame.pack();
    }


    private void AMenuEmpleado2(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Actualizar Empleado");
        frame.setContentPane(new UpdateEmpleado());
        frame.setVisible(true);
        frame.pack();
    }

    private void menuItem4(ActionEvent e) {
        // TODO add your code here
    }

    private void menuItem1(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame("Consultar procesados");
        frame.setContentPane(new ConsultarProcesados());
        frame.setVisible(true);
        frame.pack();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        menuBar1 = new JMenuBar();
        menu3 = new JMenu();
        IMenuMaterialEntrada = new JMenuItem();
        IMenuMaterialSalida = new JMenuItem();
        IMenuGastos = new JMenuItem();
        iMenuGanancias = new JMenuItem();
        iMenuPiezas = new JMenuItem();
        iMenuMaquinas = new JMenuItem();
        iMenuMantenimiento = new JMenuItem();
        iMenuEmpleado = new JMenuItem();
        menu2 = new JMenu();
        AMenuGastos2 = new JMenuItem();
        AMenuPiezas2 = new JMenuItem();
        AMenuEmpleado2 = new JMenuItem();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        cMenuMaterial = new JMenuItem();
        cMenuMaterialSalida = new JMenuItem();
        cMenuMaquinas = new JMenuItem();
        cMenuEmpleado = new JMenuItem();
        cMenuGastos = new JMenuItem();
        cMenuPiezas = new JMenuItem();
        cMenuMantenimiento = new JMenuItem();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );

        //======== menuBar1 ========
        {

            //======== menu3 ========
            {
                menu3.setText("Insertar");

                //---- IMenuMaterialEntrada ----
                IMenuMaterialEntrada.setText("Material de Entrada");
                IMenuMaterialEntrada.addActionListener(e -> IMenuMaterialEntrada(e));
                menu3.add(IMenuMaterialEntrada);

                //---- IMenuMaterialSalida ----
                IMenuMaterialSalida.setText("Material de Salida");
                IMenuMaterialSalida.addActionListener(e -> IMenuMaterialSalida(e));
                menu3.add(IMenuMaterialSalida);

                //---- IMenuGastos ----
                IMenuGastos.setText("Gastos");
                IMenuGastos.addActionListener(e -> IMenuGastos(e));
                menu3.add(IMenuGastos);

                //---- iMenuGanancias ----
                iMenuGanancias.setText("Ganancias");
                iMenuGanancias.addActionListener(e -> iMenuGanancias(e));
                menu3.add(iMenuGanancias);

                //---- iMenuPiezas ----
                iMenuPiezas.setText("Piezas");
                iMenuPiezas.addActionListener(e -> iMenuPiezas(e));
                menu3.add(iMenuPiezas);

                //---- iMenuMaquinas ----
                iMenuMaquinas.setText("Maquinas");
                iMenuMaquinas.addActionListener(e -> iMenuMaquinas(e));
                menu3.add(iMenuMaquinas);

                //---- iMenuMantenimiento ----
                iMenuMantenimiento.setText("Mantenimiento");
                iMenuMantenimiento.addActionListener(e -> iMenuMantenimiento(e));
                menu3.add(iMenuMantenimiento);

                //---- iMenuEmpleado ----
                iMenuEmpleado.setText("Empleado");
                iMenuEmpleado.addActionListener(e -> iMenuEmpleado(e));
                menu3.add(iMenuEmpleado);
            }
            menuBar1.add(menu3);

            //======== menu2 ========
            {
                menu2.setText("Actualizar");

                //---- AMenuGastos2 ----
                AMenuGastos2.setText("Gastos");
                AMenuGastos2.addActionListener(e -> {
			IMenuGastos(e);
			AMenuGastos2(e);
		});
                menu2.add(AMenuGastos2);

                //---- AMenuPiezas2 ----
                AMenuPiezas2.setText("Piezas");
                AMenuPiezas2.addActionListener(e -> {
			iMenuPiezas(e);
			AMenuPiezas2(e);
		});
                menu2.add(AMenuPiezas2);

                //---- AMenuEmpleado2 ----
                AMenuEmpleado2.setText("Empleado");
                AMenuEmpleado2.addActionListener(e -> {
			iMenuEmpleado(e);
			AMenuEmpleado2(e);
		});
                menu2.add(AMenuEmpleado2);
            }
            menuBar1.add(menu2);

            //======== menu1 ========
            {
                menu1.setText("Consultar");

                //---- menuItem1 ----
                menuItem1.setText("Procesados por sucursal");
                menuItem1.addActionListener(e -> menuItem1(e));
                menu1.add(menuItem1);

                //---- cMenuMaterial ----
                cMenuMaterial.setText("Material de Entrada");
                cMenuMaterial.addActionListener(e -> {
			menuItem4(e);
			cMenuMaterial(e);
		});
                menu1.add(cMenuMaterial);

                //---- cMenuMaterialSalida ----
                cMenuMaterialSalida.setText("Material de Salida");
                cMenuMaterialSalida.addActionListener(e -> cMenuMaterialSalida(e));
                menu1.add(cMenuMaterialSalida);

                //---- cMenuMaquinas ----
                cMenuMaquinas.setText("Maquinas");
                cMenuMaquinas.addActionListener(e -> cMenuMaquinas(e));
                menu1.add(cMenuMaquinas);

                //---- cMenuEmpleado ----
                cMenuEmpleado.setText("Empleado");
                cMenuEmpleado.addActionListener(e -> cMenuEmpleado(e));
                menu1.add(cMenuEmpleado);

                //---- cMenuGastos ----
                cMenuGastos.setText("Gastos");
                cMenuGastos.addActionListener(e -> cMenuGastos(e));
                menu1.add(cMenuGastos);

                //---- cMenuPiezas ----
                cMenuPiezas.setText("Piezas");
                cMenuPiezas.addActionListener(e -> cMenuPiezas(e));
                menu1.add(cMenuPiezas);

                //---- cMenuMantenimiento ----
                cMenuMantenimiento.setText("Mantenimiento");
                cMenuMantenimiento.addActionListener(e -> cMenuMantenimiento(e));
                menu1.add(cMenuMantenimiento);
            }
            menuBar1.add(menu1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(19, Short.MAX_VALUE)
                    .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JMenuBar menuBar1;
    private JMenu menu3;
    private JMenuItem IMenuMaterialEntrada;
    private JMenuItem IMenuMaterialSalida;
    private JMenuItem IMenuGastos;
    private JMenuItem iMenuGanancias;
    private JMenuItem iMenuPiezas;
    private JMenuItem iMenuMaquinas;
    private JMenuItem iMenuMantenimiento;
    private JMenuItem iMenuEmpleado;
    private JMenu menu2;
    private JMenuItem AMenuGastos2;
    private JMenuItem AMenuPiezas2;
    private JMenuItem AMenuEmpleado2;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem cMenuMaterial;
    private JMenuItem cMenuMaterialSalida;
    private JMenuItem cMenuMaquinas;
    private JMenuItem cMenuEmpleado;
    private JMenuItem cMenuGastos;
    private JMenuItem cMenuPiezas;
    private JMenuItem cMenuMantenimiento;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
