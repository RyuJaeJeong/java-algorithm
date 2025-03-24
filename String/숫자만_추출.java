import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만_추출 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        숫자만_추출 obj = new 숫자만_추출();
        System.out.println(obj.stayOnlyNumbers2(str));
    }
    /**
     * isDigit 활용 한 숫자만 추출
     * answer = answer * 10 + (c - 48)
     * @param str
     * @return
     */
    public int stayOnlyNumbers(String str){
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        int result = Integer.parseInt(sb.toString());
        return result;
    }

    /**
     * 정규표현식 활용 한 숫자만 추출
     * answer = answer * 10 + (c - 48)
     * @param str
     * @return
     */
    public int stayOnlyNumbers2(String str){
        str = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(str);
    }

    /**
     * ascii code 활용 한 숫자만 추출
     * answer = answer * 10 + (c - 48)
     * @param str
     * @return
     */
    public int stayOnlyNumbers3(String str){
        int answer = 0;
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
          if(48 <= c && c <= 57) answer = answer * 10 + (c - 48);
        }
        return answer;
    }

}
