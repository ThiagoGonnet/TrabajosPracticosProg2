package TP5.EJ2;

public abstract class Conversion {
    final static double PULGADA_A_CM = 2.54;
    final static double LIBRA_A_KG = 0.453592;
    final static double GALON_A_LT = 3.78541;
    protected double unidadAConvertir;

    public Conversion(double unidadAConvertir) {
        this.unidadAConvertir = unidadAConvertir;
    }

    public abstract double conversionMedida();

}
