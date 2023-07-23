package com.example.apptambo.Entities;

public class DetalleCarrito {
    private int id;
    private int cantidad;
    private double precioUnitario;
    private int productoId;
    private int carritoId;

    // Constructor
    public DetalleCarrito(int cantidad, double precioUnitario, int productoId, int carritoId) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.productoId = productoId;
        this.carritoId = carritoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(int carritoId) {
        this.carritoId = carritoId;
    }
}

