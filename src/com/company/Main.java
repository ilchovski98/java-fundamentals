package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

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
    }
}
