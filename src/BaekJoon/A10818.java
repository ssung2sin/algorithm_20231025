package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int repeat = Integer.parseInt(st.nextToken());
		int[] number = new int[repeat];

		st = new StringTokenizer(bf.readLine());
		for (int index = 0; index < repeat; index++) {
			number[index] = Integer.parseInt(st.nextToken());
		}
		findMinAndMaxNumber(number);
	}

	private static void findMinAndMaxNumber(int[] number) {
		int min = number[0];
		int max = number[0];
		for (int index = 1; index < number.length; index++) {
			if (min > number[index]) {
				min = number[index];
			}
			if (max < number[index]) {
				max = number[index];
			}
		}
		System.out.println(min + " " + max);
	}
}
