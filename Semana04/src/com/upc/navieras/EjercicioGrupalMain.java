package com.upc.navieras;

import java.util.List;
import java.util.Scanner;

public class EjercicioGrupalMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int codigo;
        JefeEnvios jefe = new JefeEnvios("Pepito");

        Maritimo envioMar1 = new Maritimo(77777, 45.50, 5, "UPC Villa");
        jefe.registrarEnvio(envioMar1);

        Ultramaritimos envioUltra1 = new Ultramaritimos(88888, 358, 2, 345, "Lopez de Paz");
        jefe.registrarEnvio(envioUltra1);

        Maritimo envioMar2 = new Maritimo(99999, 77.70, 4, "Ferreiros S.A.");
        jefe.registrarEnvio(envioMar2);

        Maritimo envioMar3 = new Maritimo(99999, 100.50, 2, "Plaz VEA  Peru");
        jefe.registrarEnvio(envioMar3);

        List<Envio> envios1 = jefe.obtenerEnviosPorTipo(Maritimo.class);//hay otras formas de resolver
        System.out.println("************ Maritimos *************");
        for(Envio e:envios1){
            System.out.println(e.obtenerFila());
        }
        System.out.println("************ Ultramarinos **********");
        List<Envio> envios2 = jefe.obtenerEnviosPorTipo(Ultramaritimos.class);
        for(Envio e:envios2){
            System.out.println(e.obtenerFila());
        }
        System.out.println("Costo total de Envíos: " + jefe.obtenerCostoTotalEnvios());
        System.out.println("-------------------------------");
        System.out.println("Ingrese Codigo de Envio:");
        codigo = sc.nextInt();
        System.out.println("Costo del envio es:" + jefe.obtenerCalculoDeUnEnvio(codigo));


    }

}
