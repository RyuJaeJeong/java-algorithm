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
        bubbleSort.sort(arr);
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
        for (int i = 0; i < length; i++) {
            for (int j = length-1; j > i; j--)
                if(arr[j] < arr[j-1]) swap(arr, j, j-1);
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
