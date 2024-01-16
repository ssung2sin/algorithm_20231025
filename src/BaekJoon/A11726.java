package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class A11726 {

	//시간초과
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrayY = Integer.parseInt(br.readLine());
		int[][] squareArray = new int[2][arrayY];

		fillSquare(0, squareArray);

		System.out.println(squareArray[0][arrayY - 1]);
	}

	private static void fillSquare(int startY, int[][] squareArray) {
		if (startY < squareArray[0].length - 1) {
			fillHeightSquare(startY, squareArray);
			fillWidthSquare(startY, squareArray);

		} else if (startY == squareArray[0].length - 1) {
			fillHeightSquare(startY, squareArray);
		}
	}

	private static void fillHeightSquare(int startY, int[][] squareArray) {
		squareArray[0][startY]++;
		squareArray[1][startY]++;
		startY++;
		fillSquare(startY, squareArray);
	}

	private static void fillWidthSquare(int startY, int[][] squareArray) {
		squareArray[0][startY]++;
		squareArray[1][startY]++;
		squareArray[0][startY + 1]++;
		squareArray[1][startY + 1]++;
		startY += 2;
		fillSquare(startY, squareArray);
	}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayY = sc.nextInt();
		BigInteger total = BigInteger.ZERO;
		int count = 0;

		while (count <= arrayY - count) {
			if (count == 0) {
				total = BigInteger.ONE;
			} else {
				total = total.add(combination(arrayY - count, count));
			}
			count++;
		}
		total = total.mod(new BigInteger("10007"));
		System.out.println(total);

	}

	private static BigInteger combination(int first, int last) {
		BigInteger tot = BigInteger.ONE;
		for (int index = 0; index < last; index++) {
			tot = tot.multiply(BigInteger.valueOf(first - index));
			tot = tot.divide(BigInteger.valueOf(1 + index));
		}
		return tot;
	}
}
