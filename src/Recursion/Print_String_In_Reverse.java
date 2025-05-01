package Recursion;

public class Print_String_In_Reverse {
    public static void reverse(String str){
        if(str.isEmpty()){
            return;
        }
        System.out.print(str.charAt(str.length()-1));
        reverse(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        reverse("hello");
    }
}
