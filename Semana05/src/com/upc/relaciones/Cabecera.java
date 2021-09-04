package com.upc.relaciones;

public class Cabecera {
    private int numeroFactura;
    private long ruc;
    private String direccion;
    private String fecha;

    public Cabecera() {
    }

    public Cabecera(int numeroFactura, long ruc, String direccion, String fecha) {
        this.numeroFactura = numeroFactura;
        this.ruc = ruc;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public long getRuc() {
        return ruc;
    }

    public void setRuc(long ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
