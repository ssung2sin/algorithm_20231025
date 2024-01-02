package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int number = Integer.parseInt(st.nextToken());
		int formation = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while (number > 0) {
			int formatNumber = number % formation;
			number /= formation;
			if (formatNumber < 10) {
				sb.append((char)(formatNumber + 48));
			} else {
				sb.append((char)(formatNumber + 55));
			}
		}

		for (int index = 0; index < sb.length(); index++) {
			System.out.print(sb.toString().charAt(sb.length() - index - 1));
		}
	}
}
