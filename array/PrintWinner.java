package array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintWinner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        int [] a = new int[len];
        int [] b = new int[len];
        String inputA = sc.nextLine();
        StringTokenizer st = new StringTokenizer(inputA);
        int idx = 0;
        while (st.hasMoreElements()){
            a[idx++] = Integer.parseInt(st.nextToken());
        }
        String inputB = sc.nextLine();
        st = new StringTokenizer(inputB);
        idx = 0;
        while (st.hasMoreElements()){
            b[idx++] = Integer.parseInt(st.nextToken());
        }
        PrintWinner winner = new PrintWinner();
        winner.solution(len, a, b);
    }

    /**
     * 승자 출력
     * @param len 가위바위보 횟수
     * @param a a가 낸 거
     * @param b b가 낸 거
     */
    public void solution(int len, int[] a, int[] b){
        for (int i = 0; i < len; i++) {
            if(a[i] == b[i]){
                System.out.println("D");
            }else if (a[i]==1 && b[i]==3){
                System.out.println("A");
            }else if (a[i]==3 && b[i]==1){
                System.out.println("B");
            }else{
                String winner = (a[i] > b[i])?"A":"B";
                System.out.println(winner);
            }
        }
    }

}
