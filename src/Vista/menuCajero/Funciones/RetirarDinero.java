/*
 * Created by JFormDesigner on Tue Jul 18 19:27:52 GMT 2023
 */

package Vista.menuCajero.Funciones;

import Controlador.FuncionesMenu.Funciones.Chek;
import Controlador.FuncionesMenu.Funciones.Deposit;
import Controlador.FuncionesMenu.Funciones.Filtro;
import Controlador.FuncionesMenu.Funciones.Withdraw;
import Controlador.funcionesMenu.PressBack;
import Entitys.Usuarios.Cliente;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author marce
 */
public class RetirarDinero extends JFrame {
    
    Cliente cliente;
    public RetirarDinero(Cliente cliente) {
        this.cliente=cliente;
        initComponents();
        initControllers();
    }

    public void initControllers(){
        btnBack.addActionListener(new PressBack(cliente));
        txtCantidad.addKeyListener(new Filtro());
        checkPesos.addItemListener(new Chek(checkUsd));
        checkUsd.addItemListener(new Chek(checkPesos));
        btnRetirar.addActionListener(new Withdraw(cliente,checkPesos , txtCantidad));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - marcelo
        panel1 = new JPanel();
        label1 = new JLabel();
        txtCantidad = new JTextField();
        label2 = new JLabel();
        separator1 = new JSeparator();
        checkPesos = new JRadioButton();
        checkUsd = new JRadioButton();
        btnRetirar = new JButton();
        btnBack = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x100e0e));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
            .EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax
            .swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,
            12),java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans
            .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.
            getPropertyName()))throw new RuntimeException();}});

            //---- label1 ----
            label1.setText("Retirar Saldo");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font(Font.SERIF, Font.PLAIN, 18));
            label1.setForeground(new Color(0x00cccc));
            label1.setBackground(new Color(0x100e0e));

            //---- label2 ----
            label2.setText("Cantidad:");
            label2.setForeground(Color.white);
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- checkPesos ----
            checkPesos.setText("Pesos");
            checkPesos.setBackground(new Color(0x100e0e));
            checkPesos.setForeground(Color.white);
            checkPesos.setSelected(true);

            //---- checkUsd ----
            checkUsd.setText("Dolares");
            checkUsd.setBackground(new Color(0x100e0e));
            checkUsd.setForeground(Color.white);

            //---- btnRetirar ----
            btnRetirar.setText("Retirar");
            btnRetirar.setBackground(new Color(0x100e0e));
            btnRetirar.setForeground(Color.white);

            //---- btnBack ----
            btnBack.setText("Volver");
            btnBack.setBackground(new Color(0x100e0e));
            btnBack.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCantidad))))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(checkPesos)
                                        .addGap(27, 27, 27)
                                        .addComponent(checkUsd)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnRetirar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(checkPesos)
                            .addComponent(checkUsd))
                        .addGap(18, 18, 18)
                        .addComponent(btnRetirar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)
                        .addGap(0, 9, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - marcelo
    private JPanel panel1;
    private JLabel label1;
    private JTextField txtCantidad;
    private JLabel label2;
    private JSeparator separator1;
    private JRadioButton checkPesos;
    private JRadioButton checkUsd;
    private JButton btnRetirar;
    private JButton btnBack;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
