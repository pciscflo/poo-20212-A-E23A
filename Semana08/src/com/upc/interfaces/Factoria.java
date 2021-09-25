package com.upc.interfaces;

public class Factoria {
    public static   INegocio obtenerInstancia(){
        return new Negocio();
    }
}
