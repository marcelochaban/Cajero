/*
 * Created by JFormDesigner on Sun Jul 16 19:36:22 GMT 2023
 */

package Vista.InicioSesion;

import Controlador.InicioSesion.PressLogin;
import Controlador.InicioSesion.PressSingUp;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author marce
 */
public class Loging extends JFrame {
    public Loging() {
        initComponents();
        initControllers();
    }
    private void initControllers(){
        btnLogin.addActionListener(new PressLogin(txtUser , txtPass));
        btnSingUp.addActionListener(new PressSingUp());
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - marce
        panel1 = new JPanel();
        titulo = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        btnLogin = new JButton();
        btnSingUp = new JButton();
        txtUser = new JTextField();
        txtPass = new JPasswordField();

        //======== this ========
        setBackground(new Color(0x100e0e));
        setLocationByPlatform(true);
        setResizable(false);
        setPreferredSize(new Dimension(360, 320));
        setMaximumSize(null);
        setMinimumSize(null);
        setAlwaysOnTop(true);
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(Color.black);
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );

            //---- titulo ----
            titulo.setText("Red Chab\u00e1n");
            titulo.setFont(titulo.getFont().deriveFont(titulo.getFont().getStyle() | Font.BOLD, titulo.getFont().getSize() + 21f));
            titulo.setHorizontalAlignment(SwingConstants.CENTER);
            titulo.setForeground(new Color(0x13e6e6));

            //---- label1 ----
            label1.setText("Username:");
            label1.setFont(new Font(Font.SERIF, label1.getFont().getStyle(), label1.getFont().getSize() + 2));
            label1.setForeground(new Color(0x13e6e6));

            //---- label2 ----
            label2.setText("Password:");
            label2.setFont(new Font(Font.SERIF, label2.getFont().getStyle(), label2.getFont().getSize() + 2));
            label2.setForeground(new Color(0x13e6e6));

            //---- btnLogin ----
            btnLogin.setText("Login");
            btnLogin.setBackground(new Color(0x100e0e));
            btnLogin.setForeground(new Color(0x13e6e6));

            //---- btnSingUp ----
            btnSingUp.setText("SingUp");
            btnSingUp.setBackground(new Color(0x100e0e));
            btnSingUp.setForeground(new Color(0x13e6e6));

            //---- txtUser ----
            txtUser.setBackground(Color.white);
            txtUser.setFont(txtUser.getFont().deriveFont(txtUser.getFont().getSize() + 1f));

            //---- txtPass ----
            txtPass.setBackground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(titulo, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label1)
                                    .addComponent(label2))))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSingUp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPass, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(txtUser, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))))
                        .addGap(16, 16, 16))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(titulo)
                        .addGap(24, 24, 24)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSingUp)
                        .addGap(40, 40, 40))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
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
    // Generated using JFormDesigner Evaluation license - marce
    private JPanel panel1;
    private JLabel titulo;
    private JLabel label1;
    private JLabel label2;
    private JButton btnLogin;
    private JButton btnSingUp;
    private JTextField txtUser;
    private JPasswordField txtPass;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
