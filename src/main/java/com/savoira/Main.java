package com.savoira;

import java.util.Scanner;

public class Main {
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

            double a;
            try {
                a = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'exit'.");
                continue;
            }

            System.out.print("Enter operator (+ - * / %): ");
            String op = sc.nextLine().trim();

            System.out.print("Enter second number: ");
            String secondInput = sc.nextLine().trim();
            double b;
            try {
                b = Double.parseDouble(secondInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                continue;
            }

            double result = switch (op) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> {
                    if (b == 0) {
                        System.out.println("Error: division by zero");
                        yield Double.NaN;
                    } else {
                        yield a / b;
                    }
                }
                case "%" -> {
                    if (b == 0) {
                        System.out.println("Error: division by zero");
                        yield Double.NaN;
                    } else {
                        yield a % b;
                    }
                }
                default -> {
                    System.out.println("Unknown operator");
                    yield Double.NaN;
                }
            };

            if (!Double.isNaN(result)) {
                System.out.printf("Result: %.2f%n", result);
            }
        }
        System.out.println("Goodbye!");
        sc.close();
    }
}
