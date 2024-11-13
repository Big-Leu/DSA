package testjava;

import java.util.Scanner;

public class q4 {
    public static void print(int arr[]){
        for(int var: arr){
            System.out.print(var+" ");
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
        print(arr);
        sc.close();
    }
}
