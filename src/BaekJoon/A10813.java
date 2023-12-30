package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10813 {
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
			if (i == j) {
				continue;
			}
			int temp = array[i - 1];
			array[i - 1] = array[j - 1];
			array[j - 1] = temp;
		}

		for (int index = 0; index < n; index++) {
			System.out.print(array[index] + " ");
		}
	}
}
