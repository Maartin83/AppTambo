package com.example.apptambo.Entities;

public class Categoria {
    private int id;
    private String nombreCategoria;

    // Constructor
    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    // Métodos getter y setter
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
}

