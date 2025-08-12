package array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReversePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        ReversePrime obj = new ReversePrime();
        while(st.hasMoreElements()){
            StringBuilder sb = new StringBuilder(st.nextToken());
            int reversedNum = Integer.parseInt(sb.reverse().toString());
            if(obj.isPrime(reversedNum)) System.out.printf("%d ", reversedNum);
        }
        System.out.println();
    }


    public boolean isPrime(int num){
        int[] temp = new int[num+1];
        if(num == 1) return false;
        else if(num <= 3) return true;
        for (int i = 2; i < temp.length; i++) {
            if(temp[i] == 0){
                for (int j = 2 * i; j < temp.length; j+=i) {
                    temp[j] = 1;
                }
            }
        }
        return (temp[num] == 0)?true:false;
    }

}
