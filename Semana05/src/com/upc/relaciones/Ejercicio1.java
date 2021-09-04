package com.upc.relaciones;

public class Ejercicio1 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("0025", "Chocolate", 2.0);
        Producto producto2 = new Producto("0057", "Gasesosa Fanta",2.5);
        Producto producto3 = new Producto("0487","Inka Kola", 3.0);

        Item item1 = new Item(producto1, 10);
        Item item2 = new Item(producto2, 20);
        Item item3 = new Item(producto3, 5);

        Cabecera cabecera = new Cabecera(1001, 20254787119L,"Las Begonias 239","10/10/2020");

        Factura factura1 = new Factura(cabecera);
        factura1.registrarItem(item1);
        factura1.registrarItem(item2);
        factura1.registrarItem(item3);

        System.out.println("Nro Factura:" + factura1.getCabecera().getNumeroFactura());

        System.out.println("Total:" + factura1.calcularTotal());
        System.out.println("IGV: " + factura1.calcularIGV());







    }
}
