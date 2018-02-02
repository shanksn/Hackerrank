import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {

    static int solve(int n, int[] s, int d, int m){
        //m total consecutive squares
        //d is the total digits the squares should sum up to
        //1 2 1 3 1
        //3 2
        int total = 0;
        int count = 0;
        int choc = 0;
        int iteration = 0;
        for (int i = 0; i < s.length ; i++) {
            count++;
            total+=s[i];
            if (m == count) {
                iteration++;
                if (total == d) choc++;
                count = 0;
                total = 0;
                if (iteration + m <= s.length) {
                    i = iteration-1;
                } else {
                    break;
                }
            }

        }

        return choc;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }

}
