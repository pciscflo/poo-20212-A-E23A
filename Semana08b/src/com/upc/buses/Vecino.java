package com.upc.buses;

public abstract class Vecino {
    private String dni;
    private int telefono;
    private boolean estadoCivil;
    private String correoElectronico;
    private int edad;

    public Vecino() {
    }

    public Vecino(String dni, int telefono, boolean estadoCivil, String correoElectronico,int edad) {
        this.dni = dni;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
    }

    public abstract String obtenerRegalo();

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Vecino{" +
                "dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", estadoCivil=" + estadoCivil +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", edad=" + edad +
                '}';
    }
}

