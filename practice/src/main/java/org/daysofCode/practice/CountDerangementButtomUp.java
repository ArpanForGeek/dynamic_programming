package org.daysofCode.practice;

public class CountDerangementButtomUp {

	int size;
	long[] subProblem;

	private CountDerangementButtomUp(int size) {
		this.size = size;
		this.subProblem = new long[size + 1];
		for (int i = 1; i <= size; i++) {
			if (i == 1)
				subProblem[i] = 0;
			else if (i == 2)
				subProblem[i] = 1;
			else
				subProblem[i] = (i - 1) * (this.subProblem[i - 1] + this.subProblem[i - 2]);
		}
	}

	private long countDerangement() {
		return subProblem[size];
	}

	public static void main(String[] args) {
		long count = new CountDerangementButtomUp(64).countDerangement();
		System.out.println("Count of derangement " + count);

	}

}
