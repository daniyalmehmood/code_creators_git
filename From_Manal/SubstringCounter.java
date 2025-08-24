//Recursion-1 > strCount
public class SubstringCounter {

    // Recursive method to count non-overlapping occurrences of sub
    public static int countSubstring(String text, String sub) {
        // if text is shorter than sub, it can't contain sub
        if (text.length() < sub.length()) {
            return 0;
        }

        // Check if the text starts with sub
        if (text.startsWith(sub)) {
            return 1 + countSubstring(text.substring(sub.length()), sub);
        } else {
            return countSubstring(text.substring(1), sub);
        }
    }

    public static void main(String[] args) {
        System.out.println(countSubstring("catcowcat", "cat"));
        System.out.println(countSubstring("catcowcat", "cow"));
        System.out.println(countSubstring("catcowcat", "dog"));
    }
}
