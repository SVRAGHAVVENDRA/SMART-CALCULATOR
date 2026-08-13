package com.savoira;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Handles the calculation logic for arithmetic operations and provides mathematical utilities.
 * Follows the WORM (Write Once, Reuse Many) principle by centralizing arithmetic execution.
 */
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Performs calculations for the given Operation.
     * Evaluates the operator using a switch expression and applies the operation.
     *
     * @param operation the Operation containing operands and operator
     * @return the double result of the operation, or Double.NaN if division/modulo by zero or unknown operator
     */
    public double calculate(Operation operation) {
        double first = operation.getFirstOperand();
        double second = operation.getSecondOperand();
        String op = operation.getOperator();

        logger.debug("Executing calculation: {} {} {}", first, op, second);

        return switch (op) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> {
                if (second == 0) {
                    logger.debug("Division by zero attempted: {} / {}", first, second);
                    logger.warn("Error: division by zero");
                    yield Double.NaN;
                }
                yield first / second;
            }
            case "%" -> {
                if (second == 0) {
                    logger.debug("Modulo by zero attempted: {} % {}", first, second);
                    logger.warn("Error: division by zero");
                    yield Double.NaN;
                }
                yield first % second;
            }
            default -> {
                logger.debug("Unknown operator used: {}", op);
                logger.error("Unknown operator");
                yield Double.NaN;
            }
        };
    }

    /**
     * Calculates the square root of a given number.
     *
     * @param number the double value to find the square root of
     * @return the square root of the number, or Double.NaN if the number is negative
     */
    public static double squareRoot(double number) {
        if (number < 0) {
            logger.debug("Square root of a negative number attempted: {}", number);
            logger.warn("Error: Cannot calculate square root of a negative number.");
            return Double.NaN;
        }
        logger.debug("Calculating square root of: {}", number);
        return Math.sqrt(number);
    }

    /**
     * Calculates the percentage representation of a given number (divides by 100).
     *
     * @param number the double value to convert to a percentage
     * @return the value divided by 100
     */
    public static double percentage(double number) {
        logger.debug("Calculating percentage of: {}", number);
        return number / 100.0;
    }
}
