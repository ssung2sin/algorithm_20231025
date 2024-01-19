package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		int[] numberArray = new int[testCase];
		int[] dp = new int[testCase];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int index = 0; index < testCase; index++) {
			numberArray[index] = Integer.parseInt(st.nextToken());
			dp[index] = 1;
		}
		checkNumber(numberArray, dp);
		Arrays.sort(dp);
		System.out.println(dp[testCase - 1]);
	}

	private static void checkNumber(int[] numberArray, int[] dp) {
		for (int index1 = 0; index1 < numberArray.length - 1; index1++) {
			for (int index2 = index1 + 1; index2 < numberArray.length; index2++) {
				if (numberArray[index1] < numberArray[index2]) {
					if (dp[index1] + 1 > dp[index2]) {
						dp[index2] = dp[index1] + 1;

					}
				}
			}
		}
	}
}
