package com.upc.buses;

public class Asiento {
    private boolean reservado;
    private int numAsiento;
    private Vecino vecino;

    public Asiento(int numAsiento) {
        this.reservado = false;
        this.numAsiento = numAsiento;
        this.vecino = null;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Vecino getVecino() {
        return vecino;
    }

    public void setVecino(Vecino vecino) {
        this.vecino = vecino;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "reservado=" + reservado +
                ", numAsiento=" + numAsiento +
                ", vecino=" + vecino +
                '}';
    }
}
