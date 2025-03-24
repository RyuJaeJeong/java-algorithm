import java.util.Arrays;
import java.util.StringTokenizer;

public class n개_간격의_요소들 {

    public static void main(String[] args) {
        n개_간격의_요소들 obj = new n개_간격의_요소들();
        int[] sample = {4, 2, 6, 1, 7, 6};
        int sampleN = 2;
        int sampleN2 = 4;
        System.out.println(Arrays.toString(obj.solution(sample, sampleN)));

    }

    public int[] solution(int[] num_list, int n) {
        String answerStr = "";
        for(int i=0; i<num_list.length; i++) {
            if(i % n == 0) answerStr += num_list[i] + ",";
        }
        StringTokenizer st = new StringTokenizer(answerStr, ",");
        int [] answer = new int[st.countTokens()];
        int idx = 0;
        while (st.hasMoreTokens()) {
            answer[idx++] = Integer.parseInt(st.nextToken());
        }
        return answer;
    }
}
