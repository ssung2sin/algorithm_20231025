package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		String inputNumber1 = st.nextToken();
		String inputNumber2 = st.nextToken();
		int convertNumber1 = Integer.parseInt(
			inputNumber1.charAt(2) + "" + inputNumber1.charAt(1) + "" + inputNumber1.charAt(0));
		int convertNumber2 = Integer.parseInt(
			inputNumber2.charAt(2) + "" + inputNumber2.charAt(1) + "" + inputNumber2.charAt(0));
		if (convertNumber1 > convertNumber2) {
			System.out.println(convertNumber1);
		} else {
			System.out.println(convertNumber2);
		}
	}
}
