package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A23971 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tableX = Integer.parseInt(st.nextToken());
		int tableY = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		int resultX = (tableX - 1) / (width + 1) + 1;
		int resultY = (tableY - 1) / (length + 1) + 1;
		System.out.println(resultX * resultY);
	}
}
