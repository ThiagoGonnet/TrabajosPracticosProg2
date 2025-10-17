public class Electrodomestico {
  private String nombre;
  private double precio_base = 100;
  private String color = "Gris plata";
  private double consumo_energetico = 10;
  private double peso = 2;

  public Electrodomestico(String nombre, double precio_base, String color, double consumo_energetico, double peso) {
    this.nombre = nombre;
    this.precio_base = precio_base;
    this.color = color;
    this.consumo_energetico = consumo_energetico;
    this.peso = peso;
  }

  public boolean esBajoConsumo() {
    return consumo_energetico < 45;
  }

  public double balance() {
    return precio_base / peso;
  }

  public boolean esAltaGama() {
    double balance = balance();
    return balance > 3;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio_base() {
    return precio_base;
  }

  public void setPrecio_base(double precio_base) {
    this.precio_base = precio_base;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getConsumo_energetico() {
    return consumo_energetico;
  }

  public void setConsumo_energetico(double consumo_energetico) {
    this.consumo_energetico = consumo_energetico;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

}
/*
 * 2 Electrodomésticos
 * Crear una clase Electrodoméstico con las siguientes características:
 * Atributos son nombre, precio base, color, consumo energético y peso.
 * Valores por defecto:
 * ● El color por defecto es gris plata.
 * ● El consumo energético 10 Kw.
 * ● Precio base 100 pesos.
 * ● El peso es 2 kg.
 * Implementar todos los constructores.
 * La funcionalidad de la clase es la siguiente:
 * ● Todos los métodos get y set.
 * ● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
 * ● Calcular el balance, el mismo es el resultado de dividir el costo por el
 * peso
 * ● Indicar si un producto es de alta gama, el balance es mayor que 3
 */
