package org.example;

public class RedSocial {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Ana", "@ana", 30, 231 );
        Influencer influencer1 = new Influencer("Luis", "@luis_influencer", 25, 50000);
        Streamer streamer1 = new Streamer("Carlos", "@carlos_stream", 27, 0, 150, 2000);
        Basico personaNormal = new Basico("Pedro", "@pedro123", 22, 455);

        influencer1.anyadirColaboraciones("MediaMarkt", "Yoigo", "Temu");

        usuario1.mostrarInformacion();
        System.out.println();
        influencer1.mostrarInformacion();
        System.out.println();
        streamer1.mostrarInformacion();
        System.out.println();
        personaNormal.mostrarInformacion();
    }
}
