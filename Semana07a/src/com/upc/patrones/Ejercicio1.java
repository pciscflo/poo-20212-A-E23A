package com.upc.patrones;

public class Ejercicio1 {
    public static void main(String[] args) {
        MiSingleton s1 = MiSingleton.dameInstancia();
        System.out.println(s1.obtenerMensaje());
        MiSingleton s2 = MiSingleton.dameInstancia();
        System.out.println(s2.obtenerMensaje());
        if(s1 == s2){
            System.out.println("Iguales");
        }
    }
}
