package com.ripley.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Peru Motors");

        empresa.registrar("A1001","Toyota","Yaris",20000,4,2021);
        empresa.registrar("B2002","Suzuki","Swift",23000,2,2021);
        empresa.registrar("A3000","Mercedes Benz", "Jumbo",35000,4,2015);

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
