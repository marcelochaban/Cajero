package Entitys.Usuarios;

import Controlador.ControladorMain;
import Entitys.Tarjetas.Debito;
import Entitys.Tarjetas.Tarjeta;

import java.time.LocalDate;
import java.util.ArrayList;

import static Controlador.ControladorMain.listaClientes;

public class Cliente extends Usuario{
    private final int idCliente;
    public static int cantidadCliente=0;
    private Debito debito;
    public int getIdCliente() {
        return idCliente;
    }

    public Cliente(String nombre, String apellido, String dni, String direccion, String userName, String password, LocalDate fechaNacimiento ) {
        super(nombre, apellido, dni, direccion, userName, password,fechaNacimiento);
        idCliente = cantidadCliente;
        cantidadCliente++;
    }

    public void crearCuenta(){
        this.debito=new Debito(idCliente);
        debito.iniciarCuenta();
    }

    public Debito getDebito() {
        return debito;
    }
}
