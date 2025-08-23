package array;


import java.util.Scanner;

public class Chae {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        Chae obj = new Chae();
        int answer = obj.solution(len);
        System.out.println(answer);
    }

    /**
     * 소수의 갯수를 출력(에라토스테네스의 채)
     * 소수를 만났을때 소수의 배수를 마킹하여 소수의 갯수 계산
     * N^2이 아님
     * 5 > 2, 3, (4) 5
     * 7 > 2, 3, (4), 5, (6), 7
     * 10 > 2, 3, (4), 5, (6), 7, (8), (9), (10)
     */
    public int solution(int len){
        int answer = 0;
        int[] numbers = new int[len+1];
        for (int i = 2; i < len+1; i++) {
            if(numbers[i] == 0){
                answer++;
                for (int j = i; j < len+1; j+=i) {
                    numbers[j] = 1;
                }
            }
        }
        return answer;

    }
}
