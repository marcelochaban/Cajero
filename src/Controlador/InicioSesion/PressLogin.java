package Controlador.InicioSesion;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;
import Vista.menuCajero.MenuCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressLogin implements ActionListener {
    private JTextField jTxtUser;
    private JTextField jTxtPass;
    private String user;
    private String password;
    private boolean comp=true;

    public PressLogin(JTextField jTxtUser , JTextField jTxtPass) {
        this.jTxtUser = jTxtUser;
        this.jTxtPass = jTxtPass;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        user = jTxtUser.getText().toLowerCase();
        password = jTxtPass.getText().toLowerCase();
        for (Cliente cliente: ControladorMain.listaClientes) {
            if (cliente.getUserName().equals(user)){
                if (cliente.getPassword().equals(password)){
                    ControladorMain.cerrarVentana();
                    ControladorMain.ventanaActual =new MenuCliente(cliente);
                    ControladorMain.verVentana();
                }else {
                    JOptionPane.showMessageDialog(null , "Clave incorrecta");
                }
                comp=false;
                break;
            }else {
                comp=true;
            }
        }
        if (comp){
            JOptionPane.showMessageDialog(null ,
                    "no se ha encontrado un usuario con la informacion proporcionada");
        }
    }
}
