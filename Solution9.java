import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution9 {

    static int[] breakingRecords(int[] score) {
        int[] scores = new int[2];
        int lowScore = score[0];
        int highScore = score[0];
        int countHigh = 0;
        int countLow = 0;

        for (int i = 0; i < score.length ; i++) {
            if(highScore < score[i]) {
                countHigh++;
                highScore = score[i];
            }
            if (lowScore > score[i]) {
                countLow++;
                lowScore = score[i];
            }

        }
        scores[0] = countHigh;
        scores[1] = countLow;

        return scores;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
