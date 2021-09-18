package com.upc.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Factura> arregloFacturas;

    public Administrador() {
        this.arregloFacturas = new ArrayList<>();
    }

    public void registrar(Factura factura){
        this.arregloFacturas.add(factura);
    }

    public Factura buscarFactura(int numeroFactura){
        for(Factura p: this.arregloFacturas){
            if (p.getCabecera().getNumeroFactura()== numeroFactura){
                return p;
            }
        }
        return null;
    }

    public List<Factura> getArregloFacturas() {
        return arregloFacturas;
    }

    public void setArregloFacturas(List<Factura> arregloFacturas) {
        this.arregloFacturas = arregloFacturas;
    }
}
