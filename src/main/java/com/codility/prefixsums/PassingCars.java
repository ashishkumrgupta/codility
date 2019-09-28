package com.codility.prefixsums;

public class PassingCars {

	public static void main(String[] args) {
		int A[] = { 0, 1, 0, 1, 1 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int MAX_LIMIT = 1000000000;
		int result = 0;

		// Removed streams as one of the test cases were going out of time limit.
//		int countOfOnes = (int) Arrays.stream(A).filter(value -> value == 1).count();
		int countOfOnes = findCountOfOnes(A);

		for (int i = 0; i < A.length; i++) {
			if (result <= MAX_LIMIT) {
				if (A[i] == 0) {
					result = result + countOfOnes;
				} else {
					countOfOnes--;
				}
			} else {
				result = -1;
				break;
			}
		}
		return result;
	}

	public static int findCountOfOnes(int A[]) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 1)
				result++;
		}
		return result;
	}

}
