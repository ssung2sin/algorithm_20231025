package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A17087 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int brothers = Integer.parseInt(st.nextToken());
		int myPosition = Integer.parseInt(st.nextToken());
		int minPosition = 1000000000;
		int maxPosition = 0;
		int minIndex = 0;
		int minLocation = 1;

		List<Integer> brothersPosition = new ArrayList<>();
		if (brothers == 1) {
			int brotherPosition = Integer.parseInt(br.readLine());
			if (myPosition > brotherPosition) {
				brotherPosition = myPosition - brotherPosition;
			} else {
				brotherPosition = brotherPosition - myPosition;
			}
			System.out.println(brotherPosition);
			return;
		}

		st = new StringTokenizer(br.readLine());
		for (int index = 0; index < brothers; index++) {
			int position = Integer.parseInt(st.nextToken());
			if (myPosition > position) {
				brothersPosition.add(myPosition - position);
			} else {
				brothersPosition.add(position - myPosition);
			}

		}

		System.out.println(gcd(brothersPosition));
	}

	public static int gcd(List<Integer> brotherPosition) {
		int result = brotherPosition.get(0);
		for (int i = 1; i < brotherPosition.size(); i++) {
			result = gcd(result, brotherPosition.get(i));
		}
		return result;
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
