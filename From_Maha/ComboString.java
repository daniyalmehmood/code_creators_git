public class ShortLongShortCombiner {


   // Returns a new string in the form short+long+short.

    public String wrapLongWithShort(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
}
