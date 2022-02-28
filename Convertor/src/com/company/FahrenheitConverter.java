package com.company;

class FahrenheitConverter extends Converter {

    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
