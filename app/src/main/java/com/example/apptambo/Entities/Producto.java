package com.example.apptambo.Entities;

public class Producto {
    private int id;
    private String nombreCategoria;
    private String descripcion;
    private double precio;
    private int stock;
    private int codCategoria;
    private String imagenUrl;

    // Constructor
    public Producto(String nombreCategoria, String descripcion, double precio, int stock, int codCategoria, String imagenUrl) {
        this.nombreCategoria = nombreCategoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.codCategoria = codCategoria;
        this.imagenUrl=imagenUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}

