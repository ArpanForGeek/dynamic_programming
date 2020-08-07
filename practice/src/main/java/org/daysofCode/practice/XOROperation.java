package org.daysofCode.practice;

public class XOROperation {

	// without recursion
	// private static int XOROperation(int[] array,int length) {
	//
	// int result = 0;
	//
	//// for(int i=0;i<length;i++) {
	//// result = result^array[i];

	// }
	// return result;
	//
	// }

	// using recursion
	// private static int doXOROperation(int[] array, int length) {
	//
	// if (length <= 0) {
	// return 0;
	// } else {
	// return (doXOROperation(array, length - 1) ^ array[length - 1]);
	// }
	// }

//	private static int doXorOperation(int[] array, int length) {
//		// return (x|y) - (x&y);
//		if (length <= 0) {
//			return 0;
//		} else {
//			return (~doXorOperation(array, length - 1) | ~array[length - 1])
//					& (doXorOperation(array, length - 1) | array[length - 1]);
//		}
//
//	}
	
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
