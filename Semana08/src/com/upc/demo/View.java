package com.upc.demo;

import java.util.List;

public class View {
    public void imprimirListado(List<Profesor> profesores) {
        System.out.println("-----------------------");
        for(Profesor p:profesores){
            System.out.println(p.getNombre() + "   " + p.calcularSueldo());
        }
        System.out.println("-----------------------");
    }

    public void mostrarGanaMas(Profesor p) {
        System.out.println("El profesor que gana mas es: " + p.getNombre());
    }
}
