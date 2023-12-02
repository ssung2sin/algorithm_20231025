import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //미완
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] orders = new int[n * 2];
        for (int i = 0; i < orders.length; i++) {
            orders[i] = sc.nextInt();
        }
        solution(n, orders);
    }

    public static void solution(int n, int[] orders) {
        long answer = 0;
        int cnt = 0;
        int div = 1000000000;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < orders.length; i++) {
            boolean flag = false;
            for (int value : deque) {
                flag = false;
                if (value == orders[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                deque.offer(orders[i]);
                deque.offer(orders[i]);
            }
        }
        for (int i = 0; i < deque.size(); i++) {
            int[] temp = new int[n * 2];
            int count = 0;
            for (int value : deque) {
                if (value == orders[i]) {
                    deque.poll();
                    if (count == 0) {
                        break;
                    }
                    if (count != 0) {
                        for (int j = count - 1; j >= 0; j--) {
                            deque.addFirst(temp[count - 1]);
                        }
                        break;
                    }
                }
                if (value != orders[i]) {
                    temp[count++] = value;
                    cnt++;
                    deque.poll();
                }
            }
        }

        System.out.println(cnt);
    }
}
