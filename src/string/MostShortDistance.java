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
        String answer = mostShortDistance.solution2(s, t);
        System.out.println(answer.trim());
    }

    /**
     * 내 풀이
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
        for (int j : result) {
            sb.append(j).append(" ");
        }
        return sb.toString();
    }

    /**
     * 강의 풀이
     */
    public String solution2(String s, String t){
        int loopSize = s.length();
        int baseDistance = 1000;
        int [] resultArr = new int[loopSize];
        for (int i = 0; i < loopSize; i++) {
            if(s.charAt(i) == t.charAt(0)){
                baseDistance = 0;
                resultArr[i] = baseDistance;
            }else{
                baseDistance++;
                resultArr[i] = baseDistance;
            }
        }

        for (int i = loopSize-1; i >= 0; i--) {
            if(s.charAt(i) == t.charAt(0)){
                baseDistance = 0;
                resultArr[i] = baseDistance;
            }else{
                baseDistance++;
                resultArr[i] = Math.min(resultArr[i], baseDistance);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loopSize; i++) {
            if(i != loopSize-1){
                sb.append(resultArr[i]).append(" ");
            }else{
                sb.append(resultArr[i]);
            }
        }
        return sb.toString();
    }


}
