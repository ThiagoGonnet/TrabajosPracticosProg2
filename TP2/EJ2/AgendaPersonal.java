package EJ2;

import java.util.ArrayList;

public class AgendaPersonal {
  private ArrayList<Reunion> reuniones;

  public AgendaPersonal() {
    this.reuniones = new ArrayList<>();
  }

  public void agregarReunion(Reunion reunion) {
    if (!conflictoHorarios(reunion) && !reuniones.contains(reunion)) {
      reuniones.add(reunion);
    }
  }

  public boolean conflictoHorarios(Reunion reunion) {
    for (Reunion r : reuniones) {
      // Comparar Strings nunca con == siemrpe con .equals
      if (r.getFecha().equals(reunion.getFecha())) {
        return true;
      }
    }
    return false;
  }
}
