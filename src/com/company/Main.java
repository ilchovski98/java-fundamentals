package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        System.out.print("Loan:");
        long principal = scanner.nextLong();

        System.out.print("Yearly interest rate:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Years:");
        byte periodInYears = scanner.nextByte();
        int numberOfPayments = periodInYears * MONTHS_IN_YEAR;

        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Bill per month:" + mortgageFormatted);
    }
}
