package com.ripley.arreglos;

public class Auto {
    private String codigo;
    private String marca;
    private String modelo;
    private double precio;
    private int numeroPuertas;
    private int año;

    public Auto() {
    }

    public Auto(String codigo, String marca, String modelo, double precio, int numeroPuertas, int año) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.numeroPuertas = numeroPuertas;
        this.año = año;
    }

    public double calcularDescuento(){
        double descuento = 0;
        if (this.año < 2021){
            descuento = 0.20*this.precio;
        }
        return descuento;
    }

    public double calcularPrecioFinal(){
        return (this.precio - calcularDescuento());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
