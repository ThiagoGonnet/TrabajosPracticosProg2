package TP5.EJ2;

public class ConversionKiloALibra extends Conversion{

    public ConversionKiloALibra(double unidadAConvertir) {
        super(unidadAConvertir);
    }

    @Override
    public double conversionMedida() {
        return unidadAConvertir / Conversion.LIBRA_A_KG;
    }
}
/*
 una libra es igual a 0,453592 kilos
 */