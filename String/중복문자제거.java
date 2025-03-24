import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중복문자제거 {

    public static void main(String[] args) throws IOException {
        중복문자제거 obj = new 중복문자제거();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(obj.solution(str));
    }

    /**
     * illinit > ilnt
     * illinare > ilnare
     * keskkset > kset
     * @param str input string
     * @return only one character string
     */
    public String solution(String str){
        char [] arr = str.toCharArray();
        String result = "";
        for(char ch : arr){
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        return result;
    }

}
