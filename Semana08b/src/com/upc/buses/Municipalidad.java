package com.upc.buses;

import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
    private  Bus bus;

    public Municipalidad() {
        bus = new Bus();
    }

    public void reservarAsiento(Vecino vecino) throws Exception {
        bus.reservarAsiento(vecino);
    }

    public List<Vecino>  listarVecinos(){
       List<Vecino> vecinos = new ArrayList<>() ;
       for(Asiento p: this.bus.getAsientos()){
           if(p.isReservado()) {
               vecinos.add(p.getVecino());
           }
       }
       return vecinos;
    }

    public List<Asiento> listaAsientosOcupados(){
        List<Asiento> ocupados = new ArrayList<>();
        for(Asiento a:this.bus.getAsientos()){
            if(a.isReservado()) {
                ocupados.add(a);
            }
        }
        return ocupados;
    }
}
