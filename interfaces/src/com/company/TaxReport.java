package com.company;

public class TaxReport {
    private TaxCalculator2018 calculator;

    public TaxReport() {
        this.calculator = new TaxCalculator2018(100_000);
    }

    public void show() {
        var calc = calculator.calculateTax();
        System.out.println(calc);
    }
}
