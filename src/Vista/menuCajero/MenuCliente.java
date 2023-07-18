/*
 * Created by JFormDesigner on Mon Jul 17 18:49:41 GMT 2023
 */

package Vista.menuCajero;

import Controlador.volverLogin;
import Entitys.Usuarios.Cliente;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author marce
 */
public class MenuCliente extends JFrame {

    private Cliente cliente;

    public MenuCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public MenuCliente() {
        initComponents();
        initControllers();
    }
    private void initControllers(){
        btnExit.addActionListener(new volverLogin());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - marcelo
        panel1 = new JPanel();
        btnExit = new JButton();
        titleLabel = new JLabel();
        btnIngresarDinero = new JButton();
        btnConsultarSaldo = new JButton();
        btnEnviarDinero = new JButton();
        btnRetirarDinero = new JButton();
        btnInfo = new JButton();

        //======== this ========
        setBackground(new Color(0x100e0e));
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x100e0e));
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );

            //---- btnExit ----
            btnExit.setText("Salir");
            btnExit.setBackground(new Color(0x100e0e));
            btnExit.setForeground(Color.white);

            //---- titleLabel ----
            titleLabel.setText("Red Chab\u00e1n");
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            titleLabel.setFont(new Font(Font.SERIF, Font.PLAIN, 17));
            titleLabel.setForeground(new Color(0x13e6e6));
            titleLabel.setBackground(new Color(0x100e0e));

            //---- btnIngresarDinero ----
            btnIngresarDinero.setText("Ingresar Dinero");
            btnIngresarDinero.setBackground(new Color(0x100e0e));
            btnIngresarDinero.setForeground(new Color(0x13e6e6));

            //---- btnConsultarSaldo ----
            btnConsultarSaldo.setText("Consultar Saldo");
            btnConsultarSaldo.setBackground(new Color(0x100e0e));
            btnConsultarSaldo.setForeground(new Color(0x13e6e6));

            //---- btnEnviarDinero ----
            btnEnviarDinero.setText("Enviar Dinero");
            btnEnviarDinero.setBackground(new Color(0x100e0e));
            btnEnviarDinero.setForeground(new Color(0x13e6e6));

            //---- btnRetirarDinero ----
            btnRetirarDinero.setText("Retirar Dinero");
            btnRetirarDinero.setBackground(new Color(0x100e0e));
            btnRetirarDinero.setForeground(new Color(0x13e6e6));

            //---- btnInfo ----
            btnInfo.setText("Ver Informaci\u00f3n");
            btnInfo.setBackground(new Color(0x100e0e));
            btnInfo.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(btnConsultarSaldo, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnIngresarDinero))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(btnEnviarDinero, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(btnRetirarDinero, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 1, Short.MAX_VALUE))))
                            .addComponent(btnInfo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(btnExit, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresarDinero, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarSaldo, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRetirarDinero, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviarDinero, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInfo)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit)
                        .addContainerGap(8, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - marcelo
    private JPanel panel1;
    private JButton btnExit;
    private JLabel titleLabel;
    private JButton btnIngresarDinero;
    private JButton btnConsultarSaldo;
    private JButton btnEnviarDinero;
    private JButton btnRetirarDinero;
    private JButton btnInfo;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
