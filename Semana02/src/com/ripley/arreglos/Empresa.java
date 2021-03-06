package com.ripley.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Auto> autos;//atributo compuesto de la clase Empresa

    public Empresa() {
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void registrar(String codigo, String marca, String modelo, double precio, int numeroPuertas, int año){
        Auto auto = new Auto(codigo, marca, modelo, precio, numeroPuertas, año);
        this.autos.add(auto);
    }
    public String buscarActualizar(String codigo, double nuevoPrecio){
        for(Auto p:this.autos){
            if (p.getCodigo() == codigo){
                p.setPrecio(nuevoPrecio);
                return "Dato actualizado!";
            }
        }
        return "Dato no actualizado";
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
}
