public class FirstTwo {
    public static void main(String[] args) {
        System.out.println(firstTwo("Hello")); // → "He"
        System.out.println(firstTwo("abcdefg")); // → "ab"
        System.out.println(firstTwo("ab")); // → "ab"
    }
    public static String firstTwo(String str) {
        if(str.length() < 2){
            return str;
        }
        return str.substring(0, 2);
    }
}
