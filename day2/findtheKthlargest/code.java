import java.util.*;

public class code {
    public static int kThLargest(HashSet<Integer> cum, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>(cum);
        for(int i = 0 ; i <k; i++){
            pq.add(list.get(i));
        }
        for( int i = k; i < list.size(); i++){
            if(pq.peek() < list.get(i)){
                pq.poll();
                pq.add(list.get(i));
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n = sc.nextInt();
     HashSet<Integer> set = new HashSet<>();
     for(int i = 0; i < n; i++){
        set.add(sc.nextInt());
     }
      System.out.println(" the kTH largest element is :"+ kThLargest(set, 3));
    }
}
