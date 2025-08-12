public class AltPairs {
    public String getAlternatePairs(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            newString.append(str.charAt(i));
            if (i + 1 < str.length()) {
                newString.append(str.charAt(i + 1));
            }
        }

        return newString.toString();
    }
}
