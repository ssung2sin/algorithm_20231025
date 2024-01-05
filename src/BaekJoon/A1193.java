package BaekJoon;

import java.util.Scanner;

public class A1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int index = 2;
		while (true) {
			index++;
			if (number == 1) {
				System.out.println("1/1");
				break;
			}
			if (number > (index - 2) * (index - 1) / 2 && number <= (index - 1) * index / 2) {
				number -= (index - 2) * (index - 1) / 2;
				if (index % 2 == 1) {
					System.out.println(number + "/" + (index - number));
				} else {
					System.out.println((index - number) + "/" + number);
				}
				break;
			}
		}
	}
}
