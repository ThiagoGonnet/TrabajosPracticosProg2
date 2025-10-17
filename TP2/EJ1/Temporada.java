package EJ1;

import java.util.ArrayList;

public class Temporada {
  ArrayList<Episodio> cantidadEpisodios;

  public Temporada(ArrayList<Episodio> episodios) {
    this.cantidadEpisodios = episodios;
  }

  public void addEpisodio(Episodio e) {
    cantidadEpisodios.add(e);
  }

  public int obtenerTotalEpisodiosVistos() {
    int episodiosVistos = 0;
    for (Episodio e : cantidadEpisodios) {
      if (e.getFlag()) {
        episodiosVistos++;
      }
    }
    return episodiosVistos;
  }

  // Obtener el promedio de las calificaciones dadas para una temporada
  // particular.
  public double obtenerPromedioCalificaciones() {
    double calificaciones = 0;
    for (Episodio e : cantidadEpisodios) {
      if (e.getCalificacionDada() >= 0 && e.getCalificacionDada() <= 5) {
        calificaciones += e.getCalificacionDada();
      }
    }
    return calificaciones / cantidadEpisodios.size();
  }

  public ArrayList<Episodio> getEpisodios() {
    return cantidadEpisodios;
  }
}
