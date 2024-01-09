package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int totalCount = Integer.parseInt(st.nextToken());
		int inputCount = Integer.parseInt(st.nextToken());
		int count = 1;
		List<Integer> deque = new ArrayList<>();
		while (count <= totalCount) {
			deque.add(count);
			count++;
		}

		int result = 0;
		st = new StringTokenizer(br.readLine());
		for (int index = 0; index < inputCount; index++) {
			int pickNumber = Integer.parseInt(st.nextToken());
			int numberIndex = 0;
			for (int idx = 0; idx < deque.size(); idx++) {
				if (pickNumber == deque.get(idx)) {
					numberIndex = idx;
					break;
				}
			}

			if ((deque.size() - numberIndex) > numberIndex) {
				for (int idx = 0; idx < numberIndex; idx++) {
					int number = deque.remove(0);
					deque.add(number);
					result++;
				}
			} else {
				for (int idx = 0; idx < deque.size() - numberIndex; idx++) {
					int number = deque.remove(deque.size() - 1);
					deque.add(0, number);
					result++;
				}
			}
			deque.remove(0);
		}

		System.out.println(result);
	}
}
