import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한_팰린드롬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        유효한_팰린드롬 obj = new 유효한_팰린드롬();
        str = obj.removeNotAlphabets2(str);
        System.out.println(obj.isValidPalindrome(str));
    }

    /**
     * gooG > yes
     * good > no
     * Noon > yes
     * nob > no
     * @param str word to check
     * @return check result YES/NO
     */
    public String isValidPalindrome(String str){
        String str2 = new StringBuilder(str).reverse().toString();
        return ((str2.equalsIgnoreCase(str))?"YES":"NO");
    }


    /**
     * gooG! > gooG
     * @param str word to remove !?$%#&...
     * @return word removed !?$%#&...
     */
    public String removeNotAlphabets(String str){
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : charArray) {
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String removeNotAlphabets2(String str){
        return str.replaceAll("[^A-Za-z]", "");
    }

}
