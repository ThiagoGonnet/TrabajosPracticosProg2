package TP3.EJ2;

import java.util.ArrayList;
public class FabricaMuebles {
    private String nombre;
    ArrayList<Producto> stockDisponible;

    public FabricaMuebles(String nombre){
        this.nombre = nombre;
        this.stockDisponible = new ArrayList<>();
    }


    public void agregarProducto(Producto p){
        stockDisponible.add(p);
    }

    public double calcularPrecioVentaStock(){
        double total = 0;
        for(Producto p:stockDisponible){
            total += p.getValorVenta();
        }
        return total;
    }


    public double calcularCostoFabricacionStock(){
        double total = 0;
        for(Producto p:stockDisponible){
            total += p.getCostoFabricacion();
        }
        return total;
    }
}
