package com.codility.countingelements;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		int[] input = {  1, 4, 3 };
		System.out.println(solution(input));
	}

	public static int solution(int[] A) {
		Arrays.sort(A);

		int count = 1;
		for (int i = 0; i < A.length; i++) {
			if (count != A[i])
				return 0;
			count++;
		}
		return 1;
	}

}
