package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int count = Integer.parseInt(st.nextToken());
		int[] number = new int[count];
		int result = Integer.parseInt(st.nextToken());
		int tot = 0;
		int[] sumNumber = new int[3];

		st = new StringTokenizer(bf.readLine());
		for (int index = 0; index < count; index++) {
			number[index] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(number);
		for (int i = 0; i < number.length - 2; i++) {
			sumNumber[0] = number[i];
			for (int j = i + 1; j < number.length - 1; j++) {
				sumNumber[1] = number[j];
				for (int k = j + 1; k < number.length; k++) {
					sumNumber[2] = number[k];
					int sum = sumNumber[0] + sumNumber[1] + sumNumber[2];
					if (sum > result) {
						break;
					}
					if (tot < sum) {
						tot = sum;
					}
				}

			}
		}

		System.out.println(tot);

	}
}
