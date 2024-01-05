package BaekJoon;

import java.util.Scanner;

public class A2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();

		int five = sugar / 5;
		int three = 0;

		while (true) {
			if (five == -1) {
				System.out.println("-1");
				return;
			}
			int tempSugar = sugar - (five * 5);
			if (tempSugar == 0) {
				break;
			} else {
				three = tempSugar / 3;
				tempSugar = sugar - ((five * 5) + three * 3);
				if (tempSugar == 0) {
					break;
				}
			}
			five--;
			three = 0;

		}
		System.out.println(five + three);
	}
}
