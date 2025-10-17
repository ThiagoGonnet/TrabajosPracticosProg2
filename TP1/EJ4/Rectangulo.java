package EJ4;

public class Rectangulo {
  private double v1x, v1y;
  private double base;
  private double altura;

  public Rectangulo(double v1x, double v1y, double base, double altura) {
    this.v1x = v1x;
    this.v1y = v1y;
    this.base = base;
    this.altura = altura;
  }

  public Rectangulo(double v1x, double v1y, double v2x, double v2y,
      double v3x, double v3y, double v4x, double v4y) {
    this.v1x = v1x;
    this.v1y = v1y;
    this.base = Math.abs(v2x - v1x); // diferencia en X
    this.altura = Math.abs(v4y - v1y); // diferencia en Y
  }

  public double calcularArea() {
    return getBase() * getAltura();
  }

  public int compararRectangulo(Rectangulo otro) {
    double areaNueva = otro.calcularArea();
    double areaActual = calcularArea();
    if (areaActual > areaNueva) {
      return 1;
    } else if (areaActual < areaNueva) {
      return -1;
    }
    return 0;
  }

  public boolean esCuadrado() {
    return getBase() == getAltura();
  }

  public double largoSuperior() {
    double area = calcularArea();
    double largoSuperior = area / getBase();
    return largoSuperior;
  }

  public void paradoOAcostado() {
    if (getBase() > getAltura()) {
      System.out.println("El rectangulo esta acostado!");
    } else {
      System.out.println("El rectangulo esta parado!");
    }
  }

  public double getBase() {
    return base;
  }

  public double getAltura() {
    return altura;
  }

}

/*
 * A la clase Rectángulo del ejercicio 3 implementarla nuevamente, guardando
 * solo un
 * vértice y las longitudes de los lados. Implementar la misma interfaz que en
 * el ejercicio
 * 3.
 * Nota. Tener en cuenta la dirección de los lados. Proveer dos constructores,
 * uno con los 4
 * puntos y otro con los datos anteriores.
 */
