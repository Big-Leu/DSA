package testjava;

import java.util.Scanner;

public class q4 {
    public static void print(int arr[]){
        for(int var: arr){
            System.out.print(var+" ");
        }
    }
    public static void cumalativeSum(int arr[]){
        for(int i =1; i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = 0;
        for(int i =0 ;i < arr.length; i++){
           arr[i] = sc.nextInt();
           if( arr[i] > max){
            max = arr[i];
           }
        }
        System.out.println(max);
        int count[] = new int[max];
        int result[] = new int[n];
        for(int var:arr){
            count[(var-1)]++;
        }
        print(count);
        cumalativeSum(count);
        System.out.println();
        print(count);
        System.out.println();
        for(int i = arr.length-1; i>=0 ;i--){
            int val = count[arr[i]-1];
            count[arr[i]-1]--;
            result[val-1] = arr[i];
        }
        System.out.println();
        print(result);
        sc.close();
    }
}
