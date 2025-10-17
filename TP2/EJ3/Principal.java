package EJ3;

public class Principal {
  public static void main(String[] args) {
    Pais p1 = new Pais();
    Provincia provincia1 = new Provincia("p1");
    Provincia provincia2 = new Provincia("p2");
    Ciudad c1 = new Ciudad(1, 105000, 20, 30, 105, 400, 350);
    Ciudad c2 = new Ciudad(1, 105000, 20, 30, 105, 400, 350);
    Ciudad c3 = new Ciudad(10000, 105000, 20, 30, 105, 400, 350);
    Ciudad c4 = new Ciudad(12500, 105000, 20, 30, 105, 400, 350);

    p1.agregarProvincia(provincia1);
    p1.agregarProvincia(provincia2);

    provincia1.agregarCiudad(c1);
    provincia1.agregarCiudad(c2);
    provincia1.agregarCiudad(c3);
    provincia1.agregarCiudad(c4);

    System.out.println(provincia1.ciudadesConDeficit());
    System.out.println(p1.provinciasMayorMitadConDeficit().size());
  }
}
/*
 * 3 Sistema de Control de Gastos Públicos
 * Un país tiene que controlar el gasto público de las ciudades con más de
 * 100.000
 * habitantes. Para ello, tiene información del monto recaudado por cada ciudad
 * a través de
 * cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3,
 * imp4 e
 * imp5) e información acerca de gastos realizados en mantenimiento de la
 * ciudad. Este
 * país necesita un sistema que le informe cuales son las ciudades que gastan
 * más de lo que recaudan, y las provincias que tienen más de la mitad de las
 * ciudades en
 * condición
 * de déficit.
 * Consejo: Tener en cuenta la información que contienen los distintos impuestos
 * Extra: ¿En que afecta el tamaño de la ciudad?
 */
