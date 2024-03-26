package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			int flag = 0;
			int totEqual = 0;
			int[] side = new int[3];
			for (int i = 0; i < 3; i++) {
				side[i] = Integer.parseInt(st.nextToken());
				if (side[i] == 0) {
					flag++;
				}
			}
			if (flag == 3) {
				break;
			}
			for (int i = 0; i < 3; i++) {
				int equal = 0;
				for (int j = 0; j < 3; j++) {
					if (i != j) {
						if (side[i] == side[j]) {
							equal++;
						}
					}
				}
				if (totEqual < equal) {
					totEqual = equal;
				}
			}
			if (totEqual == 2) {
				System.out.println("Equilateral");
			} else {
				int maxSide = side[0];
				int maxNumber = 0;
				int totOtherSide = 0;
				for (int i = 1; i < 3; i++) {
					if (maxSide < side[i]) {
						maxSide = side[i];
						maxNumber = i;
					}
				}
				for (int i = 0; i < 3; i++) {
					if (i != maxNumber) {
						totOtherSide += side[i];
					}
				}
				if (maxSide >= totOtherSide) {
					System.out.println("Invalid");
				} else if (totEqual == 1) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			}
		}
	}
	//이 방법은 너무 복잡함 차라리 정렬을 하면 굳이 max를 설정하지 않아도 됨
	// 정렬하면 오히려 깔끔함.
}
