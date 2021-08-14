package com.ripley.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("A1001","Toyota","Yaris",20000,4,2021);
        Auto auto2 = new Auto("B2002","Suzuki","Swift",23000,2,2021);
        Auto auto3 = new Auto("A3000","Mercedes Benz", "Jumbo",35000,4,2015);

        Empresa empresa = new Empresa("Peru Motors");
        empresa.registrar(auto1);
        empresa.registrar(auto2);
        empresa.registrar(auto3);

        List<Auto> autos;
        autos = empresa.getAutos();

        for(Auto p:autos){
            System.out.println(p.getCodigo() + "  " + p.getPrecio());
        }

        empresa.buscarActualizar("B2002", 25000);
        System.out.println("*************************");

        for(Auto p:autos){
            System.out.println(p.getCodigo() + "   " + p.getPrecio());
        }


    }
}
