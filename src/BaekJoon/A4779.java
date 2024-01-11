package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A4779 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while ((input = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			int number = Integer.parseInt(input);
			int nSquared3 = 1;
			for (int i = 0; i < number; i++) {
				nSquared3 *= 3;
			}

			char[] dash = new char[nSquared3];
			Arrays.fill(dash, '-');

			sortDash(dash, 0, dash.length - 1);
			for (int i = 0; i < dash.length; i++) {
				sb.append(dash[i]);
			}
			System.out.println(sb);
		}
	}

	private static void sortDash(char[] dash, int start, int end) {
		if (end - start > 0) {
			end++;
			int reEnd = (end - start) / 3;
			for (int index = reEnd + start; index < start + (reEnd * 2); index++) {
				dash[index] = ' ';
			}
			sortDash(dash, start, start + reEnd - 1);
			sortDash(dash, start + (reEnd * 2), end - 1);
		}
	}
}
