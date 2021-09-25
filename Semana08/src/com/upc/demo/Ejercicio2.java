package com.upc.demo;

public class Ejercicio2 {
    public static void main(String[] args) {
        Controller controller = new Controller("Pepe");
        controller.registrarProfesor("TC","88888888","Pepe","29","1000","0.12");//TDD
        controller.registrarProfesor("TP","99999999","Luis","27","40","30");
        controller.mostrarListadoProfesores();
        controller.mostrarGanaMas();
    }
}
