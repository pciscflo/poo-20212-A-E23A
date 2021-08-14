package com.ripley.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("A1001","Toyota","Yaris",20000,4,2021);
        Auto auto2 = new Auto("B2002","Suzuki","Swift",23000,2,2021);
        Auto auto3 = new Auto("A3000","Mercedes Benz", "Jumbo",35000,4,2015);
        List<Auto> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        for(Auto p:autos){
            System.out.println(p.getCodigo() + "  " + p.getMarca()+ "  " + p.getModelo() + "  " +
                   p.getAño() + "  " + p.getPrecio() + "  " + p.calcularDescuento() + "  " + p.calcularPrecioFinal());
        }
        //buscar un auto segun codigo y cambiar su precio

    }

}
