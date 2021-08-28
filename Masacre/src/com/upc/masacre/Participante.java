package com.upc.masacre;

public abstract class Participante {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private int cantidadMensajes;

    public Participante() {
    }

    public Participante(String nombre, String apellido, String dni, int edad, int cantidadMensajes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.cantidadMensajes = cantidadMensajes;
    }

    public boolean validarEdad(){
        return this.edad >= 18;
    }

    public abstract double obtenerPuntaje();

    public String validarDatos(){
        String mensaje = "";
        if(this.nombre == null){
            mensaje += "El campo nombre esta vacio.\n";
        }
        if(this.apellido == null){
            mensaje += "El campo apellido esta vacio.\n";
        }
        if(this.dni == null){
            mensaje += "El campo dni esta vacio.\n";
        }
        if(this.edad <= 0){
            mensaje += "El campo edad tiene que ser mayor a 0.\n";
        }
        if(this.cantidadMensajes <= 0){
            mensaje += "El campo cantidad de mensajes tiene que ser mayor a 0.\n";
        }
        if(!this.validarEdad()){
            mensaje += "El participante tiene que ser mayor de edad.\n";
        }
        return mensaje;
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadMensajes() {
        return cantidadMensajes;
    }

    public void setCantidadMensajes(int cantidadMensajes) {
        this.cantidadMensajes = cantidadMensajes;
    }
}
