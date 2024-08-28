import java.util.*;

public class usingsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the element in the arrya");
        int arr[] = new int[n];
        int sumn = n * (n + 1) / 2;
        int sum=0;
        for(int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
              sum+=arr[i];
        }
        System.out.println("The missing element is: " + (sum-sumn));
        sc.close();
    }
}
