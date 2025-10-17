package TP3.EJ3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // CREAR CARACTERÍSTICAS
        Caracteristica c1 = new Caracteristica(25, 1.80, 75, 80, 70, 90); // edad, altura, peso, fuerza, velocidad, visión
        Caracteristica c2 = new Caracteristica(30, 1.75, 80, 80, 65, 85);

        // LISTAS DE CARACTERÍSTICAS
        ArrayList<Caracteristica> lista1 = new ArrayList<>();
        lista1.add(c1);

        ArrayList<Caracteristica> lista2 = new ArrayList<>();
        lista2.add(c2);

        // CREAR JUGADORES
        Jugador jugador1 = new Jugador("Juan Pérez", "Halcón", lista1);
        Jugador jugador2 = new Jugador("Ana Gómez", "Tigre", lista2);

        // CREAR JUEGO
        JuegoPersonajes juego = new JuegoPersonajes();

        // JUGAR
        juego.Jugar(jugador1, jugador2);
    }
}

/*
3  Juego de Personajes
Se desea modelar un juego el cual se compone de héroes y villanos. Cada personaje del
juego posee un nombre real,  un nombre de super héroe y un conjunto de cualidades o
características, que son visión nocturna, velocidad,  fuerza peso, altura y edad. Cada una
de estas posee un nivel asociado, por ejemplo velocidad 500, fuerza 700, edad 33.
El mecanismo de juego se basa en enfrentar un personaje con otro y decidir cuál de ellos
es el ganador. Para decidir quién es el ganador se utiliza el valor de una de las
características, por ejemplo fuerza, velocidad. En caso de empate se decide por el valor
de otra característica dada.
Consejo: Identificar las reglas del juego y en dónde deben estar. Ver Jugador.
Extra: ¿Cómo se modela el mazo de cartas? ¿Qué ocurre con más jugadores?
 */