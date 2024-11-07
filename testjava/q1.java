package testjava;
import java.util.*;

public class q1 {
    public static int maxLength(String s,HashMap<Character,Integer> map){
        int start = -1;
        int maxLength = 0;
        for(int i = 0; i<s.length();i++){
            if((map.get(s.charAt(i)))>(start)){
                start = map.get(s.charAt(i));
            }
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, (i -start));
        }
        return maxLength;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String input:");
    String s = sc.nextLine();
    HashMap<Character,Integer> map = new HashMap<>();
    for(char c: s.toCharArray()){
        map.put(c,-1);
    }
     System.out.println("the max length is :"+maxLength(s,map)+ map);
    sc.close();
    }
}