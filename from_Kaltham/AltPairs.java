public class AltPairs {
    public String altPairs(String str) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            str1.append(str.charAt(i));
            if (i + 1 < str.length()) {
                str1.append(str.charAt(i + 1));
            }
        }
        return str1.toString();
    }

}