package TP4.EJ4;


public class Principal {
    public static void main(String[] args){
        Contingente s1 = new Contingente("Argentina AFA");

        // Crear futbolistas
        Futbolista f1 = new Futbolista("Lionel", "Messi", "A12345", "1987-06-24",
                true, false, "Delantero", 'L', 800);
        Futbolista f2 = new Futbolista("Paulo", "Dybala", "B98765", "1993-11-15",
                true, true, "Mediocampista", 'L', 300);

        // Crear entrenadores
        Entrenador e1 = new Entrenador("Lionel", "Scaloni", "C54321", "1978-02-16",
                true, false, "FED-001");

        // Crear masajistas
        Masajista m1 = new Masajista("Juan", "Pérez", "D11223", "1980-09-05",
                false, false, "Kinesiología", 15);

        s1.agregarPersona(f1);
        s1.agregarPersona(f2);
        s1.agregarPersona(e1);
        s1.agregarPersona(m1);

        s1.mostrarPersonas();
    }


}
/*
4 - Selección de fútbol
El contingente de la selección de fútbol de un país está formado tanto por futbolistas como
por un cuerpo técnico. Cada integrante del contingente posee un nombre, apellido, número de
pasaporte y fecha de nacimiento. Los futbolistas, además, poseen una posición, si es zurdo o
derecho y la cantidad de goles convertidos. Los entrenadores poseen un identificador de la
federación a la que pertenecen y los masajistas el título que poseen y la cantidad de años de
experiencia.
El sistema debe permitir conocer el estado de una persona. El estado puede ser “Viajando”,
“En concentración”, “En país de origen”. Se debe poder saber si una persona está disponible
o no para un evento solidario para recaudar fondos. Una persona estará disponible si está en
el país de origen y no está concentrando para un partido.
Nota: Una misma persona no comparte dos roles distintos, por ejemplo un técnico no puede
ser futbolista, ni masajista.
 */