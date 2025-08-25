public class StringManipulator {
        // Method that repeats the last 'n' characters of the input string 'n' times
        public String repeatEnd(String str, int n) {
            StringBuilder result = new StringBuilder();
            // Get the substring of the last 'n' characters
            String lastEnd = str.substring(str.length() - n, str.length());
            // Append that substring 'n' times to the result
            for (int i = 0; i < n; i++) {
                result.append(lastEnd);
            }
            return result.toString();
        }
    }
