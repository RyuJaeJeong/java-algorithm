package sort;

import java.util.Scanner;

public class BubbleSort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort bubbleSort = new BubbleSort();
        int length = sc.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort.sort6(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }

    /**
     * 버블 정렬 방식으로 배열을 정렬합니다.
     * @param arr 정렬 대상 배열
     */
    public void sort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = length-1; j > i; j--)
                if(arr[j] < arr[j-1]) swap(arr, j, j-1);
        }
    }

    /**
     * 버블 정렬 방식으로 배열을 정렬합니다.
     * 이거랑 위에꺼는 앞에서 부터 채우냐, 뒤에서 부터 채우냐 차이임
     * @param arr 정렬 대상 배열
     */
    public void sort2(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1-i; j++) {
                if(arr[j] > arr[j+1]) swap(arr, j, j+1);
            }
        }
    }

    /**
     * 버블 정렬 방식으로 배열을 정렬합니다.
     * 교환 횟수가 0이면, 정렬이 완료된것으로 판단하고 정렬을 중단합니다.
     * @param arr 정렬 대상 배열
     */
    public void sort3(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length-1; i++) {
            int cnt = 0;
            for (int j = length-1; j > i; j--){
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    cnt++;
                }
            }
            if(cnt == 0) break;
        }
    }

    /**
     * 버블 정렬 방식으로 배열을 정렬합니다.
     * 교환 횟수가 0이면, 정렬이 완료된것으로 판단하고 정렬을 중단합니다.
     * 이거랑 위에꺼는 앞에서 부터 채우냐, 뒤에서 부터 채우냐 차이임
     * @param arr 정렬 대상 배열
     */
    public void sort4(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length-1; i++) {
            int cnt = 0;
            for (int j = 0; j < length-1-i; j++) {
                if(arr[j] > arr[j+1]) swap(arr, j, j+1);
                cnt++;
            }
            if(cnt == 0) break;
        }
    }

    /**
     * 버블 정렬 방식으로 배열을 정렬합니다.
     * 가장 마지막에 교환된 인덱스를 보관하여, 그 이후 지점까지 만 비교합니다.
     * @param arr 정렬 대상 배열
     */
    public void sort5(int[] arr){
        int length = arr.length;
        int k = 0;
        while(k < length - 1){
            int last = length-1;
            for (int i = length-1; i > k; i--) {
                if(arr[i] < arr[i-1]){
                    swap(arr, i, i-1);
                    last = i;
                }
            }
            k = last;
        }
    }

    /**
     * 버블 정렬 방식으로 배열을 정렬합니다.
     * 가장 마지막에 교환된 인덱스를 보관하여, 그 이후 지점까지 만 비교합니다.
     * @param arr 정렬 대상 배열
     */
    public void sort6(int[] arr){
        int length = arr.length;
        int k = length-1;
        while(k > 0){
            int last = 0;
            for (int i = 0; i < k; i++) {
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    last = i+1;
                }
            }
            k = last;
        }
    }



    /**
     *idx1과 idx2의 인자를 교환
     * @param arr 교환 대상 배열
     * @param idx1 교환 대상 인덱스1
     * @param idx2 교환 대상 인덱스2
     */
    public void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
