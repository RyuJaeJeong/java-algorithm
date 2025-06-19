package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateCharRemover {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        DuplicateCharRemover remover = new DuplicateCharRemover();
        String removedWord = remover.solution(word);
        System.out.println(removedWord);
    }


    public String solution(String word){
        StringBuilder sb = new StringBuilder();
        char[] chars = word.toCharArray();
        for(char c: chars){
            // indexOf 는 처음 발견된 index를 반환 한다
            if(sb.toString().indexOf(c) == -1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
