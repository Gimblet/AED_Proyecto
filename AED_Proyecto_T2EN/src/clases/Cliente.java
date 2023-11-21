package clases;

import java.util.ArrayList;

public class Cliente {
    private int codigoCliente = 1001;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String dni;
    private ArrayList<Cliente> aLC = new ArrayList<Cliente>();
    //Constructor por defecto

    public Cliente(int codigoCliente, String nombres, String apellidos, String telefono, String dni) {
        this.codigoCliente = codigoCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.dni = dni;
    }

    //Getters and Setters

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //Metodos

    public void Ingreso(Cliente x) {
        aLC.add(x);
    }
}

