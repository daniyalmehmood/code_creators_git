public class SymmetricEndsWithStarts {
    public static void main(String[] args) {
        System.out.println(findMatchingEnds("abXYZba"));// → "ab"
        System.out.println(findMatchingEnds("abca"));// → "a"
        System.out.println(findMatchingEnds("aba")); // → "aba"
    }
    public static String findMatchingEnds(String string) {
        StringBuilder matchString = new StringBuilder();
        for (int i = 0; i < string.length() && string.charAt(i) == string.charAt(string.length() - 1 - i); i++) {
            matchString.append(string.charAt(i)); // Add matching chars to the new string
        }
        return matchString.toString();// if no match-->return an empty string
    }
}
