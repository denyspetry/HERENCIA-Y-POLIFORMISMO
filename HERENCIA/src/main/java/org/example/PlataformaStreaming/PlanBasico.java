package org.example.PlataformaStreaming;

public class PlanBasico extends Suscripcion{
    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }


    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios");
    }
}
