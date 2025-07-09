package array;

import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String[] numArr = sc.nextLine().split(" ");
        BiggerNumber biggerNumber = new BiggerNumber();
        biggerNumber.solution(numArr);
    }

    public void solution(String[] arr){
        int beforeNum = Integer.parseInt(arr[0]);
        System.out.print(beforeNum);
        for (int i = 1; i < arr.length; i++) {
            if(beforeNum < Integer.parseInt(arr[i])) System.out.print(" " + arr[i]);
            beforeNum = Integer.parseInt(arr[i]);
        }
    }
    
    
    
}
