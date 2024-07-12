package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//좌표 정렬하기
public class A11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testCase = Integer.parseInt(br.readLine());

		int[][] coordinate = new int[testCase][2];
		for (int index = 0; index < testCase; index++) {
			st = new StringTokenizer(br.readLine());
			coordinate[index][0] = Integer.parseInt(st.nextToken());
			coordinate[index][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(coordinate, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				//여기서 e1[1]이 e2[1] 보다 크면 양수기 때문에 e1[1]와 e2[1]을 바꿔준다!
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});

		for (int index = 0; index < testCase; index++) {
			System.out.println(coordinate[index][0] + " " + coordinate[index][1]);
		}
	}
}
