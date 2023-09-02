package Controlador.FuncionesMenu.Funciones;

import Entitys.Usuarios.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit implements ActionListener {

    JRadioButton check;
    JTextField txt;
    Cliente cliente;
    double auxDouble;
    String aux;

    public Deposit(Cliente cliente, JRadioButton check, JTextField txt) {
        this.cliente=cliente;
        this.check = check;
        this.txt = txt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        aux=txt.getText();
        try {
            auxDouble=Double.parseDouble(aux);
            if (auxDouble>0){
                if (check.isSelected()){
                    cliente.getDebito().setSaldoPesos(auxDouble);
                    JOptionPane.showMessageDialog(null , "Transferencia en pesos se realizo correctamente");
                }else {
                    cliente.getDebito().setSaldoUsd(auxDouble);
                    JOptionPane.showMessageDialog(null , "Transferencia en dolares se realizo correctamente");
                }
            }else {
                throw new NumberFormatException();
            }
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null , "monto no procesable");
        }

    }
}
