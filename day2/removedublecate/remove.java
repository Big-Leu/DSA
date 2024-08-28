import java.util.*;

public class remove {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements in the array: ");
      int n = sc.nextInt();
      System.out.println("Enter the element in the array ");
    //   HashSet<Integer> set = new HashSet<>();
       HashMap<Integer, Boolean> set = new HashMap<>();
        for( int i = 0; i < n; i++){
           set.put(sc.nextInt(), true);
        }
        System.out.println("The array after removing duplicates is: " + set);
    }
}
