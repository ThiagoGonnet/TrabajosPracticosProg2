package TP5.EJ5;

import java.util.ArrayList;

public class Lote {
    private int superficie;
    private ArrayList<Mineral> minerales;

    public Lote(int superficie) {
        this.superficie = superficie;
        this.minerales = new ArrayList<>();
    }

    public void agregarMineral(Mineral m) {
        minerales.add(m);
    }

    // --- Verifica si puede sembrarse un cereal ---
    public boolean puedeSembrarse(Cereal c) {
        // 1. Si es pastura y superficie < 50, no se puede
        if (c.esPastura() && superficie < 50) {
            return false;
        }

        // 2. Debe contener todos los minerales requeridos por el cereal
        for (Mineral requerido : c.getMineralesRequeridos()) {
            if (!minerales.contains(requerido)) {
                return false;
            }
        }
        return true;
    }

    // --- Clasifica el lote según los intereses ---
    public String clasificar(ArrayList<Mineral> primarios, ArrayList<Mineral> secundarios) {
        // Si tiene algún mineral primario -> especial
        for (Mineral m : primarios) {
            if (minerales.contains(m)) {
                return "Lote Especial";
            }
        }

        // Si no tiene primarios pero sí secundarios -> común
        for (Mineral m : secundarios) {
            if (minerales.contains(m)) {
                return "Lote Común";
            }
        }

        // Si no tiene ninguno -> sin clasificar
        return "Lote Sin Clasificación";
    }

    public int getSuperficie() {
        return superficie;
    }
}

/*
Adicionalmente, los lotes son clasificados como “especiales” cuando contienen ciertos
minerales de interés primario para la cooperativa, y “comunes” cuando contienen sólo
minerales secundarios en la composición de la tierra. La cooperativa debe poder consultar si
un lote es común o especial.
 */