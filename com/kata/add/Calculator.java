package com.kata.add;

public class Calculator {

	private static final String EMPTY="";

	public int add(String numbers) {
		int answer=0;
		try {
			if(EMPTY.equals(numbers)) {
				return 0;
			}
		}
		catch (Exception e) {
		}
		return answer;
	}
}
