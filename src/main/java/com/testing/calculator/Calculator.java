package com.testing.calculator;

import com.testing.service.CalculatorService;

public class Calculator {
	CalculatorService service;
	
	Calculator(CalculatorService service){
		this.service = service;
	}
	
	Calculator(){
	}
	
	public int add(int x, int y) {
		return x +y;
	}
	public int subtract(int x, int y) {
		return x -y;
	}
}
