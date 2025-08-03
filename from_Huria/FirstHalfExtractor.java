public class FirstHalfExtractor {
    public static String firstHalfExtractor(String str) {

        int first = str.length() / 2;
        String newString = str.substring(0, first);
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(FirstHalfExtractor.firstHalfExtractor("WooHoo"));
        System.out.println(FirstHalfExtractor.firstHalfExtractor("HelloThere"));
        System.out.println(FirstHalfExtractor.firstHalfExtractor("ab"));
        System.out.println(FirstHalfExtractor.firstHalfExtractor(""));
        System.out.println(FirstHalfExtractor.firstHalfExtractor("0123456789"));

    }
}