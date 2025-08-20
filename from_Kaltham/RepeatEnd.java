public class RepeatEnd {
    public String repeatSuffix(String str, int n) {
        String lastNChars = str.substring(str.length() - n);
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            finalString.append(lastNChars);

        }
        return finalString.toString();
    }
}