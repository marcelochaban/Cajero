package Entitys.Tarjetas;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;

public abstract class Tarjeta {

    String numTarjeta;
    public static String randomizarNumero(){
        String num="";
        for (int i=0; i<=11;i++){
            int valorEntero = (int) (Math.floor(Math.random()*(9-0+1)+0));
            num=num+valorEntero;
            if (i%4==0){
                num=num+" ";
            }
        }
        return num;
    }

    public static boolean esNumeroTarjetaUnico(String numeroTarjeta) {
        for (Cliente cliente : ControladorMain.listaClientes) {
            if (cliente.getDebito().getNumTarjeta().equals(numeroTarjeta)) {
                return false; // El número de tarjeta no es único
            }
        }
        return true; // El número de tarjeta es único
    }

    public static boolean esCbuUnico(String cbu) {
        for (Cliente cliente : ControladorMain.listaClientes) {
            if (cliente.getDebito().getCbu().equals(cbu)) {
                return false; // El código CBU no es único
            }
        }
        return true; // El código CBU es único

    }
}
