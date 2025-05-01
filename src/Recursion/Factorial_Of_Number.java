package Recursion;

public class Factorial_Of_Number {
    public static int fact(int n){
        if(n==1) {
            return 1;
        }
        return fact(n-1)*n;
    }

    public static void main(String[] args) {
        int num = fact(5);
        System.out.println(num);
    }
}
