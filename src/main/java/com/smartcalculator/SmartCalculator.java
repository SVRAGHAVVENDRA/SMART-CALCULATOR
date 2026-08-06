package com.smartcalculator;

import java.util.Scanner;

public class SmartCalculator {

    // Method to perform basic arithmetic operations using switch statement
    public static double calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
                result = num1 / num2;
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    return Double.NaN;
                }
                result = num1 % num2;
                break;
            default:
                System.out.println("Error: Invalid operator '" + operator + "'. Please use +, -, *, /, or %.");
                return Double.NaN;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("========================================");
        System.out.println("     WELCOME TO SMART CALCULATOR        ");
        System.out.println("========================================");

        while (keepRunning) {
            System.out.println("\nEnter first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
                continue;
            }
            double num1 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
                continue;
            }
            double num2 = scanner.nextDouble();

            // Perform calculation
            double result = calculate(num1, num2, operator);

            if (!Double.isNaN(result)) {
                System.out.println("----------------------------------------");
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
                System.out.println("----------------------------------------");
            }

            // Ask user if they want to continue
            System.out.println("\nDo you want to perform another calculation? (yes/no): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
                keepRunning = false;
                System.out.println("Thank you for using Smart Calculator. Goodbye!");
            }
        }

        scanner.close();
    }
}
