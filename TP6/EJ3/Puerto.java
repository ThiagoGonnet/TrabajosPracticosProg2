package TP6.EJ3;

import java.util.ArrayList;

public class Puerto {
    private ColaEspera camiones;
    private ColaEspera barcos;
    private String nombre;
    public Puerto(String nombre){
        this.camiones = new ColaEspera();
        this.barcos = new ColaEspera();
        this.nombre = nombre;
    }
    public void agregarElemento(ColaEspera elemento){

    }
}
