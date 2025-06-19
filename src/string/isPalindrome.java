package string;

import java.util.Scanner;

public class isPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isPalindrome obj = new isPalindrome();
        String checked = obj.solution(s);
        System.out.println(checked);
    }

    public String solution(String word){
        word = word.toLowerCase();
        boolean isPalindrome = false;
        String reversed = new StringBuilder(word).reverse().toString();
        if(word.equals(reversed)) isPalindrome = true;
        return (isPalindrome)?"YES":"NO";
    }

}
