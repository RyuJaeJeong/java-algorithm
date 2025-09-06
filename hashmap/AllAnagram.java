package hashmap;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AllAnagram anagram = new AllAnagram();
        String sWord = scanner.nextLine();
        String tWord = scanner.nextLine();
        int cnt = anagram.solution2(sWord, tWord);
        System.out.println(cnt);
    }

    public int solution(String sWord, String tWord){
        Map<Character, Integer> tWordMap = new HashMap<>();
        for (int i = 0; i < tWord.length(); i++) {
            char ch = tWord.charAt(i);
            tWordMap.put(ch, tWordMap.getOrDefault(ch, 0)+1);
        }

        int lt = 0;
        int count = 0;
        for (int rt = tWord.length()-1; rt < sWord.length(); rt++) {
            String splittedSword = sWord.substring(lt++, rt+1);
            int same = 0;
            for(char key : tWordMap.keySet()){
                int tWordCnt = tWordMap.get(key);
                int sWordCnt = getCharacterCount(splittedSword, key);
                if(sWordCnt == tWordCnt) same++;
            }
            if(same == tWordMap.size()) count++;
        }
        return count;
    }

    public int solution2(String sWord, String tWord){
        Map<Character, Integer> tWordMap = new HashMap<>();
        for (int i = 0; i < tWord.length(); i++) {
            char ch = tWord.charAt(i);
            tWordMap.put(ch, tWordMap.getOrDefault(ch, 0)+1);
        }

        int lt = 0;
        int count = 0;
        for (int rt = tWord.length()-1; rt < sWord.length(); rt++) {
            String splittedSword = sWord.substring(lt++, rt+1);
            Map<Character, Integer> sWordMap = new HashMap<>();
            for(char ch : splittedSword.toCharArray()){
                sWordMap.put(ch, sWordMap.getOrDefault(ch, 0)+1);
            }
            int sameCnt = 0;
            for (char key: tWordMap.keySet()){
                if(tWordMap.get(key) == sWordMap.getOrDefault(key, 0)){
                    sameCnt++;
                }
            }
            if(sameCnt == tWordMap.size()) count++;
        }
        return count;
    }

    public static int getCharacterCount(String word, char c){
        String removed = word.replaceAll("[^" + c + "]", "");
        int counter = removed.length();
        return counter;
    }
}
