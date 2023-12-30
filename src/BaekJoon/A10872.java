package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int number = Integer.parseInt(st.nextToken());

		System.out.println(factorial(number));

	}

	private static int factorial(int number) {
		if (number <= 1) {
			return 1;
		}

		return number * factorial(number - 1);
	}
}
