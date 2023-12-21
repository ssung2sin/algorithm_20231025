package BackJoon;

import java.util.Scanner;

public class A1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] input = new int[a][3];
        int[][] cheapestCost = new int[a][3];

        for (int i = 0; i < a; i++) {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
            input[i][2] = sc.nextInt();
        }
        cheapestCost[0][0] = input[0][0];
        cheapestCost[0][1] = input[0][1];
        cheapestCost[0][2] = input[0][2];
        for (int i = 1; i < a; i++) {
            cheapestCost[i][0] = 0;
            cheapestCost[i][1] = 0;
            cheapestCost[i][2] = 0;
        }

        for (int i = 1; i < a; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == k) {
                        continue;
                    } else {
                        int cheap = cheapestCost[i - 1][j] + input[i][k];
                        if (cheapestCost[i][k] == 0) {
                            cheapestCost[i][k] = cheap;
                        } else {
                            if (cheap < cheapestCost[i][k]) {
                                cheapestCost[i][k] = cheap;
                            }
                        }
                    }
                }
            }
        }
        int rowCost = 0;
        for (int i = 0; i < 3; i++) {
            if (rowCost == 0) {
                rowCost = cheapestCost[a - 1][i];
            } else {
                if (cheapestCost[a - 1][i] < rowCost) {
                    rowCost = cheapestCost[a - 1][i];
                }
            }
        }
        System.out.println(rowCost);
    }
}
