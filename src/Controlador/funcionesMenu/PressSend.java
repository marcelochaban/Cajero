package Controlador.funcionesMenu;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;
import Vista.menuCajero.Funciones.EnviarDinero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressSend implements ActionListener {

    Cliente cliente;

    public PressSend(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorMain.cerrarVentana();
        ControladorMain.ventanaActual=new EnviarDinero(cliente);
        ControladorMain.verVentana();
    }
}
