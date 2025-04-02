package org.example.DispositivosInteligentes;

public class Prueba {
    public static void main(String[] args) {
        int edad = 14;
        if (edad < 18){
            throw new MiExcepcion();
        }
    }
}
