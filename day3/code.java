import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class code {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n = sc.nextInt();
      HashMap<Integer,Integer> map = new HashMap<>();
      for( int i =0 ; i < n ;i++){
        int num = sc.nextInt();
          if(!map.containsKey(num))
                map.put( num , 1);
          else
           map.put( num , (map.get(num)+1));
      }
      System.out.println("The map is : " + map);
      Comparator<SimpleEntry<Integer,Integer>> comp = (a,b) -> b.getValue() - a.getValue();
      sc.close();
      PriorityQueue<SimpleEntry<Integer,Integer>> pq = new PriorityQueue<>(comp);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(new SimpleEntry<Integer,Integer>(entry.getKey(),entry.getValue()));
        }
      while(!pq.isEmpty()){
        SimpleEntry<Integer,Integer> entry = pq.poll();
        for(int i =0 ; i < entry.getValue();i++){
            System.out.print(entry.getKey() + " ");
        }
      }
    }
}
