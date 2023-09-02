/*
 * Created by JFormDesigner on Tue Jul 18 05:18:24 GMT 2023
 */

package Vista.menuCajero.Funciones;

import Controlador.funcionesMenu.PressBack;
import Entitys.Usuarios.Cliente;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author marce
 */
public class InfoCliente extends JFrame {
    Cliente cliente;

    public InfoCliente(Cliente cliente) {
        this.cliente=cliente;
        initComponents();
        initcontrollers();
    }

    public InfoCliente() {
        initComponents();
        initcontrollers();
    }

    private void initcontrollers(){
        btnBack.addActionListener(new PressBack(cliente));
        txtName.setText(cliente.getNombre());
        txtLName.setText(cliente.getApellido());
        txtDNI.setText(cliente.getDni());
        txtDireccion.setText(cliente.getDireccion());
        txtUser.setText(cliente.getUserName());
        txtPass.setText(cliente.getPassword());
        txtCBU.setText(cliente.getDebito().getCbu());
        txtAlias.setText(cliente.getDebito().getAlias());
        txtTarjeta.setText(cliente.getDebito().getNumTarjeta());


    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - marcelo
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        txtName = new JTextField();
        separator1 = new JSeparator();
        label3 = new JLabel();
        txtLName = new JTextField();
        separator2 = new JSeparator();
        label4 = new JLabel();
        txtDNI = new JTextField();
        separator3 = new JSeparator();
        label5 = new JLabel();
        txtDireccion = new JTextField();
        separator4 = new JSeparator();
        label7 = new JLabel();
        txtUser = new JTextField();
        separator5 = new JSeparator();
        label8 = new JLabel();
        txtPass = new JTextField();
        separator6 = new JSeparator();
        label9 = new JLabel();
        txtCBU = new JTextField();
        separator7 = new JSeparator();
        btnBack = new JButton();
        label10 = new JLabel();
        txtAlias = new JTextField();
        separator8 = new JSeparator();
        label6 = new JLabel();
        txtTarjeta = new JTextField();
        separator9 = new JSeparator();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x100e0e));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
            0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
            .BOTTOM,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt.Color.
            red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
            beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException();}});

            //---- label1 ----
            label1.setText("Informaci\u00f3n Cliente");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font(Font.SERIF, Font.PLAIN, 18));
            label1.setForeground(new Color(0x00cccc));

            //---- label2 ----
            label2.setText("Nombre:");
            label2.setForeground(Color.white);
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtName ----
            txtName.setEditable(false);
            txtName.setForeground(Color.black);
            txtName.setBackground(Color.white);

            //---- label3 ----
            label3.setText("Apellido:");
            label3.setForeground(Color.white);
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtLName ----
            txtLName.setEditable(false);
            txtLName.setForeground(Color.black);
            txtLName.setBackground(Color.white);

            //---- label4 ----
            label4.setText("D.N.I.  :");
            label4.setForeground(Color.white);
            label4.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtDNI ----
            txtDNI.setEditable(false);
            txtDNI.setForeground(Color.black);
            txtDNI.setBackground(Color.white);

            //---- label5 ----
            label5.setText("Direcci\u00f3n:");
            label5.setForeground(Color.white);
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtDireccion ----
            txtDireccion.setEditable(false);
            txtDireccion.setForeground(Color.black);
            txtDireccion.setBackground(Color.white);

            //---- label7 ----
            label7.setText("Usuario");
            label7.setForeground(Color.white);
            label7.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtUser ----
            txtUser.setEditable(false);
            txtUser.setForeground(Color.black);
            txtUser.setBackground(Color.white);

            //---- label8 ----
            label8.setText("Clave :");
            label8.setForeground(Color.white);
            label8.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtPass ----
            txtPass.setEditable(false);
            txtPass.setForeground(Color.black);
            txtPass.setBackground(Color.white);

            //---- label9 ----
            label9.setText("CBU");
            label9.setForeground(Color.white);
            label9.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtCBU ----
            txtCBU.setEditable(false);
            txtCBU.setForeground(Color.black);
            txtCBU.setBackground(Color.white);

            //---- btnBack ----
            btnBack.setText("Volver");
            btnBack.setBackground(new Color(0x100e0e));
            btnBack.setForeground(Color.white);

            //---- label10 ----
            label10.setText("Alias");
            label10.setForeground(Color.white);
            label10.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtAlias ----
            txtAlias.setEditable(false);
            txtAlias.setForeground(Color.black);
            txtAlias.setBackground(Color.white);

            //---- label6 ----
            label6.setText("Numero de tarjeta:");
            label6.setForeground(Color.white);
            label6.setHorizontalAlignment(SwingConstants.CENTER);

            //---- txtTarjeta ----
            txtTarjeta.setEditable(false);
            txtTarjeta.setForeground(Color.black);
            txtTarjeta.setBackground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 606, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(separator7))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(txtDNI, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(txtCBU, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGroup(panel1Layout.createParallelGroup()
                                                    .addGroup(panel1Layout.createSequentialGroup()
                                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel1Layout.createSequentialGroup()
                                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(txtLName, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panel1Layout.createParallelGroup()
                                                    .addGroup(panel1Layout.createSequentialGroup()
                                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(separator5, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel1Layout.createSequentialGroup()
                                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(txtPass, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(separator6, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label10, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAlias, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(separator4, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(separator8, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(separator9)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTarjeta, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(10, 10, 10))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(6, 6, 6)
                                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtLName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(12, 12, 12)
                                        .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(6, 6, 6)
                                        .addComponent(separator5, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(12, 12, 12)
                                        .addComponent(separator6, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtCBU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(6, 6, 6)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator7, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
                            .addComponent(separator8, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTarjeta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator9, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)
                        .addContainerGap(11, Short.MAX_VALUE))
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
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    public void initControllers(){
        btnBack.addActionListener(new PressBack(cliente));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - marcelo
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JTextField txtName;
    private JSeparator separator1;
    private JLabel label3;
    private JTextField txtLName;
    private JSeparator separator2;
    private JLabel label4;
    private JTextField txtDNI;
    private JSeparator separator3;
    private JLabel label5;
    private JTextField txtDireccion;
    private JSeparator separator4;
    private JLabel label7;
    private JTextField txtUser;
    private JSeparator separator5;
    private JLabel label8;
    private JTextField txtPass;
    private JSeparator separator6;
    private JLabel label9;
    private JTextField txtCBU;
    private JSeparator separator7;
    private JButton btnBack;
    private JLabel label10;
    private JTextField txtAlias;
    private JSeparator separator8;
    private JLabel label6;
    private JTextField txtTarjeta;
    private JSeparator separator9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
