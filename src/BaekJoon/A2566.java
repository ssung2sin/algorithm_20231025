package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = 0;
		int row = 0, column = 0;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < 9; j++) {
				int number = Integer.parseInt(st.nextToken());
				if (max <= number) {
					max = number;
					row = i + 1;
					column = j + 1;
				}
			}
		}

		System.out.println(max);
		System.out.println(row + " " + column);
	}
}
