import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {
    static int[] solve(int[] grades){
        int[] rounded = new int[grades.length];
        for (int i=0;i<grades.length;i++) {
            if (grades[i] < 38) {
                rounded[i] = grades[i];
            } else if (grades[i]%5 == 0) {
                    rounded[i] = grades[i];
            }
             else if (grades[i]%5 == 2 || grades[i]%5 == 1 ) {
                rounded[i] = grades[i];
            } else if (grades[i]%5 == 3) {
                rounded[i] = grades[i]+2;
            } else if (grades[i]%5 == 4) {
                rounded[i] = grades[i] + 1;
            }
        }

        return rounded;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }

}
