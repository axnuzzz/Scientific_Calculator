package com.calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ScientificCalculatorTest {

    private ScientificCalculator calculator;
    private static final double DELTA = 1e-15;

    @Before
    public void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, calculator.squareRoot(4.0), DELTA);
        assertEquals(3.0, calculator.squareRoot(9.0), DELTA);
        assertEquals(0.0, calculator.squareRoot(0.0), DELTA);
        assertEquals(1.0, calculator.squareRoot(1.0), DELTA);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(120, calculator.factorial(5));
        assertEquals(3628800, calculator.factorial(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        calculator.factorial(-1);
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, calculator.naturalLog(1.0), DELTA);
        assertEquals(1.0, calculator.naturalLog(Math.E), DELTA);
        assertEquals(2.302585092994046, calculator.naturalLog(10.0), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogZero() {
        calculator.naturalLog(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogNegative() {
        calculator.naturalLog(-1.0);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), DELTA);
        assertEquals(1.0, calculator.power(5.0, 0.0), DELTA);
        assertEquals(0.25, calculator.power(2.0, -2.0), DELTA);
        assertEquals(1.0, calculator.power(1.0, 1000.0), DELTA);
    }
}