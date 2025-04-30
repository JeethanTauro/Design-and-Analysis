package Divide_And_Conquer.Merge_Sort;
import java.util.*;
public class MergeSort {
    public static void divide(int[] arr){
        if(arr.length<2){
            return;
        }
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid); //excludes mid
        int[] right = Arrays.copyOfRange(arr,mid,arr.length); // til array.length-1
        divide(left);
        divide(right);
        merge(arr,right,left);
    }
    public static void merge(int[] arr, int[] right, int[] left){
        int i=0,j=0,k=0;
        while(i<right.length && j<left.length){
            if(right[i]<left[j]){
                arr[k] = right[i];
                i++;
            }
            else{
                arr[k] = left[j];
                j++;
            }
            k++;
        }
        while (i < right.length) {
            arr[k] = right[i];
            i++;
            k++;
        }
        while (j < left.length) {
            arr[k] = left[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {34,21,43,12,0,32,3,1};
        System.out.println("Before : " + Arrays.toString(arr));
        divide(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }
}
