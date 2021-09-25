package com.upc.interfaces;

public class Ejemplo1 {
    public static void main(String[] args) {
        INegocio iNegocio = Factoria.obtenerInstancia();
        System.out.println(iNegocio.suma(10,8));
    }
}
