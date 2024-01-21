package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A15649 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int maxValue = Integer.parseInt(st.nextToken());
		int depth = Integer.parseInt(st.nextToken());
		int[] numberArray = new int[depth];
		backTrackingNumber(maxValue, depth, 0, numberArray);
	}

	private static void backTrackingNumber(int maxValue, int depth, int presentDepth, int[] numberArray) {
		if (presentDepth < depth) {
			for (int i = 1; i <= maxValue; i++) {
				int j;
				for (j = 0; j < presentDepth; j++) {
					if (numberArray[j] == i) {
						break;
					}
				}
				if (j == presentDepth) {
					numberArray[presentDepth] = i;
					backTrackingNumber(maxValue, depth, presentDepth + 1, numberArray);
				}
			}
		} else if (presentDepth == depth) {
			StringBuilder sb = new StringBuilder();
			for (int j : numberArray) {
				sb.append(j);
				sb.append(" ");
			}
			System.out.println(sb);
		}
	}
}
