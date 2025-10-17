package TP5.EJ6;

public class Ciudad {
  private int habitantes;
  // private double imp1, imp2, imp3, imp4, imp5;
  private double gastosMantenimiento;
  private ArrayList<Contribuyente> contribuyentes;

  public Ciudad(double gastosMantenimiento, int habitantes) {
    this.gastosMantenimiento = gastosMantenimiento;
    this.habitantes = habitantes;
  }

  public double getRecaudacion() {
    double recaudacion = (imp1 + imp2 + imp3 + imp4 + imp5);
    return recaudacion;
  }
  public void agregarContribuyente(Contribuyente c){
      contribuyentes.add(c);
  }
  public double calcularRecaudacion(){
      double recaudacionTotal = 0;
      for(Contribuyente c:contribuyentes){
          System.out.println("El " + getIdentificacionTributaria + " paga $" + c.getMontoFijo() + " en contemplacion de impuestos. ");
          recaudacionTotal += c.getMontoFijo();
      }
      return recaudacionTotal;
  }

  public int getHabitantes() {
      return habitantes;
  }

    public double getGastosMantenimiento() {
        return gastosMantenimiento;
    }
}
