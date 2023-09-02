package Controlador.funcionesMenu;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;
import Vista.menuCajero.Funciones.ConsultarSaldo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressCheckBalance implements ActionListener {
    Cliente cliente;

    public PressCheckBalance(Cliente cliente) {
        this.cliente=cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorMain.cerrarVentana();
        ControladorMain.ventanaActual=new ConsultarSaldo(cliente);
        ControladorMain.verVentana();
    }

}
