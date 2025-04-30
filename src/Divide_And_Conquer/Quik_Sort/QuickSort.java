package Divide_And_Conquer.Quik_Sort;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int[] arr, int start, int end){
        if(start < end) {
            int pIndex = partition(arr, start, end);
            sort(arr, start, pIndex - 1);
            sort(arr, pIndex + 1, end);
        }
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
        swap(arr,pIndex,end);
        return pIndex;
    }

    public static void main(String[] args) {
        int[] arr = {34,54,21,4,12,16,1,6,4};
        System.out.println("Before : " + Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println("After : " + Arrays.toString(arr));
    }
}
