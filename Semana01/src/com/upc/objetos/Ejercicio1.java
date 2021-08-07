package com.upc.objetos;

public class Ejercicio1 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("u20123456","Pepito",16, 17);
        System.out.println(alumno1.calcularPromedio());
        Alumno alumno2 = new Alumno("8989898","Luis",18,19);
        System.out.println(alumno2.calcularPromedio());
        alumno1.setCodigo("u777777");
        System.out.println("Nuevo codigo del alumno:" + alumno1.getCodigo());

        Alumno alumno3 = new Alumno();
        alumno3.setCodigo("u8888888");
        alumno3.setNombre("Ana");
        alumno3.setNota1(15);
        alumno3.setNota2(16);

        System.out.println(alumno3.calcularPromedio());



    }
}
