package com.upc.patrones;

public class MiSingleton {
    private static MiSingleton singleton = new MiSingleton();

    private MiSingleton() {
    }

    public static MiSingleton dameInstancia(){
        return singleton;
    }

    public String obtenerMensaje(){
        return "Holas!!!";
    }

}
