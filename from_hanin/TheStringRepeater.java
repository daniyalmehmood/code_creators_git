// Class to repeat a given string a specified number of times fot task stringTimes
public class TheStringRepeater {
    public static String repeatString(String str, int n) {
        // If n is 1 or more, perform repetition
        if (n >= 1) {
            StringBuilder result = new StringBuilder();

            // Append 'result' to 'newstr' n times
            for (int i = 0; i < n; i++) {
                result.append(str);
            }

            // Return the final repeated string
            return result.toString();
        }

        // If n is less than 1, return the original string
        return str;
    }
}
