package BaekJoon;

import java.util.Scanner;

public class A11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		int total = 1;

		for (int index = 1; index <= numberB; index++) {
			total *= (numberA - index + 1);
			total /= index;
		}

		System.out.println(total);
	}
}
