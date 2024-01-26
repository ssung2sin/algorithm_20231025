package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int value = Integer.parseInt(st.nextToken());
		int[][] numberArray = new int[value][value];
		int[][] totalValue = new int[value][value];
		for (int i = 0; i < value; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				numberArray[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		totalValue[0][0] = numberArray[0][0];
		for (int i = 0; i < value - 1; i++) {
			for (int j = 0; j <= i; j++) {
				int sum1 = totalValue[i][j] + numberArray[i + 1][j];
				int sum2 = totalValue[i][j] + numberArray[i + 1][j + 1];
				if (sum1 > totalValue[i + 1][j]) {
					totalValue[i + 1][j] = sum1;
				}
				if (sum2 > totalValue[i + 1][j + 1]) {
					totalValue[i + 1][j + 1] = sum2;
				}
			}
		}
		int maxValue = totalValue[value - 1][0];
		for (int i = 1; i < value; i++) {
			if (maxValue < totalValue[value - 1][i]) {
				maxValue = totalValue[value - 1][i];
			}
		}
		System.out.println(maxValue);
	}
}
