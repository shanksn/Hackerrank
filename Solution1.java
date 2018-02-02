import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution1 {

    static void miniMaxSum(long[] arr) {
        long max = 0;
        long min = 0;
        long tempMax = 0;
        long tempMin = 0;

        long sum1 = arr[0]+ arr[1]+ arr[2]+ arr[3];
        long sum2 = arr[0]+ arr[2]+ arr[3]+ arr[4];
        long sum3 = arr[1]+ arr[2]+ arr[3]+ arr[4];
        long sum4 = arr[0]+ arr[1]+ arr[3]+ arr[4];
        long sum5 = arr[0]+ arr[1]+ arr[2]+ arr[4];

        long[] arrInt = new long[] {sum1,sum2,sum3,sum4,sum5};

        tempMax = arrInt[0];
        tempMin = arrInt[0];

        for(int i=1;i<arrInt.length;i++) {
            if (arrInt[i] > tempMax ) {
                 tempMax = arrInt[i];
            }

            if (arrInt[i] < tempMin) {
                tempMin = arrInt[i];
            }
        }

        System.out.println(tempMin+" "+tempMax);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        miniMaxSum(arr);
        in.close();
    }

}
