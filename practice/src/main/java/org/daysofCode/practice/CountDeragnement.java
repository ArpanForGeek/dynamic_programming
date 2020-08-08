package org.daysofCode.practice;

import java.util.Arrays;

public class CountDeragnement {
	int size;

	private CountDeragnement(int size) {
		this.size = size;
	}

	private long countDerangement() {
		return countDerangement(this.size);
	}

	private long countDerangement(int size) {
		if (size == 1)
			return 0;
		if (size == 2)
			return 1;
		return (size - 1) * (countDerangement(size - 1) + countDerangement(size - 2));
	}

	public static void main(String[] args) {
		// Assume there are 4 students
		long start = System.nanoTime();
		long derangementCount = new CountDeragnement(64).countDerangement();
		long end = System.nanoTime();
		long timeTaken = end - start;
		System.out.println(timeTaken);
		System.out.println("count of derangement :" + derangementCount);
	}

}
