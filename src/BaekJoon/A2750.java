package BaekJoon;

import java.util.Scanner;

public class A2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		int[] number = new int[repeat];

		for (int index = 0; index < repeat; index++) {
			number[index] = sc.nextInt();
		}
		for (int i = 0; i < repeat - 1; i++) {
			for (int j = i; j < repeat; j++) {
				if (number[i] > number[j]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}

		for (int index = 0; index < repeat; index++) {
			System.out.println(number[index]);
		}
	}
}
