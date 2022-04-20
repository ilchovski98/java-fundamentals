package com.company;

public class TaxReport {
    private TaxCalculator calculator;

    public void show(TaxCalculator calculator) {
        var calc = calculator.calculateTax();
        System.out.println(calc);
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
