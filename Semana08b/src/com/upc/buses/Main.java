package com.upc.buses;

public class Main {
    public static void main(String[] args) {
        Vecino vecino1 = new AdultoMayor("88888888",3484878,true,
                "cesar@gmail.com",23);
        Vecino vecino2 = new ClubEcologico("99999999",3487852,false,
                "pepe@gmail.com",32);
        Municipalidad municipalidad = new Municipalidad();
        try {
            municipalidad.reservarAsiento(vecino1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            municipalidad.reservarAsiento(vecino2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-------- Vecinos Registrados   --------");
        for(Vecino v:municipalidad.listarVecinos()){
            System.out.println(v.toString());
        }
        System.out.println("-------- Asientos Ocupados   --------");
        for(Asiento a:municipalidad.listaAsientosOcupados()){
            System.out.println(a.toString());
        }
    }
}
