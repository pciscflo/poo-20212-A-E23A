package com.upc.buses;

public class AdultoMayor extends Vecino{

    public AdultoMayor(String dni, int telefono, boolean estadoCivil, String correoElectronico, int edad) {
        super(dni, telefono, estadoCivil, correoElectronico, edad);
    }

    @Override
    public String obtenerRegalo() {
        String dato="";
        if(getEdad()>70){
            dato="Obsequio: bebida";
        }
        return dato;
    }

}
