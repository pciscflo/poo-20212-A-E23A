package com.upc.relaciones;

public class Ejercicio1 {
    public static void main(String[] args) {
        Montañera montañera1 = new Montañera("Acero",12,4,"aire");
        Montañera montañera2 = new Montañera("Aluminio", 18,6,"doble");
        Tienda tienda = new Tienda();
        tienda.registrar(montañera1);
        tienda.registrar(montañera2);
        System.out.println(tienda.contarCantidadBicicletasMontañeras());
        for(Bicicleta p:tienda.obtenerBicicletas(Montañera.class))
        {
            System.out.println(p.getMaterial() + "  " + p.getTamañoRuedas() + "  " + p.getCantidadPlatosCambios() +
                    "  " + p.calcularPrecioBase() + "  " + p.calcularPrecioFinalBicicleta());
        }

    }
}
