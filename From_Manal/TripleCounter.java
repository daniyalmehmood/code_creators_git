public class TripleCounter {
    // Method to count triples in a string
    public static int countTriples(String text) {
        int tripleCount = 0;
        for (int i = 0; i < text.length() - 2; i++) {
            char current = text.charAt(i);
            if (current == text.charAt(i + 1) && current == text.charAt(i + 2)) {
                tripleCount++;
            }
        }

        return tripleCount;
    }

    public static void main(String[] args) {
        System.out.println(countTriples("abcXXXabc"));
        System.out.println(countTriples("xxxabyyyycd"));
        System.out.println(countTriples("a"));
        System.out.println(countTriples("xxxx"));
    }
}