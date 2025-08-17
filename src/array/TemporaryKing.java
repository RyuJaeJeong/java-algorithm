package array;

import java.util.Scanner;

public class TemporaryKing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [][] arr = new int[len][5];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        TemporaryKing temporaryKing = new TemporaryKing();
        System.out.println(temporaryKing.solution(len, arr));
    }

    public int solution(int len, int[][] arr){
        int[] cnt = new int[len];
        for (int i = 0; i < len; i++) {
            int[] temp = new int[len];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < len; k++) {
                    if(k==i) continue;
                    if(arr[i][j] == arr[k][j]){
                        temp[k]++;
                    }
                }
            }
            for (int j = 0; j < len; j++) {
                if(temp[j] != 0) cnt[i]++;
            }
        }
        int maxValue = cnt[0];
        int maxIndex = 0;
        for (int i = 1; i < len; i++) {
            if(maxValue < cnt[i]){
                maxValue = cnt[i];
                maxIndex = i;
            }
        }
        return maxIndex+1;
    }
}
