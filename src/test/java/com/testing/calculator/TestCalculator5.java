package com.testing.calculator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.testing.service.CalculatorService;

import junit.framework.TestCase;

public class TestCalculator5 extends TestCase {
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
    
}
