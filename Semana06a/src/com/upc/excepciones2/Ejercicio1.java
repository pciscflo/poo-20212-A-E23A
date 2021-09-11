package com.upc.excepciones2;

public class Ejercicio1 {

    public static void main(String args[]) {
        Negocio negocio = new Negocio();
        try {
            System.out.println(negocio.dividir(10, 0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fin de Main");
    }
}