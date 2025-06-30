package string;

import java.util.Scanner;

public class StringTrimmer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTrimmer trimmer = new StringTrimmer();
        System.out.println(trimmer.solution(s));;
    }

    /**
     * 문자열 압축
     * CASE 1 : KKHSSSSSSSE > K2HS7E
     * CASE 2 : KSTTTSEEKFKKKDJJGG > KST3SE2KFK3DJ2G2
     */
    public String solution(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count = 1;
        s = s + " ";
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count = count+1;
            }else{
                if(count > 1) {
                    sb.append(count).append(s.charAt(i));
                }else{
                    sb.append(s.charAt(i));
                }
                count = 1;
            }
        }
        return sb.toString();
    }
}
