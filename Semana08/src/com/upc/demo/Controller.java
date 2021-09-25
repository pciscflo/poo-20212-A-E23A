package com.upc.demo;

public class Controller {
    private Administrador administrador; //MODEL -- Negocio
    private View view;

    public Controller(String nombre) {
        administrador = Administrador.obtenerInstancia(nombre);
        view = new View();
    }

    public void registrarProfesor(String... arg) {
        Profesor profesor = Factoria.dameObjeto(arg);
        administrador.registrar(profesor);
    }


    public void mostrarGanaMas() {
        Profesor p = administrador.ganaMas();
        view.mostrarGanaMas(p);
    }

    public void mostrarListadoProfesores() {
        view.imprimirListado(administrador.getProfesores());
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }


}
