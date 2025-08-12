package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointCalculator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] point_arr = new int[len];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < point_arr.length; i++) {
            point_arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(calPoint(point_arr));
    }

    public static int calPoint(int[] arr){
        int result = 0;
        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            point = (arr[i]==0)?0:point+arr[i];
            result += point;
        }
        return result;
    }
}
