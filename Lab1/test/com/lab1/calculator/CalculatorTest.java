package com.lab1.calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	@Before
	public void setUp()
	{
		calculator  = new Calculator();
	}
	@Test
	public void addtest() {
		//fail("Not yet implemented");
		assertEquals(-4,calculator.add(-2,-2));
		
		
	}
	@Test
	public void subtracttest() {
		//fail("Not yet implemented");
		assertEquals(-0xD,calculator.subtract(0x2,0xf));
		
	}
	@Test
	public void multiplytest() {
		//fail("Not yet implemented");
		assertEquals(4,calculator.multiply(2,2));
		
	}
	@Test
	public void dividetest() {
		//fail("Not yet implemented");
		assertEquals(10,calculator.divide(999,100));
		assertEquals(1,calculator.divide(2,2));
		
	}
	@Test
	public void isEqualsTrueTest()
	{
		assertTrue(calculator.isEqual(2,2));
	}
	@Test
	public void isEqualsFalseTest()
	{
		assertFalse(calculator.isEqual(3,2));
	}

}
