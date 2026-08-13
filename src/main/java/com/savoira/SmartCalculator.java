package com.savoira;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Entry point for the SmartCalculator interactive CLI application.
 * Coordinates user input scanning, parsing, operational logic delegation,
 * and console results display.
 */
public class SmartCalculator {

    private static final Logger logger = LogManager.getLogger(SmartCalculator.class);

    /**
     * Default constructor for SmartCalculator.
     */
    public SmartCalculator() {
        // No-arg constructor
    }

    /**
     * Calculates the result for the given inputs by delegating to the new OOP classes.
     * Maintained for backward compatibility with earlier phase builds and tests.
     *
     * @param num1     the first numeric operand
     * @param num2     the second numeric operand
     * @param operator the operator character (+, -, *, /, %)
     * @return the result of the calculation, or Double.NaN if an error occurs
     * @deprecated Use {@link Calculator#calculate(Operation)} instead.
     */
    @Deprecated
    public static double calculate(double num1, double num2, char operator) {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(num1, String.valueOf(operator), num2);
        return calculator.calculate(operation);
    }

    /**
     * Main entry point for the interactive CLI loop.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        logger.debug("Starting SmartCalculator Application...");
        Scanner scanner = new Scanner(System.in);
        logger.info("=== SmartCalculator ===");
        logger.info("Type 'exit' to quit.");

        Calculator calculator = new Calculator();

        while (true) {
            logger.info("Enter first number (or 'exit'): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                logger.debug("User requested application exit.");
                break;
            }

            double firstNumber;
            try {
                firstNumber = Double.parseDouble(input);
            } catch (NumberFormatException exception) {
                logger.debug("Invalid first number input entered: '{}'", input);
                logger.warn("Invalid input! Please enter a valid number or 'exit'.");
                continue;
            }

            logger.info("Enter operator (+ - * / %): ");
            String operatorInput = scanner.nextLine().trim();
            if (operatorInput.isEmpty()) {
                logger.debug("User entered an empty operator.");
                logger.warn("Operator cannot be empty.");
                continue;
            }
            String operator = String.valueOf(operatorInput.charAt(0));

            logger.info("Enter second number: ");
            String secondInput = scanner.nextLine().trim();
            double secondNumber;
            try {
                secondNumber = Double.parseDouble(secondInput);
            } catch (NumberFormatException exception) {
                logger.debug("Invalid second number input entered: '{}'", secondInput);
                logger.warn("Invalid input! Please enter a valid number.");
                continue;
            }

            Operation operation = new Operation(firstNumber, operator, secondNumber);
            double result = calculator.calculate(operation);

            if (!Double.isNaN(result)) {
                logger.info(String.format("Result: %.2f", result));
            }
        }
        logger.info("Goodbye!");
        logger.debug("SmartCalculator Application terminated cleanly.");
        scanner.close();
    }
}
