package com.savoira;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartCalculatorTest {

    @Test
    public void testAddition() {
        double result = SmartCalculator.calculate(10.0, 5.0, '+');
        assertEquals(15.0, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        double result = SmartCalculator.calculate(20.0, 8.0, '-');
        assertEquals(12.0, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        double result = SmartCalculator.calculate(6.0, 7.0, '*');
        assertEquals(42.0, result, 0.0001);
    }

    @Test
    public void testDivision() {
        double result = SmartCalculator.calculate(20.0, 4.0, '/');
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testModulo() {
        double result = SmartCalculator.calculate(17.0, 5.0, '%');
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        double result = SmartCalculator.calculate(10.0, 0.0, '/');
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testInvalidOperator() {
        double result = SmartCalculator.calculate(10.0, 5.0, '^');
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testCalculatorAddition() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(12.5, "+", 7.5);
        assertEquals(20.0, calculator.calculate(operation), 0.0001);
    }

    @Test
    public void testCalculatorSubtraction() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(10.0, "-", 3.5);
        assertEquals(6.5, calculator.calculate(operation), 0.0001);
    }

    @Test
    public void testCalculatorMultiplication() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(4.0, "*", 2.5);
        assertEquals(10.0, calculator.calculate(operation), 0.0001);
    }

    @Test
    public void testCalculatorDivision() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(9.0, "/", 2.0);
        assertEquals(4.5, calculator.calculate(operation), 0.0001);
    }

    @Test
    public void testCalculatorModulo() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(10.0, "%", 3.0);
        assertEquals(1.0, calculator.calculate(operation), 0.0001);
    }

    @Test
    public void testCalculatorDivisionByZero() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(10.0, "/", 0.0);
        assertTrue(Double.isNaN(calculator.calculate(operation)));
    }

    @Test
    public void testCalculatorModuloByZero() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(10.0, "%", 0.0);
        assertTrue(Double.isNaN(calculator.calculate(operation)));
    }

    @Test
    public void testCalculatorInvalidOperator() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation(10.0, "invalid", 5.0);
        assertTrue(Double.isNaN(calculator.calculate(operation)));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, Calculator.squareRoot(25.0), 0.0001);
        assertEquals(0.0, Calculator.squareRoot(0.0), 0.0001);
        assertTrue(Double.isNaN(Calculator.squareRoot(-9.0)));
    }

    @Test
    public void testPercentage() {
        assertEquals(0.25, Calculator.percentage(25.0), 0.0001);
        assertEquals(1.5, Calculator.percentage(150.0), 0.0001);
        assertEquals(0.0, Calculator.percentage(0.0), 0.0001);
    }
}
