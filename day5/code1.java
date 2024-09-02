class code1 {
    public static String mergeAlternately(String word1, String word2) {
        String max = "";
        String min = "";
        if(word1.length() >  word2.length()){
            max = word1;
            min = word2;
        }
        else{
            max = word2;
            min = word1;
        }
        System.out.println("max is : " + max + " min is : " + min);
        String result = "";
        for(int i = 0; i < min.length(); i++){
             result = result + word1.charAt(i) + word2.charAt(i);
        }
        result = result + max.substring(min.length());
        return result;
    }
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(" the string is :" + mergeAlternately(word1, word2));
    }
}