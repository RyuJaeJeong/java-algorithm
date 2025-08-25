package twopointer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ContinuousNaturalNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();
        ContinuousNaturalNumber obj = new ContinuousNaturalNumber();
        System.out.println(obj.getCount2(targetNumber));
    }

    /**
     * 연속된 자연수의 합이 목표정수가 되는 조합의 갯수
     * @param targetNumber 목표 정수
     * @return 조합의 갯수
     */
    public int getCount(int targetNumber){
        int[] arr = new int[targetNumber];
        for (int i = 0; i < targetNumber; i++) {
            arr[i]= i+1;
        }
        int lt = 0, rt = 1;
        int sum = 0;
        int answer = 0;
        while(lt < targetNumber-1){
            if(rt == lt + 1){
                sum = arr[lt] + arr[rt++];
            }else{
                sum+=arr[rt++];
            }

            if(sum == targetNumber){
                answer++;
                lt++;
                rt = lt+1;
            }else if(sum > targetNumber){
                lt++;
                rt = lt+1;
            }
        }
        return answer;
    }

    /**
     * 연속된 자연수의 합이 N이 된다? >>> 포인터가 targetNumber / 2  + 1 까지만 해보면 된다.
     * @param targetNumber
     * @return
     */
    public int getCount2(int targetNumber){
        int[] arr = IntStream.range(1, targetNumber+1).toArray();
        int lt = 0, rt = 1;
        int sum = 0;
        int answer = 0;
        while(lt < targetNumber / 2 + 1){
            if(rt == lt + 1){
                sum = arr[lt] + arr[rt++];
            }else{
                sum+=arr[rt++];
            }

            if(sum == targetNumber){
                answer++;
                lt++;
                rt = lt+1;
            }else if(sum > targetNumber){
                lt++;
                rt = lt+1;
            }
        }
        return answer;
    }

}
