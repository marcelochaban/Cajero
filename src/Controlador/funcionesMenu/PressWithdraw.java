package Controlador.funcionesMenu;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;
import Vista.menuCajero.Funciones.RetirarDinero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressWithdraw implements ActionListener {
    Cliente cliente;

    public PressWithdraw(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorMain.cerrarVentana();
        ControladorMain.ventanaActual=new RetirarDinero(cliente);
        ControladorMain.verVentana();
    }
}
