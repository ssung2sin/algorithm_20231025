package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int repeat = Integer.parseInt(st.nextToken());

		for (int index1 = 0; index1 < repeat; index1++) {
			st = new StringTokenizer(br.readLine());
			int inputCount = Integer.parseInt(st.nextToken());
			int[] numbers = new int[inputCount];
			for (int index2 = 0; index2 < inputCount; index2++) {
				numbers[index2] = Integer.parseInt(st.nextToken());
			}
			sb.append(searchGCD(numbers));
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static long searchGCD(int[] numbers) {
		long sum = 0;
		for (int index1 = 0; index1 < numbers.length - 1; index1++) {
			for (int index2 = index1 + 1; index2 < numbers.length; index2++) {
				sum += compareNumber(numbers[index1], numbers[index2]);
			}
		}
		return sum;
	}

	private static int compareNumber(int number1, int number2) {
		int total = 1;
		if (number1 > number2) {
			while (true) {
				int index = 2;
				for (index = 2; index <= number2; index++) {
					if (number2 % index == 0 && number1 % index == 0) {
						number2 /= index;
						number1 /= index;
						total *= index;
						break;
					}
				}
				if (index > number2) {
					break;
				}
			}
		} else {
			while (true) {
				int index = 2;
				for (index = 2; index <= number1; index++) {
					if (number2 % index == 0 && number1 % index == 0) {
						number2 /= index;
						number1 /= index;
						total *= index;
						break;
					}
				}
				if (index > number1) {
					break;
				}
			}
		}
		return total;
	}
}
