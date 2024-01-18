package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2579 {
	//시간초과
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] stairs = new int[testCase];
		int[] maxScore = new int[1];

		inputStairs(br, stairs);
		checkMaxValue(0, 0, stairs, maxScore, 0);
		System.out.println(maxScore[0]);

	}

	private static void inputStairs(BufferedReader br, int[] stairs) throws IOException {
		for (int index = 0; index < stairs.length; index++) {
			stairs[index] = Integer.parseInt(br.readLine());
		}
	}

	private static void checkMaxValue(int index, int sumValue, int[] stairs, int[] maxScore, int flag) {
		if (index < stairs.length) {
			if (flag == 1) {
				if (index != stairs.length - 1) {
					checkMaxValue(index + 2, sumValue + stairs[index], stairs, maxScore, 0);
				}
			} else {
				checkMaxValue(index + 1, sumValue + stairs[index], stairs, maxScore, flag + 1);
				checkMaxValue(index + 2, sumValue + stairs[index], stairs, maxScore, 0);
			}
		}
		if (index == stairs.length) {
			if (maxScore[0] < sumValue) {
				maxScore[0] = sumValue;
			}
		}
	}*/

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] stairs = new int[testCase];
		int[][] totalScore = new int[2][testCase];

		inputStairs(br, stairs);
		if (testCase == 1) {
			totalScore[0][0] = stairs[0];
		} else {
			totalScore[0][0] = stairs[0];
			totalScore[0][1] = stairs[0] + stairs[1];
			totalScore[1][1] = stairs[1];
		}

		findMaxScore(stairs, totalScore);

		if (totalScore[0][stairs.length - 1] > totalScore[1][stairs.length - 1]) {
			System.out.println(totalScore[0][stairs.length - 1]);
		} else {
			System.out.println(totalScore[1][stairs.length - 1]);
		}

	}

	private static void inputStairs(BufferedReader br, int[] stairs) throws IOException {
		for (int index = 0; index < stairs.length; index++) {
			stairs[index] = Integer.parseInt(br.readLine());
		}
	}

	private static void findMaxScore(int[] stairs, int[][] totalScore) {
		for (int i = 2; i < stairs.length; i++) {
			totalScore[0][i] = totalScore[1][i - 1] + stairs[i];
			if (totalScore[0][i - 2] > totalScore[1][i - 2]) {
				totalScore[1][i] = totalScore[0][i - 2] + stairs[i];
			} else {
				totalScore[1][i] = totalScore[1][i - 2] + stairs[i];
			}
		}
	}

}
