public class ShortLongShort {
    public static String shortLongShort(String a, String b) {
        int x = a.length();
        int y = b.length();

        if (x > y) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    public static void main(String[] args) {

        System.out.println(ShortLongShort.shortLongShort("Hello", "hi"));
        System.out.println(ShortLongShort.shortLongShort("aaa", "b"));
        System.out.println(ShortLongShort.shortLongShort("aaa", ""));
        System.out.println(ShortLongShort.shortLongShort("a", "bb"));
        System.out.println(ShortLongShort.shortLongShort("xyz", "ab"));
        System.out.println(ShortLongShort.shortLongShort("", "bb"));
        System.out.println(ShortLongShort.shortLongShort("hi", "Hello"));
    }
}
