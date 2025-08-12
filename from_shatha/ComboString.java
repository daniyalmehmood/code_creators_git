public class ComboString {
    public static String combineByLength(String a, String b) {
        if (a.length()> b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
        public static void main(String[] args){
            System.out.println(combineByLength("Hello", "hi"));
            System.out.println(combineByLength("hi", "Hello"));
            System.out.println(combineByLength("aaa", "b"));

        }

}
