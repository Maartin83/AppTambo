package com.example.apptambo.Entities;

public class CompraVenta {
    private int id;
    private String fechaHora;
    private double total;
    private String tipo;
    private int usuarioId;

    // Constructor
    public CompraVenta( String fechaHora, double total, String tipo, int usuarioId) {
        this.fechaHora = fechaHora;
        this.total = total;
        this.tipo = tipo;
        this.usuarioId = usuarioId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}

