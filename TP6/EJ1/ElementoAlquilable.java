package TP6.EJ1;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoAlquilable {
    protected Cliente clienteActual;
    protected LocalDate fechaDevolucion;

    public boolean estaVencido() {
        if (fechaDevolucion == null) return false;  // nunca se alquiló
        return LocalDate.now().isAfter(fechaDevolucion);
    }

    public abstract void alquilar(Cliente clientActual);
    public abstract boolean sePuedeAlquilar();
}
