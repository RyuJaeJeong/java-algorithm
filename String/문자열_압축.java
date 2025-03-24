import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 문자열_압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        문자열_압축 obj = new 문자열_압축();
        System.out.println(obj.zipWord2(s));
    }

    public String zipWord(String str){
        char[] charArray = str.toCharArray();
        int loopSize = charArray.length;
        String result = "";
        for (int i = 0; i < loopSize; i++) {
            char c = charArray[i];
            int cnt = 1;
            for (int j = (i+1); j < loopSize; j++) {
                if(charArray[j] == c) cnt++;
                else break;
            }
            result += c;
            if(cnt > 1){
                result += cnt;
                i+=(cnt-1);
            }

        }
        return result;
    }

    public String zipWord2(String str){
        String result = "";
        str = str + " ";
        char[] charArray = str.toCharArray();
        int loopSize = charArray.length;
        int cnt = 1;
        for (int i = 0; i < (loopSize-1); i++) {
            if(charArray[i] == charArray[i+1]) cnt++;
            else{
                result += charArray[i];
                result += (cnt>1)?cnt:"";
                cnt=1;
            }
        }
        return result;
    }

}
