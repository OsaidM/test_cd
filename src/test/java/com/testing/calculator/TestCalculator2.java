package com.testing.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestCalculator2 extends TestCase {
	Calculator calculator = null;
	
	 @BeforeEach
	    public void setUp() {
	        calculator = new Calculator(); // Setup before each test
	    }

    @AfterEach
    public void tearDown() {
        calculator = null; // Teardown after each test
    }
	
	
	@Test
	public void testAdd() {
		assertEquals(4,calculator.add(2, 2));
	} 
}
