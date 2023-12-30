package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] number = new int[3];
		for (int i = 0; i < 3; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}

		isSameInteger(number);
	}

	private static void isSameInteger(int[] number) {
		if (number[0] == number[1] && number[1] == number[2]) {
			System.out.println(10000 + number[0] * 1000);
		} else {
			twoSameInteger(number);
		}
	}

	private static void twoSameInteger(int[] number) {
		if (number[0] == number[1] || number[0] == number[2]) {
			System.out.println(1000 + number[0] * 100);
		} else if (number[1] == number[2]) {
			System.out.println(1000 + number[1] * 100);
		} else {
			notSameInteger(number);
		}
	}

	private static void notSameInteger(int[] number) {
		int maxNumber = number[0];
		for (int i = 1; i < 3; i++) {
			if (maxNumber < number[i]) {
				maxNumber = number[i];
			}
		}
		System.out.println(maxNumber * 100);
	}
}
