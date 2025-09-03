package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Anagram anagram = new Anagram();
        boolean isAnagram = anagram.isAnagram(str1, str2);
        System.out.println((isAnagram)?"YES":"NO");
    }

    public boolean isAnagram(String str1, String str2){
        HashMap<Character, Integer> mapForStr1 = new HashMap<>();
        HashMap<Character, Integer> mapForStr2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            mapForStr1.put(ch1, mapForStr1.getOrDefault(ch1, 0)+1);
            mapForStr2.put(ch2, mapForStr2.getOrDefault(ch2, 0)+1);
        }

        int cnt = 0;
        for(char ch: mapForStr1.keySet()){
            if(mapForStr1.get(ch) == mapForStr2.getOrDefault(ch, 0)) cnt++;
        }
        return cnt==mapForStr1.size();
    }
}
