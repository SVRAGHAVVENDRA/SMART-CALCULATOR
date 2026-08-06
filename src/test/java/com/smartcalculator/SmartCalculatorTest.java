package com.smartcalculator;

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
}
