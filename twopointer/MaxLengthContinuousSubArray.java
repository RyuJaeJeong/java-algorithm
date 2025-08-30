package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxLengthContinuousSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] temp = scanner.nextLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
        int[] arr = new int[N];
        int idx = 0;
        while(tokenizer.hasMoreTokens()){
            arr[idx++] = Integer.parseInt(tokenizer.nextToken());
        }
        MaxLengthContinuousSubArray continuousSubArray = new MaxLengthContinuousSubArray();
        System.out.println(continuousSubArray.solution2(N, M, arr));
    }

    /**
     * 배열을 순회 하며 1이 연속되는 최대 길이의 연속 부분 순열을 반환
     * @param N 배열의 길이
     * @param M 횟수
     * @param arr 배열
     * @return
     */
    public int solution(int N, int M, int[] arr){
        int answer = 0;
        int rt = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int lt = 0; lt < N-1; lt++) {
            if(arr[lt] == 0) continue;
            temp.add(1);
            int cnt = M;
            rt = lt;
            while(rt < N-1){
                rt++;
                if(arr[rt] == 1){
                    temp.add(1);
                }else if(arr[rt] == 0 && cnt > 0){
                    cnt--;
                    temp.add(1);
                }else if(arr[rt] == 0){
                    break;
                }
            }
            if(answer < temp.size()){
                answer = temp.size();
            }
            temp = new ArrayList<Integer>();
        }
        return answer;
    }

    public int solution2(int N, int M, int[] arr){
        int lt = 0, answer=0, cnt=0;
        for (int rt = 0; rt < N; rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > M){
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

}
