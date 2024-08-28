import java.util.*;
public class reversestring {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        str = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string is : " + str);
    }
}
