import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자_찾기 {
    
    //Computercoller /  c > 2
    //financeRyu / n > 2
    //okkykr / k > 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char ch = br.readLine().charAt(0);
        문자_찾기 obj = new 문자_찾기();
        int solution = obj.solution(str, ch);
        System.out.println(solution);
    }

    public int solution(String str, char ch){
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);
        int loopSize = str.length();
        int cnt = 0;
        //  for (int i = 0; i < loopSize; i++) {
        //      if(str.charAt(i) == ch) cnt++;
        //  }
        for(char c : str.toCharArray()){
            if(c == ch) cnt++;
        }
        return cnt;
    }

}
