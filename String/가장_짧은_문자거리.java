import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가장_짧은_문자거리 {

    //field
    public final int S_POSITION = 0;
    public final int T_POSITION = 1;

    //method
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        가장_짧은_문자거리 obj = new 가장_짧은_문자거리();

        String s = input[obj.S_POSITION];
        String t = input[obj.T_POSITION];

        System.out.println(obj.getShortestPosition(s, t));

    }

    public String getShortestPosition(String s, String t){
        //System.out.printf("s : %s, t : %s\n", s, t);
        Integer[] arr = new Integer[s.length()];
        int lt = 0;
        while(lt < s.length()){
            int tPosition = s.indexOf(t, lt);
            for (int i = lt; i <= s.length()-1; i++) {
                int absoluteDistance = Math.abs(i - tPosition);
                if(arr[i] == null || arr[i] > absoluteDistance) arr[i] = absoluteDistance;
            }
            lt++;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : arr) {
            sb.append(i);
            sb.append(" ");
        }

        return sb.toString();
    }

}
