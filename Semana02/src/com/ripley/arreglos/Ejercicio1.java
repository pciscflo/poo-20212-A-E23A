package com.ripley.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {//Se inicia en mayúscula

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Luis");
        nombres.add("Pedro");
        nombres.add("Carmen");
        for(String p:nombres){
            System.out.println(p);
        }
    }
}
