package TP5.EJ2;

public class ConversionPulgadaACentimetro extends Conversion{
    public ConversionPulgadaACentimetro(double unidadAConvertir) {
        super(unidadAConvertir);
    }

    @Override
    public double conversionMedida() {
        return unidadAConvertir *  Conversion.PULGADA_A_CM;
    }
}
