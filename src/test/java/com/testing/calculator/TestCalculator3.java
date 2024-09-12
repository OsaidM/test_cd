package com.testing.calculator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.testing.service.CalculatorService;

import junit.framework.TestCase;

public class TestCalculator3 extends TestCase {
	Calculator calculator = null;
	CalculatorService calcService = mock(CalculatorService.class);
	
	@BeforeEach
    public void setUp() {
        calculator = new Calculator(calcService); // Setup before each test
 	}

    @AfterEach
    public void tearDown() {
        calculator = null; // Teardown after each test
    }
	
	
	@Test
	public void testAdd() {
		assertEquals(4,calculator.add(2, 2));
		when(calcService.authorize()).thenReturn(true);
		
	} 
	
}
