package com.savoira;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Concrete class representing a modulo operation.
 * Inherits from {@link Operation} and implements {@link Calculable}.
 */
public class Modulo extends Operation {
    private static final Logger logger = LogManager.getLogger(Modulo.class);

    /**
     * Constructs a new Modulo operation with the specified operands.
     *
     * @param a the first numeric operand
     * @param b the second numeric operand
     */
    public Modulo(double a, double b) {
        super(a, b);
    }

    /**
     * Calculates the remainder of division of the two operands.
     * Handles modulo by zero by returning Double.NaN and logging a warning.
     *
     * @return the result of a % b, or Double.NaN if b is zero
     */
    @Override
    public double calculate() {
        if (b == 0) {
            logger.debug("Modulo by zero attempted: {} % {}", a, b);
            logger.warn("Error: division by zero");
            return Double.NaN;
        }
        return a % b;
    }

    /**
     * Returns a string representation of the modulo operation.
     *
     * @return a string in the format "Modulo: a % b = result"
     */
    @Override
    public String toString() {
        return String.format("Modulo: %.1f %% %.1f = %.1f", a, b, calculate());
    }
}
