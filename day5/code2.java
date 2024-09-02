import java.util.*;
public class code2 {
    // static int flag = 0;
    public String gcdOfStrings(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty()){
            return str1.isEmpty() ? str2 : str1;
        }
        if(!(str1.contains(str2)) && !(str2.contains(str1)))
            return "";
        if(!str1.equals(str2)){
            if(str1.length() > str2.length()){
               if(str1.contains(str2) ){
                   int index = str1.indexOf(str2);
                   if(index == 0 || index % str2.length() == 0)
                   {
                       str1=str1.replace(str2,"");
                       return gcdOfStrings(str1, str2);
                   }
                   else{
                       return gcdOfStrings(str1.substring(str2.length()), str2);
                   }
                }
                else{
                    return gcdOfStrings(str1.substring(str2.length()), str2);
                }
            }
            else{
                if(str2.contains(str1) ){
                    int index = str2.indexOf(str1);
                    if(index == 0 || index % str1.length() == 0)
                    {
                        str2 = str2.replace(str1,"");
                        if(str2.contains(str1))
                        return str1;
                        return gcdOfStrings(str1, str2);
                    }
                    else{
                        return gcdOfStrings(str1, str2.substring(str1.length()));
                    }
               }
               else{
               return gcdOfStrings(str1, str2.substring(str1.length()));
               }
           }
        }
        return str1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w1 = sc.nextLine();
    String w2 = sc.nextLine();
    System.out.println(" the string is :" + new code2().gcdOfStrings(w1, w2));
    }
}
