package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int inputCount = Integer.parseInt(st.nextToken());
		int[] divisor = new int[inputCount];
		st = new StringTokenizer(br.readLine());
		for (int index = 0; index < inputCount; index++) {
			divisor[index] = Integer.parseInt(st.nextToken());
		}
		if (inputCount == 1) {
			System.out.println(divisor[0] * divisor[0]);
		} else {
			System.out.println(calculationNumber(divisor));
		}
	}

	private static int calculationNumber(int[] divisor) {
		Arrays.sort(divisor);
		return divisor[0] * divisor[divisor.length - 1];
	}
}
