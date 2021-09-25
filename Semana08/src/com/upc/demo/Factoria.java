package com.upc.demo;

public class Factoria {
    public static Profesor dameObjeto(String... arg){

        Profesor profesor = null;

        switch (arg[0]){
            case "TC":
                profesor = new ProfesorTC(arg[1],arg[2],Integer.parseInt(arg[3]),Integer.parseInt(arg[4]),Double.parseDouble(arg[5]));
                break;
            case "TP":
                profesor = new ProfesorTP(arg[1],arg[2],Integer.parseInt(arg[3]),Integer.parseInt(arg[4]),Double.parseDouble(arg[5]));
                break;
        }
        return profesor;
    }
}
