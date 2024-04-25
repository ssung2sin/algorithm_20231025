package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A11723 {
	static Set allSet = new HashSet();
	static Set set = new HashSet();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 20; i++) {
			allSet.add(i);
		}

		for (int continueNumber = 0; continueNumber < testCase; continueNumber++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String text = st.nextToken();
			checkText(text, st, sb);
		}
		System.out.println(sb);
	}

	private static void checkText(String text, StringTokenizer st, StringBuilder sb) {
		if (text.equals("add")) {
			int number = Integer.parseInt(st.nextToken());
			runAdd(number);

		} else if (text.equals("remove")) {
			int number = Integer.parseInt(st.nextToken());
			runRemove(number);

		} else if (text.equals("check")) {
			int number = Integer.parseInt(st.nextToken());
			runCheck(number, sb);

		} else if (text.equals("toggle")) {
			int number = Integer.parseInt(st.nextToken());
			runToggle(number);

		} else if (text.equals("all")) {
			runAll();

		} else if (text.equals("empty")) {
			runEmpty();
		}
	}

	private static void runAdd(int number) {
		set.add(number);
	}

	private static void runRemove(int number) {
		set.remove(number);
	}

	private static void runCheck(int number, StringBuilder sb) {
		if (set.remove(number)) {
			sb.append("1");
			sb.append("\n");
			set.add(number);
		} else {
			sb.append("0");
			sb.append("\n");
		}
	}

	private static void runToggle(int number) {
		if (!set.remove(number)) {
			set.add(number);
		} else {
			set.remove(number);
		}
	}

	private static void runAll() {
		set.addAll(allSet);
	}

	private static void runEmpty() {
		set = new HashSet();
	}

}
