package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10798 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int maxlength = 0;
		String[] text = new String[5];
		for (int index = 0; index < 5; index++) {
			text[index] = bf.readLine();
			if (maxlength < text[index].length()) {
				maxlength = text[index].length();
			}
		}
		String[][] array = new String[maxlength][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < maxlength; j++) {
				if (j == text[i].length()) {
					break;
				}
				String word = String.valueOf(text[i].charAt(j));
				array[j][i] = word;
			}
		}

		for (int i = 0; i < maxlength; i++) {
			for (int j = 0; j < 5; j++) {
				if (array[i][j] == null) {
					continue;
				}
				System.out.print(array[i][j]);
			}
		}
	}
}
