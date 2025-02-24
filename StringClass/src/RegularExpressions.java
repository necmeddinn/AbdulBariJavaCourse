public class RegularExpressions {
    public static void main(String[] args) {
        String str = "d";
        String str1 = "x8";
        String str2 = "b";

        System.out.println(str.matches("[abcd]"));
        System.out.println(str.matches("[^abcd]"));
        System.out.println(str1.matches("[a-z][0-9]"));
        System.out.println(str2.matches("a|b"));
    }
}
