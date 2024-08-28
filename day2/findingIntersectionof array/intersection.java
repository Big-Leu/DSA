import java.util.*;
public class intersection {
    public static ArrayList<Integer> findIntersection(int arr[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for( int  i = 0 ; i < arr2.length ; i++){
            if (set.contains(arr2[i])){
                list.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        return list;
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the first array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the second array");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the elements in the second array");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("The intersection of the two arrays is: " + findIntersection(arr, arr2));
    }
}
