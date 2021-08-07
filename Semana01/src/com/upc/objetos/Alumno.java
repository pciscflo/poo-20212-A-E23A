package com.upc.objetos;

public class Alumno {
    private String codigo;
    private String nombre;
    private int nota1;
    private int nota2;
    //private double promedio; //No por que se peude calcular con nota1 y nota2

    public Alumno(String codigo, String nombre, int nota1, int nota2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Alumno() {
    }

    public double calcularPromedio(){  //metodo se inicia en minuscula y debe ser un verbo
        double promedio;
        promedio = (this.nota1 + this.nota2)/2.0;
        return promedio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
}
