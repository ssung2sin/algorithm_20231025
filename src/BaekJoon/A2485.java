package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int treeCount = Integer.parseInt(br.readLine());
		int[] tree = new int[treeCount];
		int[] distance = new int[treeCount - 1];

		for (int i = 0; i < treeCount; i++) {
			tree[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < treeCount - 1; i++) {
			distance[i] = tree[i + 1] - tree[i];
		}

		int result = distance[0];

		for (int i = 1; i < distance.length; i++) {
			result = getGCD(result, distance[i]);
		}
		System.out.println(calculationTreeCount(distance, result));
	}

	private static int getGCD(int result, int distance) {
		if (distance % result == 0) {
			return result;
		}
		distance %= result;
		return getGCD(distance, result);
	}

	private static int calculationTreeCount(int[] distance, int result) {
		int total = 0;
		for (int i = 0; i < distance.length; i++) {
			total += (distance[i] / result) - 1;
		}
		return total;
	}
}
