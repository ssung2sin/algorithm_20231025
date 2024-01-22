package BaekJoon;

import java.util.Scanner;

public class A15650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maxNumber = sc.nextInt();
		int depth = sc.nextInt();
		int[] numberArray = new int[depth];
		for (int i = 1; i <= maxNumber; i++) {
			numberArray[0] = i;
			backTracking(maxNumber, depth, 1, numberArray);
		}
	}

	private static void backTracking(int maxNumber, int depth, int presentDepth, int[] numberArray) {
		StringBuilder sb = new StringBuilder();
		for (int i = numberArray[presentDepth - 1] + 1; i <= maxNumber; i++) {
			if (presentDepth < depth) {
				numberArray[presentDepth] = i;
				backTracking(maxNumber, depth, presentDepth + 1, numberArray);
			}
		}
		if (presentDepth == depth) {
			for (int i = 0; i < depth; i++) {
				sb.append(numberArray[i]);
				sb.append(" ");
			}
			System.out.println(sb);
		}
	}
}
