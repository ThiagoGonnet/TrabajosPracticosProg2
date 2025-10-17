package TP5.EJ5;

public class Principal {
    public static void main(String[] args){
// 1️⃣ Crear cooperativa
        CooperativaAgraria coop = new CooperativaAgraria("El Progreso");

        // 2️⃣ Crear minerales
        Mineral hierro = new Mineral("Hierro");
        Mineral fosforo = new Mineral("Fósforo");
        Mineral potasio = new Mineral("Potasio");
        Mineral calcio = new Mineral("Calcio");

        // 3️⃣ Agregar minerales de interés
        coop.agregarInteresPrimario(fosforo);
        coop.agregarInteresPrimario(potasio);
        coop.agregarInteresSecundario(calcio);

        // 4️⃣ Crear lotes con diferentes minerales
        Lote lote1 = new Lote(80);
        lote1.agregarMineral(fosforo);
        lote1.agregarMineral(calcio);

        Lote lote2 = new Lote(40);
        lote2.agregarMineral(calcio);

        coop.agregarLote(lote1);
        coop.agregarLote(lote2);

        // 5️⃣ Crear cereales
        Cereal maiz = new GranoGrueso("Maíz");
        maiz.agregarMineral(fosforo);
        maiz.agregarMineral(potasio);

        Cereal trigo = new GranoFino("Trigo");
        trigo.agregarMineral(calcio);

        Cereal alfalfa = new Pastura("Alfalfa");
        alfalfa.agregarMineral(calcio);
        alfalfa.agregarMineral(potasio);

        coop.agregarCereal(maiz);
        coop.agregarCereal(trigo);
        coop.agregarCereal(alfalfa);

        // 6️⃣ Consultar clasificación de cada lote
        System.out.println("Clasificación del Lote 1: " + coop.clasificarLote(lote1));
        System.out.println("Clasificación del Lote 2: " + coop.clasificarLote(lote2));

        // 7️⃣ Qué cereales se pueden sembrar en cada lote
        System.out.println("\nCereales que pueden sembrarse en Lote 1:");
        for (Cereal c : coop.cerealesQuePuedoSembrar(lote1)) {
            System.out.println(" - " + c.getNombre());
        }

        System.out.println("\nCereales que pueden sembrarse en Lote 2:");
        for (Cereal c : coop.cerealesQuePuedoSembrar(lote2)) {
            System.out.println(" - " + c.getNombre());
        }

        // 8️⃣ En qué lotes se puede sembrar un cereal concreto
        System.out.println("\nLotes donde puede sembrarse Alfalfa:");
        for (Lote l : coop.lotesParaCereal(alfalfa)) {
            System.out.println(" - Lote con superficie " + l.getSuperficie() + " ha");
        }
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