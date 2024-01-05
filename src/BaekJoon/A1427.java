package BaekJoon;

import java.util.Scanner;

public class A1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String number = sc.nextLine();
		int result = Integer.parseInt(number);

		for (int first = 0; first < number.length() - 1; first++) {
			int max = number.charAt(first) - 48;
			int index = first;
			for (int second = first + 1; second < number.length(); second++) {
				if (max < number.charAt(second) - 48) {
					max = number.charAt(second) - 48;
					index = second;
				}
			}
			if (first == index) {
				continue;
			}
			result = 0;
			int tempIndex = 0;
			for (int idx = 0; idx < number.length(); idx++) {
				int digit = 1;
				for (int repeat = 0; repeat < number.length() - (idx + 1); repeat++) {
					digit *= 10;
				}
				if (idx == first) {
					result += digit * (number.charAt(index) - 48);
					tempIndex = idx;
				} else {
					if (idx == index) {
						result += digit * (number.charAt(tempIndex) - 48);
					} else {
						result += digit * (number.charAt(idx) - 48);
					}
				}
			}
			number = result + "";
		}

		System.out.println(result);
	}

}
