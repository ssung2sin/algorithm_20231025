package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());

		for (int index = 0; index < repeat; index++) {
			String parenthesisString = br.readLine();
			System.out.println(validPS(parenthesisString));
		}
	}

	private static String validPS(String parenthesisString) {
		int result = 0;
		for (int index = 0; index < parenthesisString.length(); index++) {
			if (parenthesisString.charAt(index) == '(') {
				result++;
			} else if (parenthesisString.charAt(index) == ')') {
				result--;
			}

			if (result < 0) {
				return "NO";
			}
		}
		if (result == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
