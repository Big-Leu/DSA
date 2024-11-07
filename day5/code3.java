import java.util.*; 
import java.io.*;

class Main {

  public static String ArrayChallenge(String[] strArr) {
    String ans="";
  for(int i = 0; i <= strArr.length;i++ ){
    int index = ans.indexOf(strArr[i].charAt(0));
    if( index != -1){
      ans=ans.replace((strArr[i].charAt(i)+"-"),"");
      ans=ans+(strArr[i].charAt(i))+"-";
    }
    else{
      ans=ans+(strArr[i].charAt(i))+"-";
    }
  }
  return ans;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}