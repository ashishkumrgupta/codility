package com.codility.timecomplexity;

import java.util.Arrays;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4, 3 };
		System.out.println(solution_new(A));
	}

	/* complexity of O(n^2) */
	public static int solution(int[] A) {
		int size = A.length;
		int finalResult = Integer.MAX_VALUE;

		for (int i = 1; i < size; i++) {
			int result;

			int[] left = Arrays.copyOfRange(A, 0, i);
			System.out.print("left: " + Arrays.toString(left));
			int[] right = Arrays.copyOfRange(A, i, size);
			System.out.print("   right: " + Arrays.toString(right));

			result = Math.abs(sumOfArray(left) - sumOfArray(right));
			System.out.println("sum: " + result);

			if (finalResult > result)
				finalResult = result;
		}
		return finalResult;
	}

	/* complexity of O(n) */

	public static int solution_new(int[] A) {

		int size = A.length;
		int finalResult = Integer.MAX_VALUE;

		int left = 0;
		int right = sumOfArray(A);

		for (int i = 0; i < size - 1; i++) {
			int result;
			left = left + A[i];
			right = right - A[i];
			result = Math.abs(left - right);

			if (finalResult > result)
				finalResult = result;
		}
		return finalResult;
	}

	public static int sumOfArray(int[] input) {
		int sum = 0;
		for (int i : input) {
			sum = sum + i;
		}
		return sum;
	}

}
