public class CombineShortLongShort  {
    // Method that places the shorter string on both sides of the longer string
    public static String wrapShortAroundLong(String a, String b) {
        // Compare lengths and assemble result accordingly
    }
        if (str1.length() < str2.length()) {
        if (a.length() < b.length()){
            return a + b + a;
        }
        else{
            return b + a + b;
        }
    }
    public static void main(String[] args) {
        System.out.println(wrapShortAroundLong("Hello", "hi"));
        System.out.println(wrapShortAroundLong("hi", "Hello") );
        System.out.println(wrapShortAroundLong("aaa", "b"));
    }

}
