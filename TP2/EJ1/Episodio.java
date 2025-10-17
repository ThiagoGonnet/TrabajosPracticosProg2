package EJ1;

public class Episodio {
  private String titulo;
  private String descripcion;
  private boolean flag;
  private int calificacionDada;

  public Episodio(String titulo, String descripcion, boolean flag, int calificacionDada) {
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.flag = flag;
    setCalificacionDada(calificacionDada);
  }

  public void setCalificacionDada(int calificacionDada) {
    this.calificacionDada = calificacionDada;
    if (calificacionDada < 0 || calificacionDada > 5) {
      System.out.println("El valor de la calificacion del episodio es erroneo.");
    }
  }

  public boolean getFlag() {
    return flag;
  }

  public int getCalificacionDada() {
    return calificacionDada;
  }

}
