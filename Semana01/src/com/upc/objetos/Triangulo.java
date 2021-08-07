package com.upc.objetos;

public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo() {
    }

    public double calcularSemiperimetro(){
        return (this.ladoA + this.ladoB + this.ladoC)/2.0;
    }

    public double calcularArea(){
        double p, area;
        p = calcularSemiperimetro();
        area = Math.sqrt(p*(p-this.ladoA)*(p-this.ladoB)*(p-this.ladoC));
        return area;
    }

    public boolean validarLados(){


        return true;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
}
