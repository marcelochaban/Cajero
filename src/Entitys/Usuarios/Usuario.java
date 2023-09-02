package Entitys.Usuarios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public abstract class Usuario {
    String nombre;
    String apellido;
    String dni;
    String direccion;
    String userName;
    String password;
    LocalDate fechaNacimiento;
    LocalDate ahora= LocalDate.now();
    int edad;
    Period diferenciaTiempo;
    Scanner sc=new Scanner(System.in);

    public Usuario(){}

    public int getEdad() {
        return edad;
    }

    public String getNombreCompleto() {
        return nombre+"."+apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String nombre, String apellido, String dni, String direccion, String userName, String password , LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.userName = userName;
        this.password = password;
        this.fechaNacimiento=fechaNacimiento;

    }

}
