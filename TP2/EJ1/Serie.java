package EJ1;

import java.util.ArrayList;

public class Serie {
  ArrayList<Temporada> temporadas;
  private String titulo;
  private String descripcion;
  private String creador;
  private String genero;

  public Serie(String titulo, String descripcion,
      String creador, String genero) {
    this.temporadas = new ArrayList<>();
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.creador = creador;
    this.genero = genero;
  }

  public void addTemporada(Temporada temporada) {
    temporadas.add(temporada);
  }

  public int obtenerTotalEpisodiosVistos() {
    int episodiosVistos = 0;
    for (int i = 0; i < temporadas.size(); i++) {
      for (Episodio e : temporadas.get(i).getEpisodios()) {
        if (e.getFlag()) {
          episodiosVistos++;
        }
      }
    }
    return episodiosVistos;
  }

  public double obtenerPromedioCalificaciones() {
    double calificaciones = 0, contador = 0;
    for (int i = 0; i < temporadas.size(); i++) {
      for (Episodio e : temporadas.get(i).getEpisodios()) {
        if (e.getCalificacionDada() >= 0 && e.getCalificacionDada() <= 5) {
          calificaciones += e.getCalificacionDada();
          contador++;
        }
      }
    }
    return calificaciones / contador;
  }

  public boolean seVieronTodosLosCapitulos() {
    boolean todosVistos = true;
    for (int i = 0; i < temporadas.size(); i++) {
      for (Episodio e : temporadas.get(i).getEpisodios()) {
        if (e.getFlag() == false) {
          todosVistos = false;
          return false;
        }
      }
    }
    return todosVistos;
  }

  public ArrayList<Temporada> getTemporadas() {
    return temporadas;
  }

}
