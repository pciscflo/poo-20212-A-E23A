package com.upc.mvc;

public class Ejercicio1 {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Negocio negocio = new Negocio("a45889","Celular",1089);
        Controlador controlador = new Controlador(vista,negocio);
        //*****************************
        controlador.calcularDescuento();

    }
}
