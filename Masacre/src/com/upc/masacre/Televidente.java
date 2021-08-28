package com.upc.masacre;

public class Televidente extends Participante{
    private String telefono;
    private int cantidadLlamadas;

    public Televidente(String nombre, String apellido, String dni, int edad, int cantidadMensajes, String telefono, int cantidadLlamadas) {
        super(nombre, apellido, dni, edad, cantidadMensajes);
        this.telefono = telefono;
        this.cantidadLlamadas = cantidadLlamadas;
    }

    @Override
    public double obtenerPuntaje() {
        double puntaje;
        puntaje = this.getCantidadMensajes() * 4 + this.cantidadLlamadas * 3;
        return puntaje;
    }

    @Override
    public String validarDatos() {
        String mensaje = "";
        if(this.telefono == null){
            mensaje += "El campo telefono esta vacio.\n";
        }
        if(this.cantidadLlamadas <= 0){
            mensaje += "El campo cantidad de llamadas tiene que ser mayor a 0.\n";
        }
        mensaje += super.validarDatos();
        return mensaje;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantidadLlamadas() {
        return cantidadLlamadas;
    }

    public void setCantidadLlamadas(int cantidadLlamadas) {
        this.cantidadLlamadas = cantidadLlamadas;
    }
}
