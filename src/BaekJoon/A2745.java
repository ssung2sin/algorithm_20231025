package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		String number = st.nextToken();
		int formation = Integer.parseInt(st.nextToken());
		long tot = 0;

		for (int index = number.length() - 1; index >= 0; index--) {
			int formattingNumber = number.charAt(index);
			if (formattingNumber >= 65) {
				formattingNumber -= 55;
			} else {
				formattingNumber -= 48;
			}
			long repeatNumber = formattingNumber;
			for (int repeat = 1; repeat < number.length() - index; repeat++) {
				repeatNumber *= formation;
			}
			tot += repeatNumber;
		}

		System.out.println(tot);
	}
}
