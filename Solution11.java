import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution11 {

    static int divisibleSumPairs(int n, int k, int[] ar) {
//        6 3
//        1 3 2 6 1 2
        int divisible = 0;
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {

            for (int j = i + 1; j < ar.length; j++) {
                sum = ar[i] + ar[j];

                if (sum % k == 0) {
                    divisible++;

                }
                sum = 0;

            }


        }
        return divisible;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

}
