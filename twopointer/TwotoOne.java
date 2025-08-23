package twopointer;

import java.util.Arrays;
import java.util.Scanner;

public class TwotoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int[] arr1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            arr1[i]=scanner.nextInt();
        }
        int length2 = scanner.nextInt();
        int[] arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
             arr2[i] = scanner.nextInt();
        }
        int lt = 0, rt = 0;
        int[] answer = new int[length1 + length2];
        int answerIndex = 0;
        while(lt < length1 || rt < length2){
            if(lt == length1){
                answer[answerIndex++] = arr2[rt++];
                continue;
            }else if(rt == length2){
                answer[answerIndex++] = arr1[lt++];
                continue;
            }
            int num1 = arr1[lt];
            int num2 = arr2[rt];
            int choosen = (num1 < num2)?num1:num2;
            if(num1 < num2) lt++;
            else rt++;
            answer[answerIndex++] = choosen;
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
