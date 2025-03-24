import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        회문_문자열 obj = new 회문_문자열();
        System.out.println(obj.checkPalindrome2(str));
    }

    /**
     * gooG > yes
     * good > no
     * Noon > yes
     * nob > no
     * @param str word to check
     * @return check result YES/NO
     */
    public String checkPalindrome(String str) {
        String str2 = new StringBuilder(str).reverse().toString();
        return ((str2.equalsIgnoreCase(str))?"YES":"NO");
    }

    public String checkPalindrome2(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if(str.charAt(i) != str.charAt(length-1-i)){
                answer = "NO";
                break;
            }
        }
        return answer;
    }

}
