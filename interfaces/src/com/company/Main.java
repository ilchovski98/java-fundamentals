package com.company;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var taxReport = new TaxReport(calculator);
        taxReport.show();

        taxReport.setCalculator(new TaxCalculator2019());
        taxReport.show();
    }
}
