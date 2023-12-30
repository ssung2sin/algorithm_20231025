package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] number = new int[9];
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(bf.readLine());
			number[i] = Integer.parseInt(st.nextToken());
		}

		findMaxNumber(number);
	}

	private static void findMaxNumber(int[] box) {
		int max = 0;
		int idx = 0;
		for (int index = 0; index < box.length; index++) {
			if (max < box[index]) {
				max = box[index];
				idx = index + 1;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
