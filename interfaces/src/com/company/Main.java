package com.company;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var taxReport = new TaxReport();
        taxReport.show(calculator);
        taxReport.show(new TaxCalculator2018(10_000));
        taxReport.show(new TaxCalculator2019());
    }
}
