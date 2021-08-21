package com.upc.avanzado;

public class Ejercicio2 {
    public static void main(String[] args) {
        ProfesorTC ptc1 = new ProfesorTC("88888888","Pepe",29,1000,0.12);
        ProfesorTP ptp1 = new ProfesorTP("99999999","Luis",27,40,30);
        ProfesorTC ptc2 = new ProfesorTC("55555555","Karen",30,2000,0.13);
        Administrador administrador = new Administrador("Freddy");
        administrador.registrar(ptc1);
        administrador.registrar(ptp1);
        administrador.registrar(ptc2);
        for(Profesor p:administrador.getProfesores()){
            System.out.println(p.getNombre() + "   " + p.calcularSueldo());
        }
    }
}
