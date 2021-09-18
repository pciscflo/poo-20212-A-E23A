package com.upc.factoria.navieras;

import java.util.List;
import java.util.Scanner;

public class EjercicioGrupalMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int codigo;
        JefeEnvios jefe = JefeEnvios.obtenerInstancia("Pepe");
        //Envio maritimo1 = new Maritimo(111,200,3,"El Barco");
        Envio maritimo1 = Factoria.dameObjeto("MA","111","2002","32","El Barco");
        jefe.registrarEnvio(maritimo1);
        System.out.println(jefe.obtenerCostoTotalEnvios());

    }

}
