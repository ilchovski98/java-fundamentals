package com.company;

import java.text.NumberFormat;

public class MortgageReport {
    public static void printMortgage(Mortage mortage) {
        double mortgage = mortage.calculateMortgage(mortage.principal, mortage.annualInterest, mortage.years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(Mortage mortage) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= mortage.years * mortage.MONTHS_IN_YEAR; month++) {
            double balance = mortage.calculateBalance(mortage.principal, mortage.annualInterest, mortage.years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
