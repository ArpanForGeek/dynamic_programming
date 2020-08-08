package org.daysofCode.practice;

public class XOROperation {

	private static int doXorOperation(int[] array, int length) {
		if (length <= 0) {
			return 0;
		} else {
			return (~doXorOperation(array, length - 1) | ~array[length - 1])
					& (doXorOperation(array, length - 1) | array[length - 1]);
		}

	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 8 };
		System.out.println(doXorOperation(array, array.length));

	}

}
