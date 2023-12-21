package BackJoon;

import java.util.Scanner;

public class A27433 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        long result = factorial(number);

        System.out.println(result);
    }

    private static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
