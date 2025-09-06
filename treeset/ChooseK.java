package treeset;

import java.util.*;

public class ChooseK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int K = Integer.parseInt(temp[1]);
        temp = sc.nextLine().split(" ");
        int[] cardArr = new int[N];
        for (int i = 0; i < N; i++) {
            cardArr[i] = Integer.parseInt(temp[i]);
        }
        ChooseK chooseK = new ChooseK();
        int num = chooseK.solution2(N, K, cardArr);
        System.out.println(num);
    }

    public int solution(int N, int K, int[] arr){
        int result = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    list.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        list.sort(Collections.reverseOrder());
        int position = 1;
        int value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(value != list.get(i)){
                position++;
                value = list.get(i);
            }
            if(position == K){
                result = list.get(i);
                break;
            }
        }
        return result;
    }

    public int solution2(int N, int K, int[] arr){
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        int result = -1;
        for (int i = 0; i < N; i++)
            for (int j = i+1; j < N; j++)
                for (int k = j+1; k < N; k++)
                    treeSet.add(arr[i]+arr[j]+arr[k]);
        int idx = 0;
        // treeSet.remove(143);
        // treeSet.size();
        // treeSet.first();
        // treeSet.last();
        for(int num: treeSet){
            idx++;
            if(idx == K) {
                result = num;
                break;
            }
        }
        return result;
    }

}
