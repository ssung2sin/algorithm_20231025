package BaekJoon;

import java.util.Scanner;

public class A1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputCount = sc.nextInt();
		int count = 0;

		for (int i = 0; i < inputCount; i++) {
			int input = sc.nextInt();
			if (input == 1) {
				continue;
			} else if (input == 2) {

			} else {
				for (int j = 2; j < input; j++) {
					if (input % j == 0) {
						count--;
						break;
					}
				}
			}
			count++;
		}
		System.out.println(count);

	}
}
