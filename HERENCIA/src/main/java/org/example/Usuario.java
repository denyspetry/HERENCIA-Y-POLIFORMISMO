package org.example;

public class Usuario {
    private String nombre;
    private String nombreUsuario;
    private int edad;
    private int seguidores;

    public Usuario(){}

    public Usuario(String nombre, String nombreUsuario, int edad, int seguidores){
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.seguidores = seguidores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void mostrarInformacion(){
        System.out.println("Informacion del Usuario");
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Seguidores: " + seguidores);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", edad=" + edad +
                ", seguidores=" + seguidores +
                '}';
    }
}
