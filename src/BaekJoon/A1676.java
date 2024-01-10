package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class A1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		BigInteger bigNumber = factorial(number);

		String toStringNumber = bigNumber.toString();

		int count = 0;
		for (int i = toStringNumber.length() - 1; i >= 0; i--) {
			if (toStringNumber.charAt(i) == '0') {
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);

	}

	private static BigInteger factorial(int number) {
		if (number == 0) {
			return new BigInteger("1");
		}
		BigInteger num = new BigInteger(String.valueOf(number));
		if (number == 1) {
			return num;
		}
		return num.multiply(factorial(number - 1));
	}
}
