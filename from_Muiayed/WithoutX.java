public class WithoutX {

    public static String withoutX(String str) {
        int len = str.length();
        if (len == 0) return str;

        int start = 0;
        int end   = len;

        if (len > 0 && str.charAt(0)  == 'x') start = 1;
        if (len > 0 && str.charAt(len - 1) == 'x') end = len - 1;

        if (start >= end) return "";          // handles "x", "xx", etc.
        return str.substring(start, end);
    }

    public static void main(String[] args) {
        System.out.println(withoutX("xHix")); // Hi
        System.out.println(withoutX("xHi"));  // Hi
        System.out.println(withoutX("Hxix")); // Hxi
        System.out.println(withoutX("x"));    // ""
        System.out.println(withoutX("xx"));   // ""
    }
}