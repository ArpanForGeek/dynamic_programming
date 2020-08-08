package org.daysofCode.practice;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CountDerangementTopDown {

	int size;
	long[] subProblems;

	private CountDerangementTopDown(int size) {
		this.size = size;
		this.subProblems = new long[size + 1];
		Arrays.fill(this.subProblems, -1);
	}

	private long countDerangement() {
		return countDerangement(this.size);
	}

	private long countDerangement(int size) {
		if (this.subProblems[size] != -1)
			return this.subProblems[size];
		if (size == 1)
			return 0;
		if (size == 2)
			return 1;
		long result = (size - 1) * (countDerangement(size - 1) + countDerangement(size - 2));
		this.subProblems[size] = result;
		return result;

	}

	public static void main(String[] args) {
		long start = System.nanoTime();
		long result = new CountDerangementTopDown(64).countDerangement();
		long end = System.nanoTime();
		long timeTaken = end - start;
		System.out.println(result);
		System.out.println(timeTaken);

	}

}
