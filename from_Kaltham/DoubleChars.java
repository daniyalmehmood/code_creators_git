public class DoubleChars {
    public String doubleEachChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                result.append(str.charAt(i));
            }

        }
        return result.toString();
    }
}