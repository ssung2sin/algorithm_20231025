package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10810 {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(bf.readLine());

		int[] box = new int[Integer.parseInt(st.nextToken())];
		int repeat = Integer.parseInt(st.nextToken());

		for (int index = 0; index < repeat; index++) {
			inputBall(box);
		}

		printBox(box);
	}

	private static void inputBall(int[] box) throws IOException {
		st = new StringTokenizer(bf.readLine());
		int startNumber = Integer.parseInt(st.nextToken());
		int endNumber = Integer.parseInt(st.nextToken());
		int ballNumber = Integer.parseInt(st.nextToken());
		for (int index = startNumber - 1; index <= endNumber - 1; index++) {
			box[index] = ballNumber;
		}
	}

	private static void printBox(int[] box) {
		for (int i : box) {
			System.out.print(i + " ");
		}
	}
}
