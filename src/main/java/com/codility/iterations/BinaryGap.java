package com.codility.iterations;

public class BinaryGap {
	public static void main(String[] args) {
		Integer input = 1041;

		String binaryOfInput = Integer.toBinaryString(input);
		System.out.println("Binary Gap " + solution(binaryOfInput));
	}

	public static int solution(String input) {
		int binaryDistance = 0;
		char[] valuesInArray = input.toCharArray();
		int count = 0;

		for (char c : valuesInArray) {
			if (c == '1') {
				if (count > binaryDistance) {
					binaryDistance = count;
				}
				count = 0;
			} else if (c == '0') {
				count++;
			}
		}
		return binaryDistance;
	}
}
