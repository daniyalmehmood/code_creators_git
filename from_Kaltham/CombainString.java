public class CombineString {
    public String combinedStringInterleaver(String a, String b) {
        StringBuilder finalString = new StringBuilder();
        int minLengthBA = Math.min(a.length(), b.length());
        for (int i = 0; i < minLengthBA; i++) {
            finalString.append(a.charAt(i));
            finalString.append(b.charAt(i));
        }
        if (a.length() < b.length()) {
            String stringB = b.substring(a.length());
            finalString.append(stringB);
        }
        if (a.length() > b.length()) {
            String stringA = a.substring(b.length());
            finalString.append(stringA);
        }
        return finalString.toString();
    }
}