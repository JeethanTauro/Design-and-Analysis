package Recursion;

public class Reverse_String {
    public static String reverse(String str){
        if(str.isEmpty()){
            return "";
        }
       return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = reverse("Hello");
        System.out.println(str);
    }
    /*
     iterative
     for(int i =0 ;i<str.length();i++){
         rev[i] = str[str.length-i];
     }
   */
}
