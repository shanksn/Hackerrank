import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {

    static int getTotalX(int[] a, int[] b) {
        // Get the mod of first array and check if it divides the second array
        int numofFactors = 0;
        boolean aArr = false;
        boolean bArr = false;
        int inner = 0;
        for (int i = 1; i <= 100; i++) {
            inner = 0;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] == 0) {
                    inner++;
                }
            }
            if (inner == a.length) {
                inner = 0;
                for (int k = 0; k < b.length; k++) {
                    if (b[k] % i == 0) {
                        inner++;
                    }
                }

                if (inner == b.length) {
                    numofFactors++;
                }
            } else {
                inner = 0;
            }
        }


        return numofFactors;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }

}
