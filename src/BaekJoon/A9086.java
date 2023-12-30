package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int repeatNumber = Integer.parseInt(st.nextToken());
		String[] text = new String[repeatNumber];
		for (int index = 0; index < repeatNumber; index++) {
			text[index] = bf.readLine();
		}
		for (int index = 0; index < repeatNumber; index++) {
			if (text[index].length() == 1) {
				System.out.println(text[index] + text[index]);
			}
			if (text[index].length() != 1) {
				System.out.println(text[index].charAt(0) + "" + text[index].charAt(text[index].length() - 1));
			}
		}
	}
}
