package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int start = 0;
		int[] array = new int[n];
		while (start < n) {
			array[start] = start + 1;
			start++;
		}
		int m = Integer.parseInt(st.nextToken());
		for (int index = 0; index < m; index++) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			reverseSort(i, j, array);
		}

		for (int index = 0; index < n; index++) {
			System.out.print(array[index] + " ");
		}
	}

	private static void reverseSort(int i, int j, int[] array) {
		int div;
		if (i - j < 0) {
			div = j - i;
		} else {
			div = i - j;
		}
		if (div % 2 == 1) {
			int repeatNumber = (div + 1) / 2;
			for (int repeat = 0; repeat < repeatNumber; repeat++) {
				int temp = array[i - 1 + repeat];
				array[i - 1 + repeat] = array[j - 1 - repeat];
				array[j - 1 - repeat] = temp;
			}
		}
		if (div % 2 == 0) {
			int repeatNumber = (div + 1) / 2;
			for (int repeat = 0; repeat < repeatNumber; repeat++) {
				int temp = array[i - 1 + repeat];
				array[i - 1 + repeat] = array[j - 1 - repeat];
				array[j - 1 - repeat] = temp;
			}
		}
	}
}
