package org.daysofCode.practice;

public class Fibonacci {
	static int a = 0;
	static int b = 1;
	static int c;

	private static void calculateFibonacci(int number) {

		if (number > 0) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			calculateFibonacci(number - 1);
		}
	}

	public static void main(String[] args) {
		System.out.print(a + " " + b);
		calculateFibonacci(10);

	}

}
