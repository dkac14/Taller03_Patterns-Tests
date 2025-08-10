package com.mycompany.petdaycare.ChainOfResponsability;

public class EquipoAtencionGeneral extends ManejadorIncidenteBase {
    @Override
    public void handle(String incidente) {
        if (incidente != null && incidente.contains("medio")) {
            System.out.println("Equipo de atención general resolvió el incidente: " + incidente);
        } else if (next != null) {
            next.handle(incidente);
        } else {
            // Caso final: nadie más puede manejarlo, lo resolvemos nosotros
            System.out.println("Equipo de atención general resolvió el incidente: " + (incidente == null ? "null" : incidente));
        }
    }
}
