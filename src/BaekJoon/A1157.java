package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		String word = st.nextToken();
		int[] cnt = new int[26];
		char c;
		for (int i = 0; i < word.length(); i++) {
			c = word.charAt(i);
			if (c >= 'a') {
				c -= 32;
			}
			cnt[c - 65]++;
		}
		int max = cnt[0];
		int maxIndex = 0;
		int dup = 0;
		for (int i = 1; i < cnt.length; i++) {
			if (max == cnt[i]) {
				dup++;
			}
			if (max < cnt[i]) {
				dup = 0;
				maxIndex = i;
				max = cnt[i];
			}
		}

		if (dup > 0) {
			System.out.println("?");
		} else {

			char a = (char)(maxIndex + 65);
			System.out.println(a);
		}
	}
}
