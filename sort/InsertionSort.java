package sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        for (int i = 0; i < length; i++) {
            if(i == length - 1) System.out.print(arr[i]);
            else System.out.print(arr[i] + " ");
        }
    }

    public void sort(int[] arr){
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int j = i;
            int num = arr[i];
            while(j > 0 && arr[j-1] > num){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = num;
        }
    }
}
