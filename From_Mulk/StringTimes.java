public class StringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newString.append(str);
        }
        return newString.toString();
    }
}