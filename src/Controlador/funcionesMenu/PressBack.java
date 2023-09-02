package Controlador.funcionesMenu;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;
import Vista.menuCajero.MenuCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressBack implements ActionListener {

    Cliente cliente;

    public PressBack(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorMain.cerrarVentana();
        ControladorMain.ventanaActual= new MenuCliente(cliente);
        ControladorMain.verVentana();
    }
}
