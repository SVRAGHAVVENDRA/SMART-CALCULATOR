package com.savoira;

import java.util.Scanner;

public class SmartCalculator {

    public static double calculate(double num1, double num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: division by zero");
                    return Double.NaN;
                }
                return num1 / num2;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: division by zero");
                    return Double.NaN;
                }
                return num1 % num2;
            case '^':
                return Math.pow(num1,num2);
            default:
                System.out.println("Unknown operator");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SmartCalculator ===");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("Enter first number (or 'exit'): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            // enter a number
            double num1;
            try {
                num1 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'exit'.");
                continue;
            }
            // enter operator
            System.out.print("Enter operator (+ - * / %): ");
            String opInput = sc.nextLine().trim();
            if (opInput.isEmpty()) {
                System.out.println("Operator cannot be empty.");
                continue;
            }
            char op = opInput.charAt(0);
            // enter second number
            System.out.print("Enter second number: ");
            String secondInput = sc.nextLine().trim();
            double num2;
            try {
                num2 = Double.parseDouble(secondInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                continue;
            }

            double result = calculate(num1, num2, op);

            if (!Double.isNaN(result)) {
                System.out.printf("Result: %.2f%n", result);
            }
        }
        System.out.println("Goodbye!");
        sc.close();
    }
}
