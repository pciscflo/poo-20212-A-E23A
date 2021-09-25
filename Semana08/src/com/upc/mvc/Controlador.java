package com.upc.mvc;

public class Controlador {
    private Vista vista;
    private  Negocio negocio;

    public Controlador(Vista vista, Negocio negocio) {
        this.vista = vista;
        this.negocio = negocio;
    }
    public void calcularDescuento() {
        double d = negocio.calcularDescuento();
        vista.mostrarResultado(d);
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }


}
