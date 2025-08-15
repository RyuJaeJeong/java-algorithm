package array;

import java.util.Scanner;

public class MostHighMountain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [][] arr = new int[len+2][len+2];
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        MostHighMountain mountain = new MostHighMountain();
        int cnt = mountain.solution(len, arr);
        System.out.println(cnt);
    }

    /**
     * 5
     * (5) 3 (7) 2 (3)
     *  3 (7) 1 (6) 1
     * (7) 2  5  3 (4)  >>  10
     *  4  3 (6) 4  1
     * (8) 7  3 (5) 2
     * @param len 격자 길이
     * @param arr 배열
     * @return
     */
    public int solution(int len, int[][] arr){
        int answer = 0;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if(isMountain(arr, i, j)) answer++;
            }
        }
        return answer;
    }

    public static boolean isMountain(int[][] arr, int xPosition, int yPosition){
        int mountain = arr[xPosition][yPosition];
        int left = arr[xPosition-1][yPosition];
        int right = arr[xPosition+1][yPosition];
        int down = arr[xPosition][yPosition-1];
        int up = arr[xPosition][yPosition+1];
        boolean result = true;
        if(left >= mountain) return !result;
        else if(right >= mountain) return !result;
        else if(up >= mountain) return !result;
        else if(down >= mountain) return !result;
        else return result;
    }
}
