package org.example.DispositivosInteligentes;

public class AireAcondicionado extends Dispositivo{

    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("Encendiendo aire acondicionado...");
        } else {
            System.out.println("El aire acondicionado ya está encendido.");
        }
    }

    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }
}
