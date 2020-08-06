package org.daysofCode.practice;

public class CountDeragnement {
	
	private static long countDerangement(int size) {
		if(size == 1) return 0;
		if(size == 2) return 1;
		return (size-1)*(countDerangement(size-1)+countDerangement(size-2));
	}

	public static void main(String[] args) {
		long count = countDerangement(4);
		System.out.println(count);
	}

}
