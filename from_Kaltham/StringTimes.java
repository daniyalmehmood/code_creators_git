public class StringTimes {
    public String stringDouble(String str, int n) {
        StringBuilder repeatedString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeatedString.append(str);
        }
        return repeatedString.toString();
    }
}