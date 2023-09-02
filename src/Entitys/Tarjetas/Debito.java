package Entitys.Tarjetas;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Debito extends Tarjeta{

    String cbu;
    String alias;
    String numTarjeta;
    public static int cantidadTarjeta=0;
    private final int idTarjeta;
    String preFijoDeb="2222 ";
    private double saldoPesos;
    private double saldoUsd;
    private String auxString;
    Cliente cliente;
    public Debito(int idCliente){
        this.cliente= ControladorMain.listaClientes.get(idCliente);
        idTarjeta=cantidadTarjeta;
        cantidadTarjeta++;
    }

    public void iniciarCuenta(){
        do {
            numTarjeta = randomizarNumero();
        } while (esNumeroTarjetaUnico(numTarjeta));

        do {
            cbu = Tarjeta.randomizarNumero();
            cbu=cbu.replaceAll("\\s", "");
        } while (esCbuUnico(cbu));

        numTarjeta = preFijoDeb + numTarjeta;
        alias = "" + cliente.getNombreCompleto() + cliente.getIdCliente();
    }

    public void ingresarDinero(double ingreso,int moneda) {
        switch (moneda){
            case 0:
                saldoPesos +=ingreso;
                break;
            case 1:
                saldoUsd +=ingreso;
                break;
            default:
                System.out.println("no ingreso una moneda valida");
                break;
        }

    }


    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public double getSaldoPesos() {
        return saldoPesos;
    }

    public void setSaldoPesos(double saldoPesos) {
        this.saldoPesos += saldoPesos;
    }

    public double getSaldoUsd() {
        return saldoUsd;
    }

    public void setSaldoUsd(double saldoUsd) {
        this.saldoUsd += saldoUsd;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
}
