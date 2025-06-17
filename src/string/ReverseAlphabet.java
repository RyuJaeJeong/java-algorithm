package string;

import java.util.Scanner;

public class ReverseAlphabet {
    public static void main(String[] args) {
        ReverseAlphabet reverseHelper = new ReverseAlphabet();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reversed = reverseHelper.solution(word);
        System.out.println(reversed);
    }
    
    public String solution(String word){
        char[] chars = word.toCharArray();
        int lt = 0;
        int rt = chars.length-1;
        while(lt <= rt){
            if(Character.isAlphabetic(chars[lt]) && Character.isAlphabetic(chars[rt])){
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
            }else if(Character.isAlphabetic(chars[lt])){
                rt--;
                continue;
            }else if(Character.isAlphabetic(chars[rt])){
                lt++;
                continue;
            }
            lt++;
            rt--;
        }
        String result = String.valueOf(chars);
        return result;
    }
}
