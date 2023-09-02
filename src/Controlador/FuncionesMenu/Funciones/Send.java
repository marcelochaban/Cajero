package Controlador.FuncionesMenu.Funciones;

import Controlador.ControladorMain;
import Entitys.Usuarios.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Send implements ActionListener {

    Cliente cliente;
    Cliente clienteDestino;
    JTextField txtCantidad;
    JTextField txtDestino;
    JRadioButton checkPesos;
    Double saldoP;
    Double saldoU;
    String cantidad;
    String destino;
    Double auxDouble;

    public Send(Cliente cliente, JTextField txtCantidad, JTextField txtDestino, JRadioButton checkPesos) {
        this.cliente = cliente;
        this.txtCantidad = txtCantidad;
        this.txtDestino = txtDestino;
        this.checkPesos = checkPesos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cantidad=txtCantidad.getText();
        destino=txtDestino.getText();
        saldoP=cliente.getDebito().getSaldoPesos();
        saldoU=cliente.getDebito().getSaldoUsd();
        comprobarDestino();
        if (clienteDestino != null){
            try {
                auxDouble=Double.parseDouble(cantidad);
                if (auxDouble>0){
                    if (checkPesos.isSelected()){
                        if ((saldoP-auxDouble>0)){
                            cliente.getDebito().setSaldoPesos(auxDouble*-1);
                            clienteDestino.getDebito().setSaldoPesos(auxDouble);
                            JOptionPane.showMessageDialog(null , "Se realizo la transferencia en pesos se realizo correctamente");
                        }else throw new NumberFormatException();
                    }else {
                        if ((saldoU-auxDouble>0)){
                            cliente.getDebito().setSaldoUsd(auxDouble*-1);
                            clienteDestino.getDebito().setSaldoUsd(auxDouble);
                            JOptionPane.showMessageDialog(null , "Se realizo la transferencia en dolares se realizo correctamente");
                        }else throw new NumberFormatException();
                    }
                }else throw new NumberFormatException();

            }catch (Exception exception){
                JOptionPane.showMessageDialog(null , "monto no procesable");
            }
        }else {
            JOptionPane.showMessageDialog(null , "No se ingreso un destinatario valido");
        }

    }

    public void comprobarDestino(){
        for (Cliente auxCliente : ControladorMain.listaClientes) {
            if (auxCliente.getDebito().getCbu().equals(destino) || auxCliente.getDebito().getAlias().equals(destino)){
                clienteDestino=auxCliente;
            }
        }
    }

}

