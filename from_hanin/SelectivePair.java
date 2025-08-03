public class SelectivePair {
    public static String selectEveryOtherPair(String str) {
        StringBuilder result = new StringBuilder(); // To build the result string

        // Loop through the string, incrementing by 4 to skip every other pair
        for (int i = 0; i < str.length(); i += 4) {
            // Append the character at index 'i'
            result.append(str.charAt(i));

            // If there is a next character, append that too (i+1)
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1));
            }
        }

        // Return the resulting string
        return result.toString();
    }
}

