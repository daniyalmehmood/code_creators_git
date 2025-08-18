public class CountTriple {
    public static int countTripleChar(String str) {
        int countTriple = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                countTriple++;
            }
        }
        return countTriple;
    }

    public static void main(String[] args) {
        System.out.println(countTripleChar("abcXXXabc"));
        System.out.println(countTripleChar("xxxabyyyycd"));
        System.out.println(countTripleChar("a"));
    }
}
