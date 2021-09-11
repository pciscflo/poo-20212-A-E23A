package com.upc.relaciones;

public class Montañeras extends Bicicleta {

    private String tipoSuspension;

    public Montañeras(String material, int tamañoRuedas, int cantidadPlatosCambios, String tipoSuspension) {
        super(material, tamañoRuedas, cantidadPlatosCambios);
        this.tipoSuspension = tipoSuspension;
    }

    public Montañeras() {
    }

    @Override
    public double calcularPrecioFinalBicicleta() {
        return calcularPrecioBase() + calcularCostoTipoSuspension();
    }

    @Override
    public double calcularPrecioBase() {
        return Utilitario.PRECIO_BASE_MONTAÑERA;
    }

    public double calcularCostoTipoSuspension() {
        double precio = 0;
        switch (this.tipoSuspension) {
            case "Rigidas":
                precio = 250;
                break;
            case "Delantera":
                precio = 295;
                break;
            case "Doble":
                precio = 600;
                break;
        }
        return precio;
    }
}
