package TP5.EJ2;

public class ConversionCentimetroAPulgada extends Conversion{
    public ConversionCentimetroAPulgada(double unidadAConvertir) {
        super(unidadAConvertir);
    }

    @Override
    public double conversionMedida() {
        return unidadAConvertir / 2.54;
    }
}
/*
 una pulgada es igual a 2,54
centímetros
 */