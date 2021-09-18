package com.upc.patrones;

public class Ejercicio2 {
    public static void main(String[] args) {
       Figura c =  Factoria.dameFigura("CU");
       c.pintar();
       Figura x = Factoria.dameFigura("CI");
       x.pintar();
    }
}
