package array;

import java.util.Arrays;
import java.util.Scanner;

public class RankingCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] sortedArr = Arrays.copyOf(arr, len);
        Arrays.sort(sortedArr);
        int[] reverseArr = new int[len];
        int idx = 0;
        for (int i = len-1; i >= 0; i--) {
            reverseArr[idx++] = sortedArr[i];
        }
        for (int i = 0; i < len; i++) {
            int num = arr[i];
            for (int j = 0; j < len; j++) {
                if(num == reverseArr[j]){
                    System.out.print(j+1);
                    if(i != len-1) System.out.print(" ");
                    break;
                }
            }
        }
    }



}
