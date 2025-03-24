import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자_변환 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        대소문자_변환 changeCase = new 대소문자_변환();
        String solution = changeCase.solution(str);
        System.out.println(solution);
    }

    /**
     * each character
     * upperCase > lowerCase
     * lowerCase > upperCase
     * @param str character array
     * @return converted array
     */
    public String solution(String str){
        char[] chars = str.toCharArray();
        String solution = "";
        //  for (char c : chars) {
        //      if(65 <= c && c <= 90){
        //          solution += Character.toLowerCase(c);
        //      }else if(97 <= c && c <= 122){
        //          solution += Character.toUpperCase(c);
        //      }
        //  }

        for (char c : chars) {
            int i = (int) c;
            if(Character.isUpperCase(c)){
                solution += Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                solution += Character.toUpperCase(c);
            }
        }

        return solution;
    }

}
