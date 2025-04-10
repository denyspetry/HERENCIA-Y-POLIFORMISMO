package org.example.Lambda;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Smartphone",150.0,"Electrónica"));
        listaProductos.add(new Producto("Tablet",72.0,"Electrónica"));
        listaProductos.add(new Producto("Perfume árabe",40.0,"Perfume"));
        listaProductos.add(new Producto("Kebab",2.50,"Alimentación"));

        FiltroProducto filtro = (producto) -> {
            if (producto.getCategoría().equals("Electrónica") && producto.getPrecio() > 100){
                return true;
            }
            return false;
        };

        List<Producto> productosFiltrados = new ArrayList<>();

        for (Producto producto : listaProductos){
            if (filtro.filtrar(producto)){
                productosFiltrados.add(producto);
            }
        }

        System.out.println("Productos después de filtrar: ");
        for (Producto producto : productosFiltrados){
            System.out.println(producto);
        }
    }
}
