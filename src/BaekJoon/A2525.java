package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int timer = Integer.parseInt(st.nextToken());
		int addMinute = minute + timer;

		if (addMinute >= 60) {
			while (addMinute >= 60) {
				addMinute -= 60;
				hour++;
				if (hour == 24) {
					hour = 0;
				}
			}
		}
		System.out.println(hour + " " + addMinute);

	}
}
