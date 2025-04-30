package Divide_And_Conquer.Binary_Search;

public class BinarySearch {
    public static void Binary(int[] arr , int low, int high, int key){
        int mid = (low+high)/2;
        if(arr[mid] == key){
            System.out.println("Key found at " + mid);
            return;
        }
        else if(key>arr[mid]){
            Binary(arr,mid+1,high,key);
        }
        else {
            Binary(arr,low,mid-1,key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int low = 0;
        int high = arr.length-1;
        int key = 7;
        Binary(arr,low,high,key);
    }
}
