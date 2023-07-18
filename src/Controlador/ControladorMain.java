package Controlador;

import Entitys.Usuarios.Cliente;
import Vista.InicioSesion.Loging;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ControladorMain {
    public static ArrayList<Cliente> listaClientes;
    public static JFrame ventanaActual =new Loging();
    LocalDate fecha = LocalDate.of(2000, 7, 14);

    public ControladorMain() {
        System.out.println("entro");
        listaClientes=new ArrayList<>();
        listaClientes.add(new Cliente("Marcelo","chaban","44985461","yapeyu","marce","1234",fecha));
        ventanaActual.setVisible(true);
    }

    public static void verVentana(){
        ventanaActual.setVisible(true);
    }

    public static void cerrarVentana(){
        ventanaActual.dispose();
    }
}
