package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int sales [] = new int[N];
        for (int i = 0; i < N; i++) {
            sales[i] = sc.nextInt();
        }
        SalesType salesType = new SalesType();
        salesType.solution(N, K, sales);
    }

    /**
     * 매출 유형의 갯수를 반환합니다.
     * @param N 일수
     * @param K 구간수
     * @param sales 매출 기록
     */
    public void solution(int N, int K, int[] sales){
        Map<Integer, Integer> salsesClassification = new HashMap<>();
        for (int i = 0; i < K; i++) {
            int sale = sales[i];
            salsesClassification.put(sale, salsesClassification.getOrDefault(sale, 0)+1);
        }
        System.out.print(salsesClassification.size() + " ");
        int lt = 0; int rt = K-1;
        while(rt<N-1){
            if(salsesClassification.getOrDefault(sales[lt], 0) > 1){
                salsesClassification.put(sales[lt], salsesClassification.get(sales[lt])-1);
            }else if(salsesClassification.get(sales[lt]) == 1){
                salsesClassification.remove(sales[lt]);
            }
            lt++;
            rt++;
            salsesClassification.put(sales[rt], salsesClassification.getOrDefault(sales[rt], 0)+1);
            System.out.print(salsesClassification.size());
            if(rt < N-1) System.out.print(" ");
            else System.out.println();
        }
    }
}
