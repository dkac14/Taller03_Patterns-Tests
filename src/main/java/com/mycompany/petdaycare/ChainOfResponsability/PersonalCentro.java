package com.mycompany.petdaycare.ChainOfResponsability;

public class PersonalCentro extends ManejadorIncidenteBase {
    @Override
    public void handle(String incidente) {
        if (incidente != null && incidente.contains("bajo")) {
            System.out.println("Personal del centro resolvió el incidente: " + incidente);
        } else if (next != null) {
            next.handle(incidente);
        } else {
            // Si no puede resolver y no hay next, simplemente no hace nada (esto ya está cubierto por la superclase)
            super.handle(incidente);
        }
    }
}
