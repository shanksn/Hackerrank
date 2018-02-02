import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        int k1 = x1+v1;
        int k2 = x2+v2;
        String doMeet = null;

        if (k1 == k2) {
            doMeet = "YES";
        } else {
            for (int i=0;i<40000;i++ ) {
                k1+=v1;
                k2+=v2;

                if (k1 == k2) {
                    doMeet = "YES";
                    break;
                }
            }
            if (k1 != k2) {
                doMeet = "NO";
            }

        }

        return doMeet;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

}
