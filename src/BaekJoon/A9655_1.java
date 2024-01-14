package BaekJoon;

import java.util.Scanner;

public class A9655_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int finalScore = sc.nextInt();

		if (finalScore % 2 != 0) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}

	}
}
