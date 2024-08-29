import java.util.*;

public class code {
    public static int maxsubsequence(String s , HashMap<Character, Integer> map){
        int start = -1;
        int maxLength = 0;
        for(int i = 0 ;i < s.length(); i++){
            if(map.get(s.charAt(i)) > start)
                start = map.get(s.charAt(i));
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - start);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char val: s.toCharArray()){
            map.put(val, -1);
        }
        System.out.println("The maximum subsequence is: " + maxsubsequence(s, map) + map);
    }
}
