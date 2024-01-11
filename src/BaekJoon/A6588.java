package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A6588 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] primeNumber = new int[10000001];
		checkPrimeNumber(primeNumber);
		while (true) {
			st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			if (number == 0) {
				break;
			}
			sb.append(printGoldbach(number, primeNumber));
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static void checkPrimeNumber(int[] number) {
		for (int i = 2; i < number.length; i++) {
			int x = i;
			if (number[i] == 1) {
				continue;
			}
			if (number[i] == 0) {
				x += i;
				while (x < number.length) {
					number[x] = 1;
					x += i;
				}
			}
		}
	}

	private static String printGoldbach(int number, int[] primeNumbers) {
		int numberA = 0;
		int numberB = 0;
		boolean flag = true;
		int lastNumber = number;
		for (int index1 = 2; index1 <= lastNumber; index1++) {
			if (primeNumbers[index1] == 0) {
				flag = false;
				numberA = index1;
				for (int index2 = number - 1; index2 >= index1; index2--) {
					if (primeNumbers[index2] == 0) {
						numberB = index2;
						if (!flag) {
							lastNumber = numberB;
							flag = true;
						}
						if (numberA + numberB < number) {
							break;
						}
						if (numberA + numberB == number) {
							return number + " = " + numberA + " + " + numberB;
						}
					}
				}
			}
		}
		return "Goldbach's conjecture is wrong.";

	}
}
