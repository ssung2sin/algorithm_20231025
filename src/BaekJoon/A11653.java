package BaekJoon;

import java.util.Scanner;

public class A11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		while (number >= 2) {
			for (int index = 2; index <= number; index++) {
				if (number % index == 0) {
					System.out.println(index);
					number /= index;
					break;
				}
			}
		}
	}
}
