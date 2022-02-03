package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Primitive values
//        byte age = 30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;

        // Reference types
//        Date now = new Date();
//        System.out.println(now);
//	    System.out.println(age);

        // Primitive types: we store each value in a seperate memory location (independent of each other)
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(x);

        // Reference types: Here we store not the actual value but a pointer/reference of the object/value in memory
        // If we change the value we change the value for every variable that points to the same memory slot
//        Point point1 = new Point(1,2);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

        // Strings!
//        String message = new String("Hello World");
        // In Java strings are immutable. When we modifie a string with a method we create a new string object
//        String message = "    Hello World" + "!!   ";
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.trim());
//        System.out.println(message);

        // Escape Sequences!
//        String message = "Hello \"Mosh\"";
//        String path = "c:\\Windows\nsome\\blalalal\tyeyeyeye";
//        System.out.println(path);
//        System.out.println(message);

        // Arrays!
        // Arrays have a fixed length and cannot be changed.
        // If we would like to take out elements we should use collections
        // int[] numbers = new int[5];
//        int[] numbers = { 4, 5, 3, 1, 2 };
//        Arrays.sort(numbers);
//        System.out.println(numbers[0]);
//        System.out.println(Arrays.toString(numbers));

        // Multi-dimensional Arrays
//        int[][] numbers = new int[2][3];
//        int[][] numbers2 = {{ 1, 2, 3 }, { 4, 5, 6 }};
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));
//        System.out.println(Arrays.deepToString(numbers2));

        // Constants - its like const in js
        // Use capital letters to name constants
//        final float PI = 3.14F;
//        PI = 1;
//        System.out.println(pi);

        // Arithmetic Expressions
//        int result = 1 + 5;
//        double result = (double)5 / (double)2;
//        int x = 5;
//        int y = 2;
//        double result = (double)x / (double)y;
//        int b = y++;
//        int c = ++x;
//        System.out.println(y);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(result);

        // Casting and type conversion
        // implicit casting/automatic conversion
        // The smallest get converted to the bigger one: byte > shot > int > long > float > double
//        short x = 1;
//        int y = x + 1;
//        System.out.println(y);

//        double x = 1.1;
//        double y = x + 2;
        // or
//        double x = 1.1;
//        double y = (int)x + 2;

//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2;
//        System.out.println(y);

        // The math class
//        double result = Math.round(Math.random() * 100);
//        System.out.println(result);

        //Formatting numbers
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String  result = percent.format(1234567.891);
//        System.out.println(result);

        // Reading input from the user
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name:");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);

        // Exercise
        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        System.out.print("Заем:");
        long principal = scanner.nextLong();

        System.out.print("Годишна лихва:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Години:");
        byte periodInYears = scanner.nextByte();
        int numberOfPayments = periodInYears * MONTHS_IN_YEAR;

        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Вноска на месец:" + mortgageFormatted);
    }
}
