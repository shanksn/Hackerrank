import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    static String timeConversion(String s) {
        StringTokenizer token = new StringTokenizer(s,":");
        int hour = 0;
        String[] hourArr = new String[3];
        int i = 0;
        while(token.hasMoreTokens()) {
            hourArr[i] = token.nextToken();
            i++;
        }

        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < hourArr.length ; j++) {
            if(hourArr[j].contains("AM")) {
                hourArr[j] = hourArr[j].substring(0,2);
                if (Integer.valueOf(hourArr[0]) == 12) {
                    hourArr[0] = "00";
                }
                for (int k = 0; k < hourArr.length; k++) {
                    builder.append(hourArr[k]);
                    builder.append(":");
                }
            } else if (hourArr[j].contains("PM")) {
                hourArr[j] = hourArr[j].substring(0,2);
                if (Integer.valueOf(hourArr[0]) == 12) {
                    hour = 12;
                } else {
                    hour = Integer.valueOf(hourArr[0]) + 12;
                }
                builder.append(String.valueOf(hour)+":");
                for (int k = 1; k < hourArr.length; k++) {
                    builder.append(hourArr[k]);
                    builder.append(":");
                }
            }
        }
        String finalStr = builder.toString();
        return finalStr.substring(0,finalStr.length()-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
