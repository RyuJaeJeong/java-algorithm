package string;

import java.util.Scanner;

public class FindCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        // String character = scanner.nextLine().toLowerCase();
        // char c = character.toCharArray()[0];
        char character = scanner.nextLine().charAt(0);
        FindCharacter findCharacter = new FindCharacter();
        int cnt = findCharacter.soulution(word, character);
        System.out.println(cnt);
    }

    /**
     * word 중 s 가 몇개인지 계산
     * @param word 검사할 문자열
     * @param character 대상 문자
     * @return word에 포함된 c 갯수
     */
    public int soulution(String word, char character){
        char[] charArray = word.toCharArray();
        int cnt = 0;
        for(char splitted : charArray){
            if(splitted == character) cnt++;
        }
        return cnt;
    }


}
