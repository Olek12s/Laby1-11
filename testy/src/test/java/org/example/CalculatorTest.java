package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest
{
    @Test
    public void testAdd()
    {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;

        int result = calculator.add(a, b);
        assertEquals(8, result);
    }
}
