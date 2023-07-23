package com.example.apptambo.Entities;

public class DetalleCompraVenta {
    private int id;
    private int cantidad;
    private double precioUnitario;
    private int productoId;
    private int compraVentaId;

    // Constructor
    public DetalleCompraVenta(int cantidad, double precioUnitario, int productoId, int compraVentaId) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.productoId = productoId;
        this.compraVentaId = compraVentaId;
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

    public int getCompraVentaId() {
        return compraVentaId;
    }

    public void setCompraVentaId(int compraVentaId) {
        this.compraVentaId = compraVentaId;
    }
}

