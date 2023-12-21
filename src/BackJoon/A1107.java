package BackJoon;

import java.util.Scanner;

public class A1107 {
    public static void main(String[] args) {
        //미완

        Scanner sc = new Scanner(System.in);
        int presentChannel = 100;
        String inputChannelString = sc.nextLine();
        int inputChannel = Integer.parseInt(inputChannelString);
        int tmp = inputChannel;
        int inputChannelLength = (int) Math.log10(inputChannel) + 1;
        int count = 0;
        int minCount = 0;
        if (presentChannel - inputChannel > 0) {
            minCount = presentChannel - inputChannel;
        } else {
            minCount = inputChannel - presentChannel;
        }
        int[] inputChannelArray = new int[inputChannel];
        int brokenButtonCount = sc.nextInt();
        int[] brokenButtons = new int[brokenButtonCount];
        for (int i = 0; i < brokenButtonCount; i++) {
            brokenButtons[i] = sc.nextInt();
        }
        int arrayCount = 0;
        int[] upMin = new int[inputChannelLength];
        int[] downMin = new int[inputChannelLength];
        for (int i = 0; i < inputChannelLength; i++) {
            inputChannelArray[i] = inputChannelString.charAt(i);
            upMin[i] = inputChannelString.charAt(i);
            downMin[i] = inputChannelString.charAt(i);
        }
        for (int i = 0; i < inputChannelLength; i++) {
            for (int j = 0; j < brokenButtonCount; j++) {
                if (upMin[i] == brokenButtons[j]) {
                    upMin[i]--;
                    j = 0;
                    if (upMin[i] == 0) {
                        break;
                    }
                }
            }
            if (upMin[i] == 0) {
                break;
            }
        }

    }
}
