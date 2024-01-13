package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(st.nextToken());

		for (int index = 0; index < testCase; index++) {
			st = new StringTokenizer(br.readLine());
			int numberA = Integer.parseInt(st.nextToken());
			int numberB = Integer.parseInt(st.nextToken());
			int bigNumber;
			int smallNumber;
			long total = 1;
			if (numberA > numberB) {
				bigNumber = numberA;
				smallNumber = numberB;
			} else {
				bigNumber = numberB;
				smallNumber = numberA;
			}
			for (int index2 = 1; index2 <= smallNumber; index2++) {
				total *= (bigNumber - index2 + 1);
				total /= index2;
			}
			sb.append(total);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
