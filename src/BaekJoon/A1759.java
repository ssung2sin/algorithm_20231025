package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1759 {
	private static int password;
	private static int alphabetCount;
	private static String[] alphabet;
	static String[] printPassword;
	private static boolean[] visit;
	private static StringBuilder sb;
	private static int[] lastIndex;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		password = Integer.parseInt(st.nextToken());
		alphabetCount = Integer.parseInt(st.nextToken());
		alphabet = new String[alphabetCount];
		visit = new boolean[alphabetCount];
		printPassword = new String[alphabetCount];
		lastIndex = new int[alphabetCount];
		alphabet = br.readLine().split(" ");
		Arrays.sort(alphabet);

		backTrackingPassword(0);
		System.out.println(sb);
	}

	private static void backTrackingPassword(int depth) {
		if (depth < password) {
			for (int i = 0; i < alphabetCount; i++) {
				if (!visit[i]) {
					if (depth == 0) {
						lastIndex[depth] = i;
					} else if (lastIndex[depth - 1] > i) {
						continue;
					}
					visit[i] = true;
					lastIndex[depth] = i;
					printPassword[depth] = alphabet[i];
					backTrackingPassword(depth + 1);
					visit[i] = false;
				}
			}
		} else if (depth == password) {
			int vowelsCount = 0;
			int consonantsCount = 0;
			for (int i = 0; i < password; i++) {
				if (printPassword[i].equals("a") || printPassword[i].equals("e") || printPassword[i].equals("i")
					|| printPassword[i].equals("o") || printPassword[i].equals("u")) {
					vowelsCount++;
				} else {
					consonantsCount++;
				}
			}
			if (vowelsCount != 0 && consonantsCount >= 2) {
				for (int i = 0; i < password; i++) {
					sb.append(printPassword[i]);
				}
				sb.append("\n");
			}
		}
	}
}
