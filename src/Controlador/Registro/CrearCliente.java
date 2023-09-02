package Controlador.Registro;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;
import Vista.InicioSesion.Loging;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CrearCliente implements ActionListener {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private LocalDate fecha;
    private String user;
    private String pass;
    private String comp;
    private JTextField txtUser;
    private JTextField txtPass;
    private JTextField txtComp;

    public CrearCliente(String nombre, String apellido, String dni, String direccion,
                        LocalDate fecha, JTextField txtUser, JTextField txtPass, JTextField txtComp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fecha = fecha;
        this.txtUser = txtUser;
        this.txtPass = txtPass;
        this.txtComp = txtComp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        user=txtUser.getText();
        pass=txtPass.getText();
        comp=txtComp.getText();
        if (!user.isBlank()&& !pass.isBlank() && !comp.isBlank()){
            if (pass.equals(comp)){
                ControladorMain.listaClientes.add(
                        new Cliente(nombre,apellido,dni,direccion,user,pass,fecha));
                ControladorMain.listaClientes.get(Cliente.cantidadCliente-1).crearCuenta();
                ControladorMain.cerrarVentana();
                ControladorMain.ventanaActual=new Loging();
                ControladorMain.verVentana();
            }else {
                JOptionPane.showMessageDialog(null,"No coinciden las claves");
            }
        }else {
            JOptionPane.showMessageDialog(null,"No deje casileros en blanco");
        }
    }
}
