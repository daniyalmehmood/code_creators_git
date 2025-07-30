public class StringFrontDouble {
    public String stringFrontDouble(String str, int n) {
        StringBuilder str3 = new StringBuilder();
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                str3.append(str);
            }
            return str3.toString();
        } else {
            String str2 = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                str3.append(str2);
            }
            return str3.toString();
        }
    }
}