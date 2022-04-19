package com.company;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var calc = calculator.calculateTax();
        System.out.println(calc);
    }
}
