import java.util.*;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<=(arr.length-1);i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= (arr.length-1) ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is : " + min);
    }
}
