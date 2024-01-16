package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11727 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int[] result;
		if (number == 1) {
			result = new int[4];
		} else {
			result = new int[number + 1];
		}
		result[1] = 1;
		result[2] = 3;
		if (number > 2) {
			for (int index = 3; index < result.length; index++) {
				result[index] = (result[index - 2] * 2 + result[index - 1]) % 10007;

			}
		}
		System.out.println(result[number]);
	}
}
