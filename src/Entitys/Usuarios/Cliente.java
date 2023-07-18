package Entitys.Usuarios;

import Controlador.ControladorMain;
import Entitys.Tarjetas.Debito;
import Entitys.Tarjetas.Tarjeta;

import java.time.LocalDate;
import java.util.ArrayList;

import static Controlador.ControladorMain.listaClientes;

public class Cliente extends Usuario{
    private final int idCliente;
    private static int cantidadCliente=0;

    public static ArrayList<Debito> listaDebito=new ArrayList<>();
    public static ArrayList<String> listaCBU=new ArrayList<>();
    public static ArrayList<String> listaAlias=new ArrayList<>();
    private String auxString;
    private boolean validador;
    public int getIdCliente() {
        return idCliente;
    }

    public Cliente(String nombre, String apellido, String dni, String direccion, String userName, String password, LocalDate fechaNacimiento ) {
        super(nombre, apellido, dni, direccion, userName, password,fechaNacimiento);
        idCliente = cantidadCliente;
        cantidadCliente++;
        do {
            auxString= Tarjeta.randomizarNumero();
            if (listaCBU.size()!=0){
                for (String s : listaCBU) {
                    auxString = Tarjeta.randomizarNumero();
                    validador = auxString.equals(s);
                }
            }
        } while (!validador);
        listaCBU.add(auxString);
        listaAlias.add(""+getNombreCompleto()+getIdCliente());
        listaDebito.add(new Debito(ControladorMain.listaClientes.get(idCliente)));
    }
}
