package com.upc.relaciones;

public class Item {
    private Producto producto;
    private int cantidad;

    public Item() {
    }

    public void validaCantidad() throws Exception{
        if(cantidad<=0){
            throw new Exception("Cantidad no puede ser cero o negativo");
        }
    }

    public Item(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubTotal(){
        return this.cantidad*this.producto.getPrecio();
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
