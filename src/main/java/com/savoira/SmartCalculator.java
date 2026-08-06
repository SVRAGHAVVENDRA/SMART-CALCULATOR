package com.savoira;

import java.util.Scanner;

public class SmartCalculator {

    public static double calculate(double num1, double num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: division by zero");
                    yield Double.NaN;
                }
                yield num1 / num2;
            }
            case '%' -> {
                if (num2 == 0) {
                    System.out.println("Error: division by zero");
                    yield Double.NaN;
                }
                yield num1 % num2;
            }
            default -> {
                System.out.println("Unknown operator");
                yield Double.NaN;
            }
        };
    }

    public static void main(String[] args) {
        Main.main(args);
    }
}
