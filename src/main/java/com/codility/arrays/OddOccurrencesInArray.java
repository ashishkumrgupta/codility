package com.codility.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {
	public static void main(String[] args) {
		int[] input = { 9, 3, 3, 9, 10 };
		System.out.println(solution(input));
	}

	private static int solution(int[] input) {
		Arrays.sort(input);
		int size = input.length;

		int i = 0;
		while (i < size - 1) {
			if (input[i] != input[i + 1]) {
				return input[i];
			} else {
				i = i + 2;
			}
		}
		return input[size - 1];
	}
}
