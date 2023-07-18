/*
 * Created by JFormDesigner on Tue Jul 18 05:51:52 GMT 2023
 */

package Vista.menuCajero.Funciones;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author marce
 */
public class IngresarDinero extends JFrame {
    public IngresarDinero() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - marcelo
        panel1 = new JPanel();
        label1 = new JLabel();
        txtName = new JTextField();
        label2 = new JLabel();
        separator1 = new JSeparator();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        button2 = new JButton();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x100e0e));
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
            javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax
            . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
            . awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
            . Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .
            PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .
            equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

            //---- label1 ----
            label1.setText("Informaci\u00f3n Cliente");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font(Font.SERIF, Font.PLAIN, 18));
            label1.setForeground(new Color(0x00cccc));
            label1.setBackground(new Color(0x100e0e));

            //---- label2 ----
            label2.setText("Cantidad:");
            label2.setForeground(Color.white);
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- radioButton1 ----
            radioButton1.setText("Pesos");
            radioButton1.setBackground(new Color(0x100e0e));
            radioButton1.setForeground(Color.white);

            //---- radioButton2 ----
            radioButton2.setText("Dolares");
            radioButton2.setBackground(new Color(0x100e0e));
            radioButton2.setForeground(Color.white);

            //---- button2 ----
            button2.setText("Ingresar");
            button2.setBackground(new Color(0x100e0e));
            button2.setForeground(Color.white);

            //---- button1 ----
            button1.setText("Volver");
            button1.setBackground(new Color(0x100e0e));
            button1.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(label1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtName)))))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(radioButton1)
                                        .addGap(27, 27, 27)
                                        .addComponent(radioButton2)))
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
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
                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButton1)
                            .addComponent(radioButton2))
                        .addGap(18, 18, 18)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1)
                        .addGap(0, 9, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - marcelo
    private JPanel panel1;
    private JLabel label1;
    private JTextField txtName;
    private JLabel label2;
    private JSeparator separator1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
