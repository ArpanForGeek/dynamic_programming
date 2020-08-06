package org.daysofCode.practice;

public class Factorial {

	static int fact = 1;
	// without using recursion recursion
	// private static void factorial(int number) {
	// int fact = 1;
	// for (int i = 1; i <= number; i++) {
	// fact = fact * i;
	// }
	// System.out.println("Result : "+ fact);
	// }

	// with using recursion
	private static void factorial(int number) {
		if (number > 0) {
			fact = fact * number;
			factorial(number - 1);
		}
	}

	public static void main(String[] args) {
		factorial(5);
		System.out.println("Result : " + fact);
	}

}
