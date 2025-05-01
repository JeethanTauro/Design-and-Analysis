package Recursion;

public class Fibonacci_iterative {
    public static void fib(int n){
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int sum=0;
        for(int i=2;i<=n;i++) {
            arr[i] = (arr[i-1] + arr[i-2]);
        }
        System.out.println(arr[n]);
    }

    public static void main(String[] args) {
        fib(9);
    }
}
