public class StringBits {
    public String getEveryOtherChar(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            newString.append(str.charAt(i));
        }
        return newString.toString();
    }
}