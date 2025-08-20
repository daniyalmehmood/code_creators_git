public class RepeatEnd {
    public String repeatSubstringFromEnd(String str, int n) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < n; i++) {
            newString.append(str.substring(str.length() - n));
        }
        return newString.toString();
    }
}