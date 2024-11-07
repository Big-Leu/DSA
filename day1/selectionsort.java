package day1;
import java.util.*;
import java.util.stream.Collectors;

public class selectionsort {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] selection_sort(int arr[]){
        for(int i =0 ;i <= arr.length-2;i++){
            int min= i;
            for(int j = i; j<= arr.length-1;j++){
              if (arr[min] > arr[j]){
                    selectionsort.swap(arr,min,j);
              }
            }
        }
        return arr;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = selection_sort(arr);
        List<Integer> list = Arrays.stream(sortedArr).boxed().collect(Collectors.toList());
        System.out.println("Sorted array is : " + list);
        sc.close();
    }
}
