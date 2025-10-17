package EJ3;

import java.util.ArrayList;

public class Ciudad {
  private int habitantes;
  private double imp1, imp2, imp3, imp4, imp5;
  private double gastosMantenimiento;

  public Ciudad(double gastosMantenimiento, int habitantes, double imp1, double imp2,
      double imp3, double imp4, double imp5) {
    this.gastosMantenimiento = gastosMantenimiento;
    this.habitantes = habitantes;
    this.imp1 = imp1;
    this.imp2 = imp2;
    this.imp3 = imp3;
    this.imp4 = imp4;
    this.imp5 = imp5;
  }

  public double getRecaudacion() {
    double recaudacion = (imp1 + imp2 + imp3 + imp4 + imp5);
    return recaudacion;
  }

  public int getHabitantes() {
      return habitantes;
  }

    public double getGastosMantenimiento() {
        return gastosMantenimiento;
    }
}
