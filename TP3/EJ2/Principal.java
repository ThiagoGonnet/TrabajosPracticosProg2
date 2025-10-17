package TP3.EJ2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Crear fábrica
        FabricaMuebles fabrica = new FabricaMuebles("Muebles Gonnet");

        // Crear productos
        Producto silla = new Producto(5.0, 2000, 0, "Roble", "Marrón");
        Producto mesa = new Producto(20.0, 8000, 0, "Pino", "Natural");
        Producto estante = new Producto(15.0, 5000, 0, "Cedro", "Blanco");

        // Agregar productos al stock
        fabrica.agregarProducto(silla);
        fabrica.agregarProducto(mesa);
        fabrica.agregarProducto(estante);

        // Calcular totales
        double totalVenta = fabrica.calcularPrecioVentaStock();
        double totalCosto = fabrica.calcularCostoFabricacionStock();

        System.out.println("Total costo de fabricación del stock: $" + totalCosto);
        System.out.println("Total valor de venta del stock: $" + totalVenta);
    }
}

/*
2  Fábrica de muebles
Una fábrica de muebles desea organizar su manufactura de manera electrónica. La
fábrica solo produce sillas, mesas y bancos. De cada uno de los productos guarda su
peso, su costo de fabricación, el valor de venta, el tipo de madera y el color. La fábrica
también posee un stock de productos disponibles. Se debe poder calcular el costo de
todos los productos en stock, ya sea precio de fabricación o precio de venta. El precio
de Venta es el precio de costo más un  35%
Consejo: Analizar Clase Vs Instancia
Extra:  ¿Qué sucede si se agrega un producto cuyo precio de venta es el 10% más del
costo de fabricación?
 */