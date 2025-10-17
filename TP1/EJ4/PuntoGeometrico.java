package EJ4;

public class PuntoGeometrico {
  private double x = 0;
  private double y = 0;

  public void desplazar(double incrementar_x, double incrementar_y) {
    this.x += incrementar_x;
    this.y += incrementar_y;
  }

  public double calcularDistanciaEuclidea(double x2, double y2) {
    return Math.sqrt((this.x - x2) * (this.x - x2) + (this.y - y2) * (this.y - y2));
  }

  /*
   * Aca seria mejor retornar al distancia directamente o dejar ese calculo en la
   * funcion si un return, es decir que sea de tipo void la funcion, y si la
   * quiero mostrar asignarla a una variable en el main y listo, o como? no se que
   * seria lo mas eficiente o si incurro en alguna mala practica de POO con alguna
   * de las dos formas
   */

}
