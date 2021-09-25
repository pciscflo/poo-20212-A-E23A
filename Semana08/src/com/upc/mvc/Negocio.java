package com.upc.mvc;

public class Negocio {
    private String codigo;
    private String descripcion;
    private double precio;

    public Negocio(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double calcularDescuento(){
        double d=0;
        if (precio > 1000){
            d=0.10*precio;
        }
        return d;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
