package com.upc.patrones;

public class Ejercicio2 {
    public static void main(String[] args) {
       Figura cuadrado =  Factoria.dameFigura("CU");
       cuadrado.pintar();
       Figura x = Factoria.dameFigura("CI");
       x.pintar();
    }
}
