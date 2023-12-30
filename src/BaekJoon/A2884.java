package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2884 {
	public static void main(String[] args) throws IOException {
		int H, M;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		H = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		if (H == 0 && M < 45) {
			System.out.println("23 " + (60 - (45 - M)));
		} else if (H != 0 && M < 45) {
			System.out.println(H - 1 + " " + (60 - (45 - M)));
		} else {
			System.out.println(H + " " + (M - 45));
		}

	}
}
