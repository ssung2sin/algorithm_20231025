package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class A25192 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> members = new HashSet<>();
		int repeat = Integer.parseInt(br.readLine());
		int emoticon = 0;
		int count = 0;
		for (int index = 0; index < repeat; index++) {
			String name = br.readLine();
			if (name.equals("ENTER")) {
				count = 0;
				members.clear();
			} else {
				count++;
				members.add(name);
				if (members.size() != count) {
					count--;
				} else {
					emoticon++;
				}
			}
		}
		System.out.println(emoticon);
	}
}
