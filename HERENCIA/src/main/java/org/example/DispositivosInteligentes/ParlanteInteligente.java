package org.example.DispositivosInteligentes;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("Activando parlante con comando de voz...");
        } else {
            System.out.println("El parlante ya está encendido.");
        }
    }
}
