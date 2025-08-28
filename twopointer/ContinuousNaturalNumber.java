package twopointer;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ContinuousNaturalNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();
        ContinuousNaturalNumber obj = new ContinuousNaturalNumber();
        System.out.println(obj.getCount3(targetNumber));
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

    /**
     * 예를들어 연속된 자연수의 합이 15
     * 15 >> □  □
     *       1  2
     * 15 - 1 - 2 = 12
     * 12 / 2 = 6
     * 15 >> (1 + 6) + (2 + 6)
     * 두 수를 할당하고, 두수의 합을 목표 숫자에서 빼서 그 숫자가 2로 나누어떨어져야함
     * 같은 방식으로 세개면?
     * 네개면
     * @param targetNumber 목표 숫자
     * @return 달성 갯수
     */
    public int getCount3(int targetNumber){
        int answer = 0;
        int cnt = 1; // 네모 상자에 할당 할 연속된 수 역할
        targetNumber -= cnt;
        while(targetNumber > 0){
            cnt++;
            targetNumber -= cnt;
            if(targetNumber % cnt == 0) answer++;
        }
        return answer;
    }

}
