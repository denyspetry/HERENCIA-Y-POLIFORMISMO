package org.example.RedSocial;

class Streamer extends Usuario {

    private int numero_transmisiones;
    private int horas_directo;

    public Streamer (String nombre, String nombreUsuario, int edad, int seguidores, int numero_transmisiones, int horas_directo){
        super(nombre, nombreUsuario, edad, seguidores);
        this.numero_transmisiones = numero_transmisiones;
        this.horas_directo = horas_directo;
    }

    public void mostrarInformacion(){
        System.out.println("Informacion del Influencer");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nombre de usuario: " + getNombreUsuario());
        System.out.println("Retransmisiones realizadas: " + numero_transmisiones);
        System.out.println("Horas de directo: " + horas_directo);
    }
}
