package com.upc.avanzado;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private String nombre;
    private List<Profesor> profesores;//teorema de Liskov

    public Administrador(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }
    public void registrar(Profesor profesor){
        this.profesores.add(profesor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
