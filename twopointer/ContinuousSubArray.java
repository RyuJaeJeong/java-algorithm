package twopointer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ContinuousSubArray {
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
        ContinuousSubArray continuousSubArray = new ContinuousSubArray();
        System.out.println(continuousSubArray.solution(N, M, arr));
    }

    /**
     * 배열을 순회 하며 M이되는 부분순열의 갯수를 반환
     * @param N 배열의 길이
     * @param M 특정 숫자
     * @param arr 배열
     * @return M이 되는 부분 순열의 갯수
     */
    public int solution(int N, int M, int[] arr){
        int answer = 0;
        int lt=0;
        int rt = lt +1;
        int sum = 0;
        while(lt < N-1){
            if(rt == lt + 1){
                sum = Arrays.stream(Arrays.copyOfRange(arr, lt, rt+1)).sum();
            }else{
                sum = sum + arr[rt];
            }

            if(sum == M){
                answer++;
                lt++;
                rt = lt + 1;
                continue;
            }else if(sum > M){
                lt++;
                rt = lt + 1;
                continue;
            }

            if(rt == N-1){
                lt++;
                rt = lt +1;
            }else{
                rt++;
            }

        }

        return answer;
    }

    public static int sum(int [] arr){
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }


}
