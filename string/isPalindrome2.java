package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isPalindrome2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        isPalindrome2 isPalindrome = new isPalindrome2();
        String s = isPalindrome.solution(line);
        System.out.println(s);
    }

    public String solution(String word){
        boolean isPalindrome = true;
        word = word.toLowerCase();
        char[] array = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : array){
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
            }
        }
        String realWord = sb.toString();
        int lt = 0;
        int rt = realWord.length() - 1;
        while(lt < rt){
            if(realWord.charAt(lt++) != realWord.charAt(rt--)) {
                isPalindrome = false;
                break;
            }
        }
        return (isPalindrome)?"YES":"NO";
    }

}
