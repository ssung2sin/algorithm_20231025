package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int earth = Integer.parseInt(st.nextToken());
		int sun = Integer.parseInt(st.nextToken());
		int moon = Integer.parseInt(st.nextToken());

		int compareEarth = 1, compareSun = 1, compareMoon = 1, count = 1;
		while (true) {
			if (compareEarth > 15) {
				compareEarth = 1;
			}
			if (compareSun > 28) {
				compareSun = 1;
			}
			if (compareMoon > 19) {
				compareMoon = 1;
			}
			if (earth == compareEarth) {
				if (sun == compareSun) {
					if (moon == compareMoon) {
						break;
					}
				}
			}
			compareEarth++;
			compareSun++;
			compareMoon++;
			count++;
		}
		System.out.println(count);
	}
}
