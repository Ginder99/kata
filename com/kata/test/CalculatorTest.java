package com.kata.test;

import com.kata.add.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		runTests(new Calculator());
	}

	private static void runTests(Calculator calculator) {
		emptyString(calculator);
	}
	
	private static void emptyString(Calculator calculator) {
		System.out.println(calculator.add("")==0);
	}
}
