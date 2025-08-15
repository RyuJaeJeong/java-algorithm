package array;

import java.util.Arrays;
import java.util.Scanner;

public class GridMaximumNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [][] arr = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        GridMaximumNum gridMaximumNum = new GridMaximumNum();
        int answer = gridMaximumNum.solution(len, arr);
        System.out.println(answer);
    }

    public int solution(int len, int[][] arr){
        int answer = 0;
        
        // 가로 합
        for (int i = 0; i < len; i++) {
            int sum = getSum(arr[i]);
            if(sum > answer) answer = sum;
        }
        
        // 새로 합
        for (int i = 0; i < len; i++) {
            int [] temp = new int[len];
            for (int j = 0; j < len; j++) {
                temp[j] = arr[j][i];
            }
            int sum = getSum(temp);
            if(sum > answer) answer = sum;
        }

        // 사선 합
        int [] temp = new int[len];
        for (int i = 0; i <len; i++) {
            temp[i] = arr[i][i];
        }
        int sum = getSum(temp);
        if(sum > answer) answer = sum;

        // 사선 합2
        for (int i = 0; i <len; i++) {
            temp[i] = arr[i][len-1-i];
        }
        sum = getSum(temp);
        if(sum > answer) answer = sum;

        return answer;
    }

    /**
     * 배열의 합을 반환 합니다.
     * @param arr 합을 구할 정수 배열
     * @return 배열의 합
     */
    public static int getSum(int[] arr){
        return Arrays.stream(arr).sum();
    }
}
