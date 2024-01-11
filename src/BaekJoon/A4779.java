package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class A4779 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int number = sc.nextInt();
		int nSquared3 = 1;
		for (int i = 0; i < number; i++) {
			nSquared3 *= 3;
		}

		char[] dash = new char[nSquared3];
		Arrays.fill(dash, '-');

		int[] result = new int[1];
		sortDash(dash, 0, dash.length - 1, result);
		for (int i = 0; i < dash.length; i++) {
			sb.append(dash[i]);
		}
		System.out.println(sb);
		System.out.println(result[0]);

	}

	private static void sortDash(char[] dash, int start, int end, int[] result) {
		if (end - start > 0) {
			end++;
			int reEnd = (end - start) / 3;
			for (int index = reEnd + start; index < start + (reEnd * 2); index++) {
				dash[index] = ' ';
				result[0]++;

			}
			sortDash(dash, start, start + reEnd - 1, result);
			sortDash(dash, start + (reEnd * 2), end - 1, result);

		}
	}
}
