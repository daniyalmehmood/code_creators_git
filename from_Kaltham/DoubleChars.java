public class DoubleChars {
    public String doubleEachChar(String str) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                str1.append(str.charAt(i));
            }

        }
        return str1.toString();
    }
}