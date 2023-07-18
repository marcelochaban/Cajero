package Entitys.Tarjetas;

import Entitys.Usuarios.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Debito extends Tarjeta{
    public static int cantidadTarjeta=0;
    private final int idTarjeta;
    String preFijoDeb="2222 ";
    private double saldoPesos;
    private double saldoUsd;

    Cliente cliente;
    public static ArrayList<String> listaNumerosDebito=new ArrayList<>();
    public Debito(Cliente cliente){
        this.cliente=cliente;
        boolean validador=true;
        idTarjeta=cantidadTarjeta;
        cantidadTarjeta++;
        do {
            numTarjeta=randomizarNumero();
            if (listaNumerosDebito.size()!=0){
                for (int i=0 ; i<=listaNumerosDebito.size();) {
                    validador=numTarjeta.equals(listaNumerosDebito.get(i));
                }
            }else{
                numTarjeta=preFijoDeb+numTarjeta;
                validador=false;
            }
        } while (validador);
        numTarjeta=preFijoDeb+numTarjeta;
    }


}
