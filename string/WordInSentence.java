package string;

import java.util.Scanner;

public class WordInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        WordInSentence wordInSentence = new WordInSentence();
        String word = wordInSentence.solution(sentence);
        System.out.println(word);
    }
    
    public String solution(String sentence){
        String[] words = sentence.split(" ");
        int maxLength = 0;
        String result = "";
        for(String word : words){
            int wordLength = word.length();
            if(maxLength < wordLength){
                maxLength = wordLength;
                result = word;
            }
        }
        return result;
    }
}
