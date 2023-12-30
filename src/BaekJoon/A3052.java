package BaekJoon;

import java.util.Scanner;

public class A3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		int count = 0;
		int i = 0;
		int divNumber = 42;

		while (i < number.length) {
			int inputNumber = sc.nextInt();
			number[i] = inputNumber % divNumber;
			i++;
		}
		for (i = 1; i < number.length; i++) {
			for (int j = 0; j < i; j++) {
				if (i == j) {
					continue;
				}
				if (number[i] == number[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(10 - count);
	}
}
