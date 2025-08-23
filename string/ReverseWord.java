package string;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        String[] words = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            words[i] = scanner.nextLine();
        }
        ReverseWord reverseWord = new ReverseWord();
        reverseWord.solution2(words);
    }

    public void solution(String[] words){
        for(String word: words){
            char[] charArray = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = charArray.length-1; i >=0; i--) {
                sb.append(charArray[i]);
            }
            System.out.println(sb.toString());
        }
    }

    public void solution2(String[] words){
        for(String word: words){
            StringBuilder sb = new StringBuilder(word);
            System.out.println(sb.reverse().toString());
        }
    }
}
