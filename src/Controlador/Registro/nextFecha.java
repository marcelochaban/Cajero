package Controlador.Registro;

import Controlador.ControladorMain;
import Vista.Registro.MenuRegistroFecha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nextFecha implements ActionListener {
    private JTextField txtName;
    private JTextField txtLName;
    private JTextField txtDNI;
    private JTextField txtDireccion;

    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    public nextFecha(JTextField txtName, JTextField txtLName, JTextField txtDNI, JTextField txtDireccion) {
        this.txtName = txtName;
        this.txtLName = txtLName;
        this.txtDNI = txtDNI;
        this.txtDireccion = txtDireccion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nombre=txtName.getText();
        apellido=txtLName.getText();
        dni=txtDNI.getText();
        direccion=txtDireccion.getText();
        if (!nombre.isBlank() && !apellido.isBlank() && !dni.isBlank() && !direccion.isBlank()){
            ControladorMain.cerrarVentana();
            ControladorMain.ventanaActual=new MenuRegistroFecha(nombre,apellido,direccion,dni);
            ControladorMain.verVentana();
        }else {
            JOptionPane.showMessageDialog(null , "No puede haber espacios en blanco");

        }
    }
}
