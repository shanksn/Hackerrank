import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int num) {
        for(int j=0;j<num;j++){
            for(int i=1;i<=num;i++){
                System.out.print(i<num-j?" ":"#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}

