import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int []cnt=new int[word.length()];
        char[] c=new char[word.length()];
        for(int i=0;i<word.length();i++) {
            c[i]=word.charAt(i);
            if(c[i]>='a'){
                c[i]-=32;
            }
        }
        for(int i=0;i<word.length();i++){
            cnt[i]=1;
            for(int j=i+1;j<word.length();j++) {
                if (c[i] == c[j]) {
                    cnt[i]++;
                }
            }
        }
        int maxNum=0;
        int maxint=0;
        for(int i=0;i<word.length();i++){
            if(maxNum<cnt[i]){
                maxNum=cnt[i];
                maxint=i;
            }
        }
        int duplicateMaxNum=0;
        for(int i=0;i<word.length();i++){
            if(maxNum==cnt[i]){
                duplicateMaxNum++;
            }
        }
        if(duplicateMaxNum>1){
            System.out.println("?");
        }else {
            System.out.println(c[maxint]);
        }
    }
}
