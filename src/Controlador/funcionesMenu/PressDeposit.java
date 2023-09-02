package Controlador.funcionesMenu;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;
import Vista.menuCajero.Funciones.IngresarDinero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressDeposit implements ActionListener {

    Cliente cliente;
    public PressDeposit(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorMain.cerrarVentana();
        ControladorMain.ventanaActual=new IngresarDinero(cliente);
        ControladorMain.verVentana();
    }
}
