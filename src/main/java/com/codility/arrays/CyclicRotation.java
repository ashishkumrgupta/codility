package com.codility.arrays;

import java.util.Arrays;

public class CyclicRotation {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(solution(input, 2)));
	}

	private static int[] solution(int[] A, int K) {
		int size = A.length;

		if (size == 0 || size == 1 || size == K || K == 0) {
			return A;
		} else {
			for (int i = 0; i < K; i++) {
				int tmp = A[size - 1];

				for (int j = size - 2; j >= 0; j--) {
					A[j + 1] = A[j];
				}
				A[0] = tmp;
			}
		}
		return A;
	}
}
