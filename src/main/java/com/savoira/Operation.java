package com.savoira;

/**
 * Represents a mathematical operation containing two operands and an operator.
 * Encapsulates the inputs required for a mathematical calculation.
 */
public class Operation {
    private final double firstOperand;
    private final String operator;
    private final double secondOperand;

    /**
     * Constructs a new Operation with the specified operands and operator.
     *
     * @param firstOperand  the first numeric operand
     * @param operator      the mathematical operator (e.g., "+", "-", "*", "/", "%")
     * @param secondOperand the second numeric operand
     */
    public Operation(double firstOperand, String operator, double secondOperand) {
        this.firstOperand = firstOperand;
        this.operator = operator;
        this.secondOperand = secondOperand;
    }

    /**
     * Gets the first operand of this operation.
     *
     * @return the first operand as a double
     */
    public double getFirstOperand() {
        return firstOperand;
    }

    /**
     * Gets the operator of this operation.
     *
     * @return the operator as a String
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Gets the second operand of this operation.
     *
     * @return the second operand as a double
     */
    public double getSecondOperand() {
        return secondOperand;
    }
}
