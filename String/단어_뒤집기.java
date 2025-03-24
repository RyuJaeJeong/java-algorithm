import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어_뒤집기 {

    public static void main(String[] args) throws IOException {
        단어_뒤집기 reverseWordObject = new 단어_뒤집기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String tokens = "";
        for (int i = 0; i < cnt; i++) {
            tokens += br.readLine() + " ";
        }

        StringTokenizer st = new StringTokenizer(tokens, " ");
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            reverseWordObject.reverseWord3(str);
        }
    }

    public void reverseWord(String str) {
        char[] charArray = str.toCharArray();
        int loopSize = charArray.length;
        for (int i = loopSize-1; i >= 0; i--) {
            System.out.printf("%c", charArray[i]);
        }
        System.out.println();
    }

    public void reverseWord2(String str) {
        String result = new StringBuilder(str).reverse().toString();
        System.out.println(result);
    }

    public void reverseWord3(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        char[] arr = str.toCharArray();
        while (lt < rt) {
            char temp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = temp;
            lt++;
            rt--;
        }
        System.out.println(String.valueOf(arr));
    }

}
