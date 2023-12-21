package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String text = bf.readLine();
        String[] splitText = text.split(" ");
        if (text.trim().isEmpty()) {
            System.out.println(0);
        } else if (splitText[0].isEmpty()) {
            System.out.println(splitText.length - 1);

        } else if (!splitText[0].isEmpty()) {
            System.out.println(splitText.length);
        }
    }
}
