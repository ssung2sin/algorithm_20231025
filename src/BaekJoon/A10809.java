package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class A10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int[] alphabet = new int[26];
		initAlphabet(alphabet);
		for (int index = 0; index < text.length(); index++) {
			int idx = text.charAt(index) - 97;
			if (alphabet[idx] == -1) {
				alphabet[idx] = index;
			}
		}

		printAlphabet(alphabet);
	}

	private static void initAlphabet(int[] alphabet) {
		Arrays.fill(alphabet, -1);
	}

	private static void printAlphabet(int[] alphabet) {
		for (int index : alphabet) {
			System.out.print(index + " ");
		}
	}
}
