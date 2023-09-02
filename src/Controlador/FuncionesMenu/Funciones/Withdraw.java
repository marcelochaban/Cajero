package Controlador.FuncionesMenu.Funciones;

import Entitys.Usuarios.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdraw implements ActionListener {
    JRadioButton check;
    JTextField txt;
    Cliente cliente;
    double auxDouble;

    double saldoP;
    double saldoU;

    String aux;

    public Withdraw(Cliente cliente, JRadioButton check, JTextField txt) {
        this.cliente=cliente;
        this.check = check;
        this.txt = txt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        aux=txt.getText();
        saldoP=cliente.getDebito().getSaldoPesos();
        saldoU=cliente.getDebito().getSaldoUsd();
        try {
            auxDouble=Double.parseDouble(aux);
            if (auxDouble>0){
                if (check.isSelected()){
                    if ((saldoP-auxDouble>0)){
                        cliente.getDebito().setSaldoPesos(auxDouble*-1);
                        JOptionPane.showMessageDialog(null , "Retiro en pesos se realizo correctamente");
                    }else throw new NumberFormatException();
                }else {
                    if ((saldoU-auxDouble>0)){
                        cliente.getDebito().setSaldoUsd(auxDouble*-1);
                        JOptionPane.showMessageDialog(null , "Retiro en dolares se realizo correctamente");
                    }else throw new NumberFormatException();
                }
            }else throw new NumberFormatException();

        }catch (Exception exception){
            JOptionPane.showMessageDialog(null , "monto no procesable");
        }

    }
}
