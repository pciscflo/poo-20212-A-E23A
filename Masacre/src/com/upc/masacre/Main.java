package com.upc.masacre;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Televidente televidente1 = new Televidente("Jose", "Zavala", "11111111", 18, 25, "5632541", 56);
        Televidente televidente2 = new Televidente("Carmen", "Vera", "22222222", 21, 89, "6958745", 96);

        Fan fan1 = new Fan("Susana", "Mendez", "33333333", 26, 12, "Equipo Azul", 96, 152);
        Fan fan2 = new Fan("Carlos", "Fernandez", "44444444", 31, 56, "Equipo Rojo", 123, 134);


        Administrador administrador = new Administrador("Administrador");
        System.out.println(administrador.registrar(televidente1));
        System.out.println(administrador.registrar(televidente2));
        System.out.println(administrador.registrar(fan1));
        System.out.println(administrador.registrar(fan2));

        Participante participante = administrador.calcularGanador();
        System.out.println("\nGanador :" + participante.getNombre() + " " + participante.getApellido() + " obtuvo " + participante.obtenerPuntaje() + " puntos.\n");

        System.out.println("===============================================================");
        List<Participante> listaTelevidentes = administrador.listarPorTipo("TV");
        for(Participante p:listaTelevidentes){
            System.out.println("Televidente :" + p.getNombre() + " " + p.getApellido() + " obtuvo " + p.obtenerPuntaje() + " puntos.");
        }

        System.out.println("===============================================================");
        List<Participante> listaFans = administrador.listarPorTipo("FAN");
        for(Participante p:listaFans){
            System.out.println("Fan :" + p.getNombre() + " " + p.getApellido() + " obtuvo " + p.obtenerPuntaje() + " puntos.");
        }

    }

}
