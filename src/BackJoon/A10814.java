package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10814 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(bf.readLine());
        int repeat = Integer.parseInt(st.nextToken());
        int[] age = new int[repeat];
        String[] name = new String[repeat];
        repeatInput(age, name, repeat);
        printMessage(age, name);
    }

    private static void repeatInput(int[] age, String[] name, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            st = new StringTokenizer(bf.readLine());
            age[i] = Integer.parseInt(st.nextToken());
            name[i] = st.nextToken();
        }
        sortAge(age, name);
    }

    private static void sortAge(int[] age, String[] name) {
        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age.length - 1; j++) {
                if (age[j] > age[j + 1]) {
                    int temp = age[j];
                    age[j] = age[j + 1];
                    age[j + 1] = temp;
                    String textTemp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = textTemp;
                }
            }
        }
    }

    private static void printMessage(int[] age, String[] name) {
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i] + " " + name[i]);
        }
    }

}

