package com.upc.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Item> arregloItems;
    private Cabecera cabecera;

    public Factura() {
    }

    public Factura(Cabecera cabecera) {
        this.arregloItems = new ArrayList<>();
        this.cabecera = cabecera;
    }

    public void registrarItem(Item item) throws Exception{
        item.validaCantidad();
        this.arregloItems.add(item);
    }

    public double calcularTotal(){
        double suma=0;
        for(Item p:this.arregloItems){
            suma+=p.calcularSubTotal();
        }
        return suma;
    }
    public double calcularIGV(){
        return (0.18/1.18)*calcularTotal();
    }

    public List<Item> getArregloItems() {
        return arregloItems;
    }

    public void setArregloItems(List<Item> arregloItems) {
        this.arregloItems = arregloItems;
    }

    public Cabecera getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecera cabecera) {
        this.cabecera = cabecera;
    }
}
