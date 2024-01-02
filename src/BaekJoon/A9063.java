package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9063 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int repeat = Integer.parseInt(st.nextToken());
		int[] x = new int[repeat];
		int[] y = new int[repeat];
		st = new StringTokenizer(bf.readLine());
		x[0] = Integer.parseInt(st.nextToken());
		y[0] = Integer.parseInt(st.nextToken());
		int maxX = x[0];
		int minX = x[0];
		int maxY = y[0];
		int minY = y[0];

		for (int index = 1; index < repeat; index++) {
			st = new StringTokenizer(bf.readLine());
			x[index] = Integer.parseInt(st.nextToken());
			y[index] = Integer.parseInt(st.nextToken());
			if (maxX < x[index]) {
				maxX = x[index];
			} else if (minX > x[index]) {
				minX = x[index];
			}
			if (maxY < y[index]) {
				maxY = y[index];
			} else if (minY > y[index]) {
				minY = y[index];
			}
		}
		System.out.println((maxX - minX) * (maxY - minY));
	}
}
