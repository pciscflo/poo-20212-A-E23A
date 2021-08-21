package com.upc.herencia;

public class ProfesorTC extends Profesor{
   private double sueldoFijo;
   private double porcAFP;

    public ProfesorTC(String dni, String nombre, int edad, double sueldoFijo, double porcAFP) {
        super(dni, nombre, edad);//llama al constructor de la superclase (Profesor)
        this.sueldoFijo = sueldoFijo;
        this.porcAFP = porcAFP;
    }

     public double calcularSueldo() {//sobreescritura // polimorfismo
        double sueldo;
        sueldo = this.sueldoFijo - this.porcAFP*this.sueldoFijo + this.calcularBono() ;
        return sueldo;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public double getPorcAFP() {
        return porcAFP;
    }

    public void setPorcAFP(double porcAFP) {
        this.porcAFP = porcAFP;
    }
}
