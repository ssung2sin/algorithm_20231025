package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A15654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int numberCount = Integer.parseInt(st.nextToken());
		int depth = Integer.parseInt(st.nextToken());
		int[] numberArray = new int[numberCount];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numberCount; i++) {
			numberArray[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(numberArray);
		StringBuilder sb = new StringBuilder();

		int[] printNumberArray = new int[depth];
		backTracking(numberCount, depth, 0, numberArray, printNumberArray, sb);
		System.out.println(sb);
	}

	private static void backTracking(int numberCount, int depth, int presentDepth, int[] numberArray,
		int[] printNumberArray, StringBuilder sb) {
		if (presentDepth < depth) {
			for (int i = 0; i < numberCount; i++) {
				int j;
				for (j = 0; j < presentDepth; j++) {
					if (numberArray[i] == printNumberArray[j]) {
						break;
					}
				}
				if (j == presentDepth) {
					printNumberArray[presentDepth] = numberArray[i];
					backTracking(numberCount, depth, presentDepth + 1, numberArray, printNumberArray, sb);
				}
			}
		} else if (presentDepth == depth) {
			for (int j : printNumberArray) {
				sb.append(j);
				sb.append(" ");
			}
			sb.append("\n");
		}
	}
}
