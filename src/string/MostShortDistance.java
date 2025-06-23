package string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class MostShortDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        String s = line[0];
        String t = line[1];
        MostShortDistance mostShortDistance = new MostShortDistance();
        String answer = mostShortDistance.solution(s, t);
        System.out.println(answer.trim());
    }

    /**
     *
     * @param s
     * @param t
     * @return
     */
    public String solution(String s, String t){
        int[] result = new int[s.length()];
        int laseIndex = s.length() - 1;
        result[0] = s.indexOf(t);
        result[laseIndex] = laseIndex - s.lastIndexOf(t);
        for (int i = 1; i < laseIndex; i++) {
            if(s.substring(i, i+1).equals(t)) {
                result[i] = 0;
                continue;
            }
            String leftSide = s.substring(0, i+1);
            String rightSide = s.substring(i);
            int leftIndex = leftSide.lastIndexOf(t);
            int rightIndex = rightSide.indexOf(t);
            int leftDistance = i - leftIndex;
            int rightDistance = rightIndex - 0;
            if(leftIndex == -1){
                result[i] = rightDistance;
            }else if(rightIndex == -1){
                result[i] = leftDistance;
            }else{
                result[i] = Math.min(leftDistance, rightDistance);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i] + " ");
        }
        return sb.toString();
    }


}
