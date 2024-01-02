package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(bf.readLine());
			List<Integer> divisor = new ArrayList<>();
			divisor.add(1);
			int number = Integer.parseInt(st.nextToken());
			if (number == -1) {
				break;
			} else {
				for (int i = 2; i < number; i++) {
					if (number % i == 0) {
						divisor.add(i);
					}
				}
			}
			int tot = 0;
			for (int i = 0; i < divisor.size(); i++) {
				tot += divisor.get(i);
			}
			if (number == tot) {
				System.out.print(number + " = ");
				for (int i = 0; i < divisor.size(); i++) {
					if (i == divisor.size() - 1) {
						System.out.println(divisor.get(i));
					} else {
						System.out.print(divisor.get(i) + " + ");
					}
				}
			} else {
				System.out.println(number + " is NOT perfect.");
			}

		}
	}
}
