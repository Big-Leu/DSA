import java.util.*;

public class usingxor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        
        int x1 = 0;
        int x2 = 0;
        
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            int n2 = sc.nextInt();
            x1 ^= n2;
            x2 ^= i+1;
        }
        x2 ^= n+1;       
        System.out.println("The missing element is: " + (x1 ^ x2));
        
        sc.close();
    }
}