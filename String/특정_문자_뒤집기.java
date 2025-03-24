import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class 특정_문자_뒤집기 {

    public static void main(String[] args) throws IOException {
        특정_문자_뒤집기 reverseWordObject = new 특정_문자_뒤집기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(reverseWordObject.reverseOnlyAlphabet2(str));
    }

    /**
     * reverse only alphabetic word in string
     * @param str 대상 문자열
     * @return 뒤집힌 문자열
     */
    public String reverseOnlyAlphabet(String str) {
        char[] charArray = str.toCharArray();
        int loopSize = charArray.length;
        ArrayList<Character> charList = new ArrayList<>();
        String result = "";

        int startIndex = loopSize - 1;
        int lastIndex = 0;
        for (int i = startIndex; i >= lastIndex; i--) {
            char c = charArray[i];
            if(Character.isAlphabetic(c)) charList.add(c);
        }

        for (int i = 0; i < loopSize; i++) {
            char c = charArray[i];
            if(!Character.isAlphabetic(c)) {
                charList.add(i, c);
            }
        }

        for (int i = 0; i < loopSize; i++) {
            result += charList.get(i);
        }

        return result;
    }

    public String reverseOnlyAlphabet2(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        char[] arr = str.toCharArray();
        while (lt < rt) {
            if(Character.isAlphabetic(arr[lt]) && Character.isAlphabetic(arr[rt])) {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }else if(Character.isAlphabetic(arr[lt])) {
                rt--;
            }else if(Character.isAlphabetic(arr[rt])) {
                lt++;
            }else{
                lt++;
                rt--;
            }

        }
        return String.valueOf(arr);
    }
}
