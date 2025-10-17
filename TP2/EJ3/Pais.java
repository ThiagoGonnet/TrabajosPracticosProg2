package EJ3;

import java.util.ArrayList;

public class Pais {
  private ArrayList<Provincia> provincias;

  public Pais() {
    this.provincias = new ArrayList<>();
  }

  public ArrayList<Provincia> provinciasMayorMitadConDeficit() {
    ArrayList<Provincia> provinciasDeficit = new ArrayList<>();
    int contador = 0;
    for (Provincia p : provincias) {
      contador = p.ciudadesConDeficit();
        if (contador > (p.ciudades.size() / 2)) {
          provinciasDeficit.add(p);
        }
      }
      return provinciasDeficit;
  }

  public void agregarProvincia(Provincia p) {
    provincias.add(p);
  }
}
