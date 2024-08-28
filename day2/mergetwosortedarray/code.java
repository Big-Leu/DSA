import java.util.*;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array");
        int n = sc.nextInt();
        System.out.println("Enter the number of elements in the second array");
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("Enter the elements in the first array");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in the second array");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while( n > i && m > j) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            }
            else {
                arr3[k++] = arr2[j++];
            }
        }
        System.out.println("the value of i is: " + i + "the value of j is: " + j);  
        while (arr1.length > i)
            arr3[k++] = arr1[i++];
        while (arr2.length > j) {
            arr3[k++] = arr2[j++];
        }
        System.out.println("The merged array is: ");
        for( int val : arr3) {
            System.out.print(val + " ");
        }
    }
}
