package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaximumSales {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int K = Integer.parseInt(temp[1]);

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int idx = 0;
        while(tokenizer.hasMoreTokens()){
            arr[idx++] = Integer.parseInt(tokenizer.nextToken());
        }
        MaximumSales maximumSales = new MaximumSales();
        System.out.println(maximumSales.solution(N, K, arr));

    }

    public int solution(int N, int K, int[] arr){
        int lt = 0, rt = K-1;
        int sum = Arrays.stream(Arrays.copyOfRange(arr, lt, rt+1)).sum();
        int maximum = sum;
        while(rt < N-1){
            sum = sum - arr[lt++] + arr[++rt];
            if(sum > maximum) maximum = sum;
        }

        return maximum;
    }
}
