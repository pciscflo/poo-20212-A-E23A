package com.upc.relaciones;

public abstract class Bicicleta {
    private String material;
    private int tamañoRuedas;
    private int cantidadPlatosCambios;

    public Bicicleta(String material, int tamañoRuedas, int cantidadPlatosCambios) {
        this.material = material;
        this.tamañoRuedas = tamañoRuedas;
        this.cantidadPlatosCambios = cantidadPlatosCambios;
    }

    public Bicicleta() {
    }

    public abstract double calcularPrecioFinalBicicleta();
    public abstract double calcularPrecioBase();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamañoRuedas() {
        return tamañoRuedas;
    }

    public void setTamañoRuedas(int tamañoRuedas) {
        this.tamañoRuedas = tamañoRuedas;
    }

    public int getCantidadPlatosCambios() {
        return cantidadPlatosCambios;
    }

    public void setCantidadPlatosCambios(int cantidadPlatosCambios) {
        this.cantidadPlatosCambios = cantidadPlatosCambios;
    }
}
