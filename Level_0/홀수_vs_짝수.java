import java.lang.Math;

public class 홀수_vs_짝수 {

    public static void main(String[] args) {
        홀수_vs_짝수 obj = new 홀수_vs_짝수();
        int[] sample = {4, 2, 6, 1, 7, 6};
        int[] sample2 = {-1, 2, 5, 6, 3};
        System.out.println(obj.solution(sample));
    }

    public int solution(int[] num_list) {
        int loopSize = num_list.length;
        int holSum = 0;
        int jjakSum = 0;
        for(int i = 0; i<loopSize; i++){
            if(i % 2 == 0){
                holSum += num_list[i];
            }else{
                jjakSum += num_list[i];
            }
        }


        return Math.max(holSum, jjakSum);
    }

}
