import java.util.*;

public class usingmap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        HashMap<Integer, Boolean> map = new HashMap<>(n + 1);
        int arr[] = new int[n];
        
        // Populate the array and the map
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], true);
        }
        
        // Check for the missing element
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                System.out.println("The missing element is: " + i);
                break;
            }
        }
        
        sc.close();
    }
}