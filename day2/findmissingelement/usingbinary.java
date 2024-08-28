import java.util.*;

public class usingbinary {
    public static int binarySearch(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] != (mid+1)) {
                return (mid+1);
            }
            if (arr[mid] < (mid+1)) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The missing number is:"+ binarySearch(arr));

    }
}
