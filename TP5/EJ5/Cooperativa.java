package TP5.EJ5;

import java.util.ArrayList;

public abstract class Cooperativa {
    private String nombre;
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;
    private ArrayList<Mineral> interesPrimario;
    private ArrayList<Mineral> interesSecundario;

    public Cooperativa(String nombre) {
        this.nombre = nombre;
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>();
        this.interesPrimario = new ArrayList<>();
        this.interesSecundario = new ArrayList<>();
    }

    // --- Manejo básico de datos ---
    public void agregarLote(Lote l) {
        lotes.add(l);
    }

    public void agregarCereal(Cereal c) {
        cereales.add(c);
    }

    public void agregarInteresPrimario(Mineral m) {
        interesPrimario.add(m);
    }

    public void agregarInteresSecundario(Mineral m) {
        interesSecundario.add(m);
    }

    // --- 1) Qué cereales pueden sembrarse en un determinado lote ---
    public ArrayList<Cereal> cerealesQuePuedoSembrar(Lote l) {
        ArrayList<Cereal> sembrables = new ArrayList<>();
        for (Cereal c : cereales) {
            if (l.puedeSembrarse(c)) {
                sembrables.add(c);
            }
        }
        return sembrables;
    }

    // --- 2) En qué lotes puedo sembrar un determinado cereal ---
    public ArrayList<Lote> lotesParaCereal(Cereal c) {
        ArrayList<Lote> posibles = new ArrayList<>();
        for (Lote l : lotes) {
            if (l.puedeSembrarse(c)) {
                posibles.add(l);
            }
        }
        return posibles;
    }

    // --- 3) Determinar si un lote es especial o común ---
    public String clasificarLote(Lote l) {
        return l.clasificar(interesPrimario, interesSecundario);
    }
}

/*
5 - Cooperativa de Agricultores
Una cooperativa de agricultores requiere un sistema que le aconseje cuáles son los cereales
que puede sembrar en un determinado lote y qué lotes pueden ser utilizados para sembrar un
determinado cereal. Para poder sembrar un cereal en un lote, éste debe contener determinados
minerales. Los cereales se clasifican en granos de cosecha gruesa (como girasol, maíz,...),
granos de cosecha fina (como trigo, avena,..) y pasturas (como alfalfa, trébol subterráneo,..).
Un lote satisface los requerimientos de un cereal si contiene todos los minerales que requiere
ese cereal. Para el caso de las pasturas, poseen la restricción adicional de no poder sembrarse
en lotes menores a una superficie de 50 hectáreas.
Adicionalmente, los lotes son clasificados como “especiales” cuando contienen ciertos
minerales de interés primario para la cooperativa, y “comunes” cuando contienen sólo
minerales secundarios en la composición de la tierra. La cooperativa debe poder consultar si
un lote es común o especial.
Implementar una solución orientada a objetos para este problema que permita determinar:
1) qué cereales pueden sembrarse en un determinado lote
2) en qué lotes se puede sembrar un determinado cereal
3) determinar si un lote dado es “especial” o “común”.
 */