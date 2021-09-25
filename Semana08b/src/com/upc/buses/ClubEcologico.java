package com.upc.buses;

public class ClubEcologico extends Vecino{

    public ClubEcologico(String dni, int telefono, boolean estadoCivil, String correoElectronico, int edad) {
        super(dni, telefono, estadoCivil, correoElectronico, edad);
    }

    @Override
    public String obtenerRegalo() {
        String dato="";
        if(isEstadoCivil()){
            dato="Obsequio: Sublime";
        }
        return dato;

    }
}
