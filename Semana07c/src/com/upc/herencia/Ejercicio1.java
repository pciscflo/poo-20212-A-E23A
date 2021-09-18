package com.upc.herencia;

public class Ejercicio1 {
    public static void main(String[] args) {
        ProfesorTC ptc1 = new ProfesorTC("88888888","Pepe",29,1000,0.12);
        ProfesorTP ptp1 = new ProfesorTP("99999999","Luis",27,40,30);
        ProfesorTC ptc2 = new ProfesorTC("55555555","Karen",30,2000,0.13);

        System.out.println(ptc1.getNombre() + "  " + ptc1.calcularSueldo());
        System.out.println(ptp1.getNombre()+ "   " + ptp1.calcularSueldo());
        System.out.println(ptc2.getNombre()+ "   " + ptc2.calcularSueldo());


    }
}
