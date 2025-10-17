package TP5.EJ2;

public class ConversionLitroAGalon extends Conversion{
    public ConversionLitroAGalon(double unidadAConvertir) {
        super(unidadAConvertir);
    }

    @Override
    public double conversionMedida() {
        return unidadAConvertir / Conversion.GALON_A_LT;
    }
}
/*
 un galón es igual a 3,78541
litros
 */