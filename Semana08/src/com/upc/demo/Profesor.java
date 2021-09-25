package com.upc.demo;

public abstract class Profesor {
    private String dni;
    private String nombre;
    private int edad;

    public Profesor(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract double calcularSueldo();

    public double calcularBono(){
        double bono =0;
        if(this.edad>=50){
            bono = 100;
        }
        return bono;
    }

    public Profesor() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
