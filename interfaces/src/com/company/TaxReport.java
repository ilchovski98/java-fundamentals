package com.company;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport() {
        this.calculator = new TaxCalculator(100_000);
    }

    public void show() {
        var calc = calculator.calculateTax();
        System.out.println(calc);
    }
}
