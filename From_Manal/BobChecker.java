public class BobChecker {

    // Returns true if input contains a substring that starts and ends with 'b'
    public static boolean containsBobPattern(String input) {
        // Loop through string up to length-3 to check every substring of length 3
        for (int i = 0; i <= input.length() - 3; i++) {
            // Check if char at i and i+2 are 'b'
            if (input.charAt(i) == 'b' && input.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false; // No such Pattern found
    }

    public static void main(String[] args) {
        System.out.println(containsBobPattern("abcbob"));
        System.out.println(containsBobPattern("b9b"));
        System.out.println(containsBobPattern("bac"));
    }
}