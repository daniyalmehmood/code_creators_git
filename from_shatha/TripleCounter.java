public class TripleCounter {
    public static int countTriples(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char current = str.charAt(i);

            if (current == str.charAt(i + 1) && current == str.charAt(i + 2)) {
                count++;
            }
        }

        return count;
    }
    public static void main(String arg[]){
        System.out.println(countTriples("abcXXXabc"));
        System.out.println(countTriples("xxxabyyyycd"));
        System.out.println(countTriples("a"));
    }
}
