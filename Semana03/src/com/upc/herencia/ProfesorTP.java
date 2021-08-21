package com.upc.herencia;

public class ProfesorTP extends Profesor{
    private int horas;
    private double tarifaHora;

    public ProfesorTP(String dni, String nombre, int edad, int horas, double tarifaHora) {
        super(dni, nombre, edad);
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSueldo(){
        double sueldo;
        sueldo = this.horas*this.tarifaHora + this.calcularBono();
        return sueldo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
}
