public class ExtraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));// → "lololo"
        System.out.println(extraEnd("ab")); // → "ababab"
        System.out.println(extraEnd("Hi")); // → "HiHiHi"
    }
    public static String extraEnd(String str) {
        String newstr = str.substring(str.length()-2);
        String news = newstr + newstr + newstr;
        return news;
    }
}
