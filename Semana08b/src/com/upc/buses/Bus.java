package com.upc.buses;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private String nombre;
    private List<Asiento> asientos;

    public Bus() { // creamos los 40 asientos, vacios, libres y sin vecino asignado
        Asiento asiento;
        this.asientos = new ArrayList<>();
        for(int i=0; i<40;i++ ){
            asiento = new Asiento(i);
            asiento.setReservado(false);
            asientos.add(asiento);
        }
    }

    public void reservarAsiento(Vecino vecino) throws Exception {
        if (!elVecinoYaReservo(vecino.getDni())){
           for(Asiento asiento: this.asientos){
              if(!asiento.isReservado()){
                asiento.setVecino(vecino);
                asiento.setReservado(true);
                return;
              }
           }
           throw new Exception("El asiento ya está reservado");
        }else {
            throw new Exception("Asiento usted ya reservó");
        }
    }

    public boolean elVecinoYaReservo(String dni){
        for(Asiento asiento: this.asientos){
            if(asiento.getVecino()!=null){
                if(asiento.getVecino().getDni()==dni) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
