package Controlador;

import Entitys.Usuarios.Cliente;
import Vista.InicioSesion.Loging;
import Vista.menuCajero.Funciones.EnviarDinero;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ControladorMain {
    public static ArrayList<Cliente> listaClientes;

    public static JFrame ventanaActual =new Loging();
    LocalDate fecha = LocalDate.of(2000, 7, 14);

    public ControladorMain() {
        listaClientes=new ArrayList<Cliente>();
        listaClientes.add(new Cliente("Marcelo","chaban","44985461","yapeyu","marce","1234",fecha));
        listaClientes.get(0).crearCuenta();
        System.out.println(listaClientes.size());
        verVentana();
    }

    public static void verVentana(){
        ventanaActual.setVisible(true);
    }

    public static void cerrarVentana(){
        ventanaActual.dispose();
    }
}
