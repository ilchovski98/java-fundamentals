package com.company;

public class Main {
    public static void main(String[] args) {
        var mortage = new Mortage();
        MortgageReport.printMortgage(mortage);
        MortgageReport.printPaymentSchedule(mortage);
    }
}
