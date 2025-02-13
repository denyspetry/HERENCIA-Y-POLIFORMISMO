package org.example;

import java.util.ArrayList;

class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer (String nombre, String nombreUsuario, int edad, int seguidores){
        super(nombre, nombreUsuario, edad, seguidores);
        colaboraciones = new ArrayList<>();
    }

     public void anyadirColaboraciones(String... nombres){
        for (String nombre : nombres){
            colaboraciones.add(nombre);
        }
     }

    public void mostrarInformacion(){
        System.out.println("Informacion del Influencer");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nombre de usuario: " + getNombreUsuario());
        System.out.println("Seguidores: " + getSeguidores());
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}
