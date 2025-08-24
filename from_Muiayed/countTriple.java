public class countTriple {
    public static int countTriple(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char ch = str.charAt(i);
            if (ch == str.charAt(i + 1) && ch == str.charAt(i + 2)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }
}