public class EvenIndexSelector {
    public static String selectEvenChars(String str) {
        String newString = "";

        for (int i = 0; i < str.length(); i += 2) {
            // Append character at index i to result
            newString = newString + str.substring(i, i + 1);
        }

        return newString;
    }
}
