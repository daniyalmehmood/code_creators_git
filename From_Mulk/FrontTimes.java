public class FrontTimes {
    public String createRepeatedText(String str, int n) {
        StringBuilder newString = new StringBuilder();
        if (str.length() <= 0) {
            return "";
        }
        for (int i = 0; i < n; i++) {

            newString.append(str.length() < 3 ? str : str.substring(0, 3));
        }
        return newString.toString();
    }
}