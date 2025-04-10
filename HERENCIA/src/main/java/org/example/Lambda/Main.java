package org.example.Lambda;

public class Main {
    public static void main(String[] args) {
        Ejecutor ejecutor1 = numero -> {
            if (numero > 10){
                return true;
            } else {
                return false;
            }
        };

        int numero = 5;
        boolean resultado = ejecutor1.ejecutar(numero);
        System.out.println("Probando para " + numero + ":");
        System.out.println(resultado);
    }
}
