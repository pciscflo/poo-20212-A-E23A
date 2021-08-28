package com.upc.masacre;

public class Fan extends Participante{
    private String nombreEquipo;
    private int puntajeBarra;
    private int puntajeEquipo;

    public Fan(String nombre, String apellido, String dni, int edad, int cantidadMensajes, String nombreEquipo, int puntajeBarra, int puntajeEquipo) {
        super(nombre, apellido, dni, edad, cantidadMensajes);
        this.nombreEquipo = nombreEquipo;
        this.puntajeBarra = puntajeBarra;
        this.puntajeEquipo = puntajeEquipo;
    }

    @Override
    public double obtenerPuntaje() {
        double puntaje;
        puntaje = this.getCantidadMensajes() * 4 + this.puntajeBarra + this.puntajeEquipo * 2;
        return puntaje;
    }

    @Override
    public String validarDatos() {
        String mensaje = "";
        if(this.nombreEquipo == null){
            mensaje += "El campo nombre equipo esta vacio.\n";
        }
        if(this.puntajeBarra <= 0){
            mensaje += "El campo puntaje barra tiene que ser mayor a 0.\n";
        }
        if(this.puntajeEquipo <= 0){
            mensaje += "El campo puntaje equipo tiene que ser mayor a 0.\n";
        }
        mensaje += super.validarDatos();
        return mensaje;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntajeBarra() {
        return puntajeBarra;
    }

    public void setPuntajeBarra(int puntajeBarra) {
        this.puntajeBarra = puntajeBarra;
    }

    public int getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }
}
