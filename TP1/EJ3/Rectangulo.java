package EJ3;

public class Rectangulo {
  private double v1x, v1y,
      v2x, v2y,
      v3x, v3y,
      v4x, v4y;
  private double base;
  private double altura;

  public Rectangulo(double v1x, double v1y, double v2x, double v2y, double v3x, double v3y, double v4x, double v4y) {
    this.v1x = v1x;
    this.v1y = v1y;
    this.v2x = v2x;
    this.v2y = v2y;
    this.v3x = v3x;
    this.v3y = v3y;
    this.v4x = v4x;
    this.v4y = v4y;
  }

  public void desplazar(double x, double y) {
    this.v1x += x;
    this.v2x += x;
    this.v3x += x;
    this.v4x += x;
    this.v1y += y;
    this.v2y += y;
    this.v3y += y;
    this.v4y += y;
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
    return v2x - v1x;
  }

  public double getAltura() {
    return v4y - v1y;
  }

}

/*
 * * Implementar la clase Rectángulo.
 * Para esta clase es necesario definir el rectángulo utilizando los puntos como
 * vértices. Se
 * trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
 * Nota. Definir la estructura que deber poseer un rectángulo y en base a esto
 * implementar
 * los atributos de la clase.
 * La funcionalidad que debe proveer un rectángulo es la siguiente
 * ● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores
 * de X e
 * Y.
 * ● Calcular el Área del rectángulo.
 * ● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si
 * son
 * iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el
 * área
 * del mismo es mayor que la del otro.
 * ● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen
 * las
 * propiedades para que sea un cuadrado.
 * ● Determinar el largo del lado superior.
 * ● Determinar si está acostado o parado (si el alto es más que el ancho).
 */
