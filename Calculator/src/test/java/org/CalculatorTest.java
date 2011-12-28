package org.farmas;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * TODO: Document this class / interface here
 *
 * @since v4.3
 */
public class CalculatorTest
{
    @Test
    public void addNumbers()
    {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(1,1));
    }
	
	@Test
    public void addNumbers2()
    {
        Calculator calc = new Calculator();
        assertEquals(3, calc.add(2,1));
    }
}
