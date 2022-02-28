package com.company;

class KelvinConverter extends Converter {

    double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}