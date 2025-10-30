package TP7.EJ1;
import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosDesaconsejados;
    private ArrayList<Enfermedad> estadosPatologicos;

    public ProductoQuimico(String nombre){
        this.nombre = nombre;
        this.cultivosDesaconsejados = new ArrayList<>();
        this.estadosPatologicos = new ArrayList<>();
    }


}
