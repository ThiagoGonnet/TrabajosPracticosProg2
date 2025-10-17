package TP6.EJ1;

import java.time.LocalDate;

public class Auto extends ElementoAlquilable{
    private String modelo;
    private String marca;
    private double kms;
    private String patente;
    private String tipoCombustion;
    private boolean alquilado;

    public Auto(double kms, String marca, String modelo, String patente, String tipoCombustion) {
        this.kms = kms;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.tipoCombustion = tipoCombustion;
        this.alquilado = false;
    }


    @Override
    public void alquilar(Cliente clienteActual) {
        if (sePuedeAlquilar()) {
            this.alquilado = true;
            this.clienteActual = clienteActual;
            this.fechaDevolucion = LocalDate.now().plusDays(3); // 🔹 devuelve en 3 días
            clienteActual.agregarElemento(this);
        }
    }

    @Override
    public boolean sePuedeAlquilar() {
        return !this.alquilado;
    }
}
