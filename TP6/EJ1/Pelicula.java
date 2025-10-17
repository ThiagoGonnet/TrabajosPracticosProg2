package TP6.EJ1;

import java.time.LocalDate;

public class Pelicula extends ElementoAlquilable{
    private String nombre;
    private int cantidadCopias;
    private String informacionFilmografica;

    public Pelicula(int cantidadCopias, String informacionFilmografica, String nombre) {
        this.cantidadCopias = cantidadCopias;
        this.informacionFilmografica = informacionFilmografica;
        this.nombre = nombre;
    }

    @Override
    public void alquilar(Cliente clienteActual) {
        if(sePuedeAlquilar()){
            this.cantidadCopias--;
            this.clienteActual = clienteActual;
            this.fechaDevolucion = LocalDate.now().plusDays(3);
            clienteActual.agregarElemento(this);
        }
    }

    @Override
    public boolean sePuedeAlquilar() {
        return cantidadCopias >=1;
    }
}
