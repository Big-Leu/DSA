import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the elements in the array");
        for(int i =0 ; i<=n-1; i++){
            int num = sc.nextInt();
            if(map.containsKey(num)){
                map.put(num,(map.get(num)+1));
            }else{
                map.put(num,1);
            }
        }
        System.out.println("The number of occurence of each element is: " + map);
    }
}
