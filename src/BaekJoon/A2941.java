package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2941 {
	static String[] croatianAlphabet = new String[8];
	static int[] count = new int[9];

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String text = st.nextToken();
		initCroatian();
		System.out.println(totResult(text));
	}

	private static void initCroatian() {
		croatianAlphabet[0] = "c=";
		croatianAlphabet[1] = "c-";
		croatianAlphabet[2] = "d-";
		croatianAlphabet[3] = "lj";
		croatianAlphabet[4] = "nj";
		croatianAlphabet[5] = "s=";
		croatianAlphabet[6] = "z=";
		croatianAlphabet[7] = "dz=";
	}

	private static int totResult(String text) {
		int index = 0;
		for (index = 0; index < text.length() - 1; index++) {
			if (index < text.length() - 2 && text.charAt(index) == 'd') {
				index += compareWordD(text, index);
			} else {
				index += compareTwoWord(text, index);
			}

		}

		return addCount(index, text);
	}

	private static int compareWordD(String text, int index) {
		if (text.substring(index, index + 3).equals(croatianAlphabet[7])) {
			count[7]++;
			return 2;
		} else if (text.substring(index, index + 2).equals(croatianAlphabet[2])) {
			count[2]++;
			return 1;
		}
		count[8]++;
		return 0;
	}

	private static int compareTwoWord(String text, int index) {
		StringBuilder twoWord = new StringBuilder();
		twoWord.append(text.charAt(index));
		twoWord.append(text.charAt(index + 1));
		for (int idx = 0; idx < croatianAlphabet.length; idx++) {
			if (twoWord.toString().equals(croatianAlphabet[idx])) {
				count[idx]++;
				return 1;
			}
		}
		count[8]++;
		return 0;
	}

	private static int addCount(int index, String text) {
		int tot = 1;
		if (index == text.length()) {
			tot = 0;
		}
		for (int idx = 0; idx < count.length; idx++) {
			tot += count[idx];
		}
		return tot;
	}
}
