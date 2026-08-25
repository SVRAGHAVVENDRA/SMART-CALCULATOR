package com.savoira;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Concrete class representing a division operation.
 * Inherits from {@link Operation} and implements {@link Calculable}.
 */
public class Division extends Operation {
    private static final Logger logger = LogManager.getLogger(Division.class);

    /**
     * Constructs a new Division operation with the specified operands.
     *
     * @param a the first numeric operand
     * @param b the second numeric operand
     */
    public Division(double a, double b) {
        super(a, b);
    }

    /**
     * Calculates the quotient of the two operands.
     * Handles division by zero by returning Double.NaN and logging a warning.
     *
     * @return the result of a / b, or Double.NaN if b is zero
     */
    @Override
    public double calculate() {
        if (b == 0) {
            logger.debug("Division by zero attempted: {} / {}", a, b);
            logger.warn("Error: division by zero");
            return Double.NaN;
        }
        return a / b;
    }

    /**
     * Returns a string representation of the division operation.
     *
     * @return a string in the format "Division: a / b = result"
     */
    @Override
    public String toString() {
        return String.format("Division: %.1f / %.1f = %.1f", a, b, calculate());
    }
}
