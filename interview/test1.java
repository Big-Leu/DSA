import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class test1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i< n ; i++){
            int input=sc.nextInt();
            if(!map.containsKey(input)){
               map.put(input,1);
            }
            else{
               map.put(input, (map.get(input)+1));
            }
        }
      Comparator <SimpleEntry<Integer,Integer>> comp = (a,b) -> b.getValue() - a.getValue();
      PriorityQueue <SimpleEntry<Integer,Integer>> que = new PriorityQueue<>(comp);
      for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        que.add(new SimpleEntry<Integer,Integer>(entry.getKey(),entry.getValue()));
      }
      while(!que.isEmpty()){
        SimpleEntry<Integer,Integer> item = que.poll();
        for( int i =0 ;i < item.getValue() ;i++){
           System.out.print(item.getKey()+" ");
        }
      }
    }
}
