public class GetEvenIndexChars {
    public String getEvenIndexChars(String str) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            str1.append(str.charAt(i));
        }
        return str1.toString();
    }
}