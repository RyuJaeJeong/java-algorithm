package queue;

import java.util.*;

public class SavePrincess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(i+1);
        }
        int cnt = 1;
        while(queue.size() != 1){
            Integer num = queue.poll();
            if(cnt==K){
                cnt = 1;
                continue;
            }
            queue.add(num);
            cnt++;
        }
        int result = queue.poll();
        System.out.println(result);
    }


}
