public class SameEndsFinder {
    // Method to get the longest matching substring at start and end
    public static String getLongestSameEnds(String text) {
        int length = text.length();
        String longestMatch = "";
        
        for (int i = 0; i < length / 2; i++) {
            String startPart = text.substring(0, i + 1);
            String endPart = text.substring(length - i - 1);
            if (startPart.equals(endPart)) {
                longestMatch = startPart;
            }
        }
        return longestMatch;
    }

    public static void main(String[] args) {
        System.out.println(getLongestSameEnds("abXYab"));
        System.out.println(getLongestSameEnds("xx"));
        System.out.println(getLongestSameEnds("xxx"));
        System.out.println(getLongestSameEnds("abXab"));
    }
}