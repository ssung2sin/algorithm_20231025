package BackJoon;

import java.util.Scanner;

public class A2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] result = new int[3];
        int multiple = 1;
        int tot = 0;
        for (int i = 0; i < 3; i++) {
            result[i] = a * (b % 10);
            b /= 10;
            System.out.println(result[i]);
            tot += result[i] * multiple;
            multiple *= 10;
        }
        System.out.println(tot);

    }
}
