package day1;
import java.util.*;
import java.util.stream.Collectors;

public class bubblesort {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] bubble_sort(int arr[])
    {
        for( int i = (arr.length-1) ; i >= 0 ; i --){
           for(int j= 0 ; j <= i-1; j++){
               if(arr[j] > arr[j+1]){
                 bubblesort.swap(arr, i, j);
               }
           }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = bubble_sort(arr);
        List<Integer> list = Arrays.stream(sortedArr).boxed().collect(Collectors.toList());
        System.out.println("Sorted array is : " + list);
        sc.close();
        sc.close();
    }
}
