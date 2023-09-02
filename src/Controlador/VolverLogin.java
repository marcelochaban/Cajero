package Controlador;

import Vista.InicioSesion.Loging;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolverLogin implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorMain.cerrarVentana();
        ControladorMain.ventanaActual=new Loging();
        ControladorMain.verVentana();
    }
}
