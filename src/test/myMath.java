package test;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class myMath {
    private static final double PI = 3.14;

    public static int square(int number) {
        return number * number;
    }

    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius) {
        return PI * radius * radius;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (final int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
