package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int startNumber = Integer.parseInt(st.nextToken());
		int endNumber = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		boolean[] numbers = new boolean[endNumber + 1];

		for (int index = 2; index <= endNumber; index++) {
			numbers[index] = true;
		}

		for (int index = 2; index < numbers.length; index++) {
			if (!numbers[index]) {
				continue;
			}
			int i = index * 2;
			while (i < numbers.length) {
				numbers[i] = false;
				i += index;
			}
		}

		for (int index = startNumber; index <= endNumber; index++) {
			if (numbers[index]) {
				sb.append(index);
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
