public class DoubleXChecker {
        public static boolean hasDoubleX(String str) {
            // Loop through the string, stopping at last character
            for (int i = 0; i < str.length() - 1; i++) {
                // Check if character and the next are both 'x'
                if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                    return true;
                }
            }
            // No "xx" pair found in the string
            return false;
        }
    }

