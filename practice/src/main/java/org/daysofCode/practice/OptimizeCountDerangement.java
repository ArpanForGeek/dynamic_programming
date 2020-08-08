package org.daysofCode.practice;

public class OptimizeCountDerangement {

	int size;
	long subSolution;

	private OptimizeCountDerangement(int size) {
		this.size = size;
		long subSolutionNminusTwo = 0;
		long subSolutionNminusOne = 0;
		for (int i = 1; i <= size; i++) {
			if (i == 1)
				this.subSolution = 0;
			else if (i == 2)
				this.subSolution = 1;
			else
				this.subSolution = (i - 1) * (subSolutionNminusOne + subSolutionNminusTwo);
			subSolutionNminusTwo = subSolutionNminusOne;
			subSolutionNminusOne = this.subSolution;
		}

	}

	private long countDerangement() {
		return this.subSolution;
	}

	public static void main(String[] args) {

		long count = new OptimizeCountDerangement(4).countDerangement();
		System.out.println("count of derangement " + count);

	}

}
