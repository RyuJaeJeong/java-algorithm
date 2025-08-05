package array;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        fibonacciNumbers.getArray(cnt);
    }

    /**
     * 5 > 1 1 2 3 5
     * 6 > 1 1 2 3 5 8
     * 7 > 1 1 2 3 5 8 13
     * @param len 배열 길이
     */
    public void getArray(int len){
       int [] result = new int[len+1];
       result[0] = 0;
       result[1] = 1;
       result[2] = 1;
       result[3] = 2;   //어차피 3이상의 수가 오니까 3까지는 하드 코딩함 ㅅㄱ
       if(3 < len){
           for (int i = 4; i < len+1; i++) {
                result[i] = result[i-2] + result[i-1];
           }
       }
        for (int i = 1; i < len+1; i++) {
            System.out.printf("%d", result[i]);
            if(i != len) System.out.print(" ");
        }
    }
}
