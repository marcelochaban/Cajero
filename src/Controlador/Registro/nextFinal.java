package Controlador.Registro;

import Controlador.ControladorMain;
import Vista.Registro.MenuRegistroFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class nextFinal implements ActionListener {
    private JTextField txtDay;
    private JTextField txtMonth;
    private JTextField txtYear;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int day;
    private int month;
    private int year;
    private int edad;
    Period diferenciaTiempo;
    LocalDate ahora= LocalDate.now();
    private boolean comprobador = true;

    LocalDate fecha;

    public nextFinal(JTextField txtDay, JTextField txtMonth, JTextField txtYear, String nombre, String apellido, String dni, String direccion) {
        this.txtDay = txtDay;
        this.txtMonth = txtMonth;
        this.txtYear = txtYear;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            year = Integer.parseInt(txtYear.getText());
            month= Integer.parseInt(txtMonth.getText());
            day=Integer.parseInt(txtDay.getText());
            if (year > 1886 || year < 2024 || month > 1 || month < 12){
                if (month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12) {
                    if (day > 1 || day < 31) {
                        comprobador=false;
                    }
                }else if (month == 4 && month == 6 && month == 9 && month == 11) {
                    if (day > 1 || day < 30) {
                        comprobador=false;
                    }
                }else {
                    if (year % 4 == 0 && day == 29) {
                        comprobador=false;
                    } else if (day > 0 && day < 29) {
                        comprobador=false;
                    }
                }

                if (comprobador){
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha valida");
                }else {
                    fecha=LocalDate.of(year,month,day);
                    diferenciaTiempo = Period.between(fecha,ahora);
                    edad = diferenciaTiempo.getYears();
                    if (edad>18){
                        ControladorMain.cerrarVentana();
                        ControladorMain.ventanaActual=new MenuRegistroFinal(nombre,apellido,direccion,dni,fecha);
                        ControladorMain.verVentana();
                    }else {
                        JOptionPane.showMessageDialog(null,"No puede registrar una cuenta a nombre de un menor de edad");
                    }
                }
            }
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,"Los campos solo pueden contener numeros");
        }
    }
}
