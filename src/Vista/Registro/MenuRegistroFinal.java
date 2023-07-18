/*
 * Created by JFormDesigner on Tue Jul 18 02:44:01 GMT 2023
 */

package Vista.Registro;

import Controlador.Registro.crearCliente;
import Controlador.volverLogin;

import java.awt.*;
import java.time.LocalDate;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author marce
 */
public class MenuRegistroFinal extends JFrame {

    String nombre;
    String apellido;
    String direccion;
    String dni;
    LocalDate fecha;

    public MenuRegistroFinal(String nombre, String apellido, String direccion, String dni, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.fecha = fecha;
        initComponents();
        initControllers();
    }

    public MenuRegistroFinal() {
        initComponents();
        initControllers();
    }

    private void initControllers(){
        btnCancelar.addActionListener(new volverLogin());
        btnCreate.addActionListener(new crearCliente(nombre,apellido,dni,direccion,fecha,txtUser,pass,comp));
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - marcelo
        panel1 = new JPanel();
        txtUser = new JTextField();
        label2 = new JLabel();
        separator1 = new JSeparator();
        label3 = new JLabel();
        separator2 = new JSeparator();
        label4 = new JLabel();
        separator3 = new JSeparator();
        label1 = new JLabel();
        label5 = new JLabel();
        btnCreate = new JButton();
        btnCancelar = new JButton();
        pass = new JPasswordField();
        comp = new JPasswordField();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x100e0e));
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );

            //---- label2 ----
            label2.setText("Usuario");
            label2.setForeground(Color.white);
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label3 ----
            label3.setText("Contrase\u00f1a:");
            label3.setForeground(Color.white);
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label4 ----
            label4.setText("repetir");
            label4.setForeground(Color.white);
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            label4.setVerticalAlignment(SwingConstants.BOTTOM);
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() - 2f));

            //---- label1 ----
            label1.setText("Sing-Up Red Chab\u00e1n");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font(Font.SERIF, Font.PLAIN, 18));
            label1.setForeground(new Color(0x00cccc));

            //---- label5 ----
            label5.setText("contrase\u00f1a:");
            label5.setForeground(Color.white);
            label5.setHorizontalAlignment(SwingConstants.CENTER);
            label5.setVerticalAlignment(SwingConstants.TOP);
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() - 2f));

            //---- btnCreate ----
            btnCreate.setText("Registrar");
            btnCreate.setForeground(Color.white);
            btnCreate.setBackground(new Color(0x100e0e));

            //---- btnCancelar ----
            btnCancelar.setText("Cancelar");
            btnCancelar.setForeground(Color.white);
            btnCancelar.setBackground(new Color(0x100e0e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(btnCancelar)
                                        .addGap(138, 138, 138)
                                        .addComponent(btnCreate))
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pass))
                                        .addComponent(separator2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comp, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5))
                            .addComponent(comp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(btnCancelar)
                            .addComponent(btnCreate))
                        .addGap(12, 12, 12))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
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
    private JTextField txtUser;
    private JLabel label2;
    private JSeparator separator1;
    private JLabel label3;
    private JSeparator separator2;
    private JLabel label4;
    private JSeparator separator3;
    private JLabel label1;
    private JLabel label5;
    private JButton btnCreate;
    private JButton btnCancelar;
    private JPasswordField pass;
    private JPasswordField comp;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
