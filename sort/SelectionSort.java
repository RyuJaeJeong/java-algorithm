package sort;

import java.util.Arrays;
import java.util.Scanner;

// 가장 작은 요소를 맨 앞으로 이동 시키며 정렬을 수행 하는 방법
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 단순 선택 정렬을 수행
     * @param arr 정렬할 배열
     */
    public void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if(arr[j] < arr[min]) min = j;
            if(min != i) swap(arr, i, min);
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
