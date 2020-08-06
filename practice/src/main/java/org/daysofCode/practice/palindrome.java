package org.daysofCode.practice;

public class palindrome {
	static int rev, rem, temp;
	// private static void isPalindrome(int number) {
	// temp = number;
	// while(temp!=0) {
	//
	// rem = temp%10;
	// rev = rev*10+rem;
	// temp = temp/10;
	// }
	// System.out.println(rev);
	// if(number == rev) System.out.println("Palindrome");
	// }

	//using recursion
	private static boolean isPalindrome(int number) {
		temp = number;
		if (temp != 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			isPalindrome(temp / 10);
		}
		if (rev == number) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean isPalindrome = isPalindrome(1210);

		System.out.println("Is number Palindrome ? " + isPalindrome);

	}

}
