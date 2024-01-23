package BaekJoon;

import java.util.Scanner;

public class A15651 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int maxNumber = sc.nextInt();
		int depth = sc.nextInt();
		int[] numberArray = new int[depth];

		backTracking(maxNumber, depth, 0, numberArray, sb);

		System.out.println(sb);
	}

	private static void backTracking(int maxNumber, int depth, int presentDepth, int[] numberArray, StringBuilder sb) {
		if (presentDepth < depth) {
			for (int i = 1; i <= maxNumber; i++) {
				numberArray[presentDepth] = i;
				backTracking(maxNumber, depth, presentDepth + 1, numberArray, sb);
			}
		}
		if (presentDepth == depth) {
			for (int i = 0; i < depth; i++) {
				sb.append(numberArray[i]);
				sb.append(" ");
			}
			sb.append("\n");
		}
	}
}
