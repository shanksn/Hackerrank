import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        // s and t are ranges
        //a and b are the distances
        int appleSum = 0;
        for (int i=0;i<apples.length;i++) {
            int range = a+apples[i];
            if (range >= s && range <= t) {
                appleSum++;
            }
            range = 0;
        }

        int orangeSum = 0;
        for (int i=0;i<oranges.length;i++) {
            int range = b+oranges[i];
            if (range >= s && range <= t) {
                orangeSum++;
            }
            range = 0;
        }

        System.out.println(appleSum+" "+orangeSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

}
