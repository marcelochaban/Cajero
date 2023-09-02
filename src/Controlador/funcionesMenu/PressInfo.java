package Controlador.funcionesMenu;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;
import Vista.menuCajero.Funciones.InfoCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressInfo implements ActionListener {
    Cliente cliente;

    public PressInfo(Cliente cliente) {
        this.cliente = cliente;
        System.out.printf(String.valueOf(cliente));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorMain.cerrarVentana();
        ControladorMain.ventanaActual=new InfoCliente(cliente);
        ControladorMain.verVentana();
    }
}
