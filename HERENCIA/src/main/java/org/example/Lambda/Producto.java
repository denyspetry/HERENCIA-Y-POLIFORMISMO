package org.example.Lambda;

import lombok.Getter;

@Getter
public class Producto {
    private String nombre;
    private double precio;
    private String categoría;

    public Producto (String nombre, double precio, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoría = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoría='" + categoría + '\'' +
                '}';
    }
}
