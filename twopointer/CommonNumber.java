package twopointer;

import java.util.Arrays;
import java.util.Scanner;

public class CommonNumber {

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
        CommonNumber commonNumber = new CommonNumber();
        commonNumber.solution(arr1, arr2);
    }

    public void solution(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int lt = 0, rt = 0;
        while(lt<arr1.length || rt < arr2.length){
            if(lt == arr1.length){
                if(arr1[lt-1] == arr2[rt]) System.out.printf("%d ", arr2[rt]);
                rt++;
                continue;
            }

            if(rt == arr2.length){
                if(arr1[lt] == arr2[rt-1]) System.out.printf("%d ", arr1[lt]);
                lt ++;
                continue;
            }

            if(arr1[lt] < arr2[rt]){
                lt++;
            }else if(arr1[lt] == arr2[rt]){
                System.out.printf("%d ", arr1[lt++]);
                rt++;
            }else{
                rt++;
            }
        }
    }
}
