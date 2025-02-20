package org.example.DispositivosInteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{


    public Televisor(String nombre) {
        super(nombre);
    }

    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("Encendiendo televisor...");
        } else {
            System.out.println("El televisor ya está encendido.");
        }
    }

    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }
}
