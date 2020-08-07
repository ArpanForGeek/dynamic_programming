package org.daysofCode.practice;

public class BinaryConversion {

	private static void convertToBinary(int[] array) {
		int[] convert = new int[3];
		for (int i = 0; i < array.length; i++) {
			convert[i] = array[i] % 2;
			array[i] = array[i] / 2;
		}

		for (int j = 0; j < convert.length; j++) {
			System.out.print(convert[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 3 };
		convertToBinary(a);

	}

}
