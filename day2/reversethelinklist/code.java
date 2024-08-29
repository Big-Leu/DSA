import java.util.*;
public class code{
   public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        Collections.reverse(list);
        System.out.println("Original list: " + list);
   }
}