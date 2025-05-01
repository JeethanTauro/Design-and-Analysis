package Recursion;

public class Sum_Of_N_numbers {
    public static int sum(int n){
        if(n==0)
        {
            return n;
        }
        return sum(n-1)+n;
    }

    public static void main(String[] args) {
        int s = sum(10);
        System.out.println(s);
    }
}
