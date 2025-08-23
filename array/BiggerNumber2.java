package array;

import java.util.Scanner;

public class BiggerNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String[] numArr = sc.nextLine().split(" ");
        BiggerNumber2 biggerNumber = new BiggerNumber2();
        biggerNumber.solution(numArr);
    }

    public void solution(String[] arr){
        int beforeHeight = Integer.parseInt(arr[0]);
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            int thisHeight = Integer.parseInt(arr[i]);
            if(beforeHeight < thisHeight) {
                cnt++;
                beforeHeight = thisHeight;
            }
        }
        System.out.println(cnt);
    }
}
