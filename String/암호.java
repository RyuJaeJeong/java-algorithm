import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cnt = br.readLine();
        String s = br.readLine().replaceAll(" ", "");
        char[] charArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(c == '#'){
                stringBuilder.append(1);
            }else{
                stringBuilder.append(0);
            }
            
            if(i != 0 && (i+1) % 7 == 0 && i != charArray.length - 1) stringBuilder.append(",");
        }

        암호 obj = new 암호();
        String[] arr = stringBuilder.toString().split(",");
        for (String string : arr) {
            System.out.print((char) obj.binaryToDecimal2(string));
        }
        System.out.println();
    }

    public int binaryToDecimal(String num) {
        char[] charArray = num.toCharArray();
        int result = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(c != '0') {
                int a = 1;
                for (int j = 0; j < (charArray.length-1-i); j++) {
                    a *= 2;
                }
                result += a;
            }
        }
        return result;
    }

    public int binaryToDecimal2(String num) {
        return Integer.parseInt(num, 2);
    }

}
