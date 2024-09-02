import java.util.*;

class code {
    class dataNode{
        int start;
        int end;
        int sum;
    }
    public List<dataNode> longestOnes(int[] nums, int k) 
    {
        List<dataNode> me = new ArrayList<>();
        int count = 0;
        int start = -1;
        int end = -1;
        int flag = 0;
        for(int i =0 ; i <= (nums.length-1);i++){
            if(nums[i] == 1){
                if(flag == 0){
                    start = i;
                    flag = 1;
                }
                end = i;
            }
            else{
                if(start != -1 && end != -1){
                    dataNode a = new dataNode();
                    a.start = start;
                    a.end = end;
                    a.sum = (end - start + 1)+k;
                    me.add(a);
                }
                start = -1;
                end = -1;
                flag = 0;
            }
        }
        return me;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        code me = new code();
        List<dataNode> a = me.longestOnes(arr, 2);
        a.sort(Comparator.comparingInt(node -> node.sum));
        // Print the sorted list
        for (int i = a.size() - 1; i >= 0; i--) {
            dataNode node = a.get(i);
            // for(int j = (node.end+1); j <= arr.length && k > 0; j++){
            //     arr[j] = 1;
            //     k--;
            // }
            // for(int j = (node.start-1); j >= 0 && k > 0; j--){
            //     arr[j] = 1;
            //     k--;
            // }
            System.out.println(node.start + " " + node.end + " " + node.sum);
        }
    }

}