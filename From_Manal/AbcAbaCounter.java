//Recursion-1 > countAbc
public class AbcAbaCounter {

    // Recursive method to count "abc" and "aba" substrings
    public static int countAbcAba(String text) {
        //  if string has fewer than 3 characters, no "abc" or "aba" can appear
        if (text.length() < 3) {
            return 0;
        }

        // Check the first three characters
        String firstThree = text.substring(0, 3);
        if (firstThree.equals("abc") || firstThree.equals("aba")) {
            return 1 + countAbcAba(text.substring(1));
        } else {
            return countAbcAba(text.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countAbcAba("abc"));
        System.out.println(countAbcAba("abcxxabc"));
        System.out.println(countAbcAba("abaxxaba"));
    }
}