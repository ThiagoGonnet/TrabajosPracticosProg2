package TP5.EJ2;

public abstract class ConversionGalonALitro extends Conversion{
    public ConversionGalonALitro(double unidadAConvertir) {
        super(unidadAConvertir);
    }

    @Override
    public double conversionMedida() {
        return unidadAConvertir * Conversion.GALON_A_LT;
    }
}
/*
galón es igual a 3,78541
litros.
 */