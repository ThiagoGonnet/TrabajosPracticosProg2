package TP4.EJ5;
import java.util.ArrayList;
public class Avicola {
    private String nombre;
    private ArrayList<Producto> productos;

    public Avicola(String nombre){
        this.productos = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void mostrarProductos(){
        for(Producto p:productos){
            System.out.println(p.getEtiqueta());
        }
    }
}
