package testjava;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;


public class q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Entere the length of the array");
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i =0 ;i<n;i++){
            int j=sc.nextInt();
            if(map.containsKey(j)){
               map.put(j,((map.get(j))+1));
            }
            else{
                map.put(j,1);
            }
        }
        Comparator <SimpleEntry<Integer,Integer>> com = (a,b)-> b.getValue() - a.getValue();
        PriorityQueue<SimpleEntry<Integer,Integer>> que = new PriorityQueue<>(com);
        for(Map.Entry<Integer,Integer>  entry: map.entrySet()){
            que.add(new SimpleEntry<Integer,Integer>(entry.getKey(),entry.getValue()));
        }
        System.out.println("the que is :"+ que);
        while(!que.isEmpty()){
            SimpleEntry<Integer,Integer> test = que.poll();
            for( int i =0; i< test.getValue();i++){
                System.out.println(test.getKey()+" ");
            }
        }
    }
}
