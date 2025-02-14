package org.example.PlataformaStreaming;

public class PlataformaStreaming {
    public static void main(String[] args) {


        Suscripcion[] suscripciones = {new PlanBasico("Basico",10), new PlanGratis("Gratis", 0),
                        new PlanFamiliar("Familiar", 30), new PlanPremium("Premium", 50)};

        for (Suscripcion sub : suscripciones){
            sub.mostrarInfo();
            sub.obtenerBeneficios();
            System.out.println();
        }
    }
}
