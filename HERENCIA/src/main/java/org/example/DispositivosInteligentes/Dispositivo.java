package org.example.DispositivosInteligentes;

public abstract class Dispositivo {
    protected String nombre;
    protected boolean estado; //encendido o apagado

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }

    public abstract void encender();

    public void apagar() {
        if (!estado) {
            estado = false;
            System.out.println(nombre + " apagado.");
        } else {
            System.out.println(nombre + " ya está apagado.");
        }
    }

    public void mostrarEstado() {
        if (estado){
            System.out.println("Encendido");
        } else {
            System.out.println("Apagado");
        }
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
