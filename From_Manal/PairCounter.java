public class PairCounter {

    // Recursive function to count pairs
    public static int countPairs(String text) {
        // string shorter than 3 cannot have a pair
        if (text.length() < 3) {
            return 0;
        }

        // Check if first and third characters are equal
        if (text.charAt(0) == text.charAt(2)) {
            return 1 + countPairs(text.substring(1));
        } else {
            return countPairs(text.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println("countPairs(\"axa\") = " + countPairs("axa"));
        System.out.println("countPairs(\"axax\") = " + countPairs("axax"));
        System.out.println("countPairs(\"axbx\") = " + countPairs("axbx"));
    }
}