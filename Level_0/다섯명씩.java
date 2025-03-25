import java.util.Arrays;
import java.util.StringTokenizer;

public class 다섯명씩 {

    public static void main(String[] args) {
        다섯명씩 obj = new 다섯명씩();
        String[] sample = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(obj.solution(sample)));
    }

    public String[] solution(String[] names) {
        Double answerSize = Math.ceil(names.length * 1.0 / 5.0);
        int answerIdx = 0;
        String[] answer = new String[answerSize.intValue()];
        for(int i = 0; i<names.length; i++){
            if(i % 5 == 0) answer[answerIdx++] = names[i];
        }

        return answer;
    }

}
