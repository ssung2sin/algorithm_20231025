package BaekJoon;

import java.util.Scanner;

public class A10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int result = 0;

		result = checkText(text);

		System.out.println(result);
	}

	private static int checkText(String text) {
		int repeat = text.length() / 2;
		for (int index = 0; index < repeat; index++) {
			if (text.charAt(index) != text.charAt(text.length() - (1 + index))) {
				return 0;
			}
		}
		return 1;
	}

}
