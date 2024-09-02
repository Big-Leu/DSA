public class TestContains {
    public static void main(String[] args) {
        String str1 = "AABB";
        String str2 = "AB";
        
        if (str1.contains(str2)) {
            System.out.println("str1 contains str2");
        } else {
            System.out.println("str1 does not contain str2");
        }
    }
}