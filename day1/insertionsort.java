package day1;
import java.util.*;
import java.util.stream.Collectors;
public class insertionsort {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] insertion_sort(int arr[]){
        for(int i = 0 ;i <= arr.length-1;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                insertionsort.swap(arr,j-1,j);
                j = j-1;
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
        int[] sortedArr = insertion_sort(arr);
        List<Integer> list = Arrays.stream(sortedArr).boxed().collect(Collectors.toList());
        System.out.println("Sorted array is : " + list);
        sc.close();
        sc.close();
        }
    }
