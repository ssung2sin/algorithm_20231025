package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int up, down, treeSize;

        up = Integer.parseInt(st.nextToken());
        down = Integer.parseInt(st.nextToken());
        treeSize = Integer.parseInt(st.nextToken());
        int day = (treeSize - up) / (up - down);
        int logic = (treeSize - up) % (up - down);
        if ((treeSize - up) % (up - down) == 0) {
            System.out.println(day + 1);
        } else {
            System.out.println(day + 2);
        }
    }
}
