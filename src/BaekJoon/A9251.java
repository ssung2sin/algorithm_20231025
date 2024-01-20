package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9251 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder text1 = new StringBuilder();
		text1.append(0);
		text1.append(br.readLine());
		StringBuilder text2 = new StringBuilder();
		text2.append(0);
		text2.append(br.readLine());
		int[][] lcs = new int[text1.length() + 1][text2.length() + 1];
		boolean flag = false;
		for (int i = 0; i < text2.length(); i++) {
			lcs[0][i] = 0;
		}
		for (int i = 0; i < text1.length(); i++) {
			lcs[i][0] = 0;
		}
		for (int i = 1; i < text1.length(); i++) {
			for (int j = 1; j < text2.length(); j++) {
				if (text1.charAt(i) == text2.charAt(j)) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
				} else {
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
				}
			}
		}
		System.out.println(lcs[text1.length() - 1][text2.length() - 1]);
	}
}
