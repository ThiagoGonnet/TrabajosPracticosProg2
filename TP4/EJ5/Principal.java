package TP4.EJ5;

public class Principal {
    public static void main(String[] args){
        // Crear empresa avícola
        Avicola a1 = new Avicola("Thiago Avicola S.A");

        // 1️⃣ Productos frescos
        Producto huevoBlanco = new Producto("2025-11-01", "2025-12-01", "Granja Sol", 1);
        Producto huevoCodorniz = new Producto("2025-11-05", "2025-11-20", "Granja Luna", 2);

        // 2️⃣ Productos refrigerados (ProductoCongelado con double)
        ProductoCongelado polloFresco = new ProductoCongelado(
                "2025-10-10", "2025-10-15", "Granja Sol", 3,
                "ORG123", 4.0
        );
        ProductoCongelado milanesaCerdo = new ProductoCongelado(
                "2025-10-12", "2025-10-20", "Granja Luna", 4,
                "ORG124", 3.5
        );

        // 3️⃣ Productos congelados
        ProductoCongeladoAire hamburguesa = new ProductoCongeladoAire(
                "2025-09-01", "2026-03-01", "Granja Sol", 5,
                "ORG125", -18.0,
                78.0, 21.0, 0.03, 0.97
        );

        ProductoCongeladoAgua papasFritas = new ProductoCongeladoAgua(
                "2025-08-25", "2026-02-15", "Granja Luna", 6,
                "ORG126", -20.0,
                35.5
        );

        ProductoCongeladoNitrogeno polloRebozado = new ProductoCongeladoNitrogeno(
                "2025-09-10", "2026-04-01", "Granja Sol", 7,
                "ORG127", -18.0,
                "Inmersión rápida", 120
        );

        // Agregar productos al inventario
        a1.agregarProducto(huevoBlanco);
        a1.agregarProducto(huevoCodorniz);
        a1.agregarProducto(polloFresco);
        a1.agregarProducto(milanesaCerdo);
        a1.agregarProducto(hamburguesa);
        a1.agregarProducto(papasFritas);
        a1.agregarProducto(polloRebozado);

        a1.mostrarProductos();
    }
}
/*
5 - Avícola
Una empresa encargada de la comercialización de productos avícolas trabaja con tres tipos de
productos: productos frescos (huevos de gallina blancos y de color, huevos de codorniz, etc),
productos refrigerados (pollos frescos, milanesas de pollo, de cerdo y de ternera, pollo
arrollado, chorizos de cerdo, etc) y productos congelados (hamburguesas, papas fritas,
arvejas, granos de maíz, formas de pollo rebozadas, etc.). Todos los productos llevan esta
información común: fecha de vencimiento y número de lote. A su vez, cada tipo de producto
lleva alguna información específica. Los productos frescos deben llevar la fecha de
envasado y la granja de origen. Los productos refrigerados deben llevar el código del
organismo de supervisión alimentaria, la fecha de envasado, la temperatura de mantenimiento
recomendada y la granja de origen. Los productos congelados deben llevar la fecha de
envasado, el código del organismo de supervisión alimentaria, la granja de origen y la
temperatura de mantenimiento recomendada.
Hay tres tipos de productos congelados: congelados por aire, congelados por agua y
congelados por nitrógeno. Los productos congelados por aire deben llevar la información de
la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido
de carbono y % de vapor de agua). Los productos congelados por agua deben llevar la información de la salinidad del agua con que se realizó la congelación en gramos de sal por
litro de agua. Los productos congelados por nitrógeno deben llevar la información del método
de congelación empleado y del tiempo de exposición al nitrógeno expresada en segundos.
Implementar los métodos necesarios para obtener cada uno de los atributos de un producto.
Implementar un método que permita obtener la etiqueta de un producto (un String con la
combinación de los atributos).
 */