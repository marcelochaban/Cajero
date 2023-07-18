package Controlador.InicioSesion;

import Controlador.ControladorMain;
import Vista.Registro.MenuRegistro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pressSingUp implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorMain.cerrarVentana();
        ControladorMain.ventanaActual =new MenuRegistro();
        ControladorMain.verVentana();
    }
}
