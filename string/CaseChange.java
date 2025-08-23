package string;

import java.util.Scanner;

public class CaseChange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        CaseChange caseChange = new CaseChange();
        String changedStr = caseChange.solution(str);
        System.out.println(changedStr);
    }

    public String solution(String str){
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : charArray){
            sb.append((Character.isUpperCase(ch)) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
        }
        return sb.toString();
    }
}
