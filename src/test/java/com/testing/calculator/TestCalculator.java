package com.testing.calculator;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(2,calculator.add(2, 2));
	} 
}
