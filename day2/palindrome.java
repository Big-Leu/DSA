import java.util.*;

public class palindrome {
    public static void palindrome_check(String str){
        for(int i = 0; i <= (str.length()-1)/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println(" a palindrome");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        palindrome_check(str);
    }
}
