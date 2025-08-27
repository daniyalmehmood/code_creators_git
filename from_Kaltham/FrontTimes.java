public class FrontTimes {
    public String stringFrontDouble(String str, int n) {
        StringBuilder repeatedFrontStr = new StringBuilder();
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                repeatedFrontStr.append(str);
            }
            return repeatedFrontStr.toString();
        } else {
            String frontStr = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                repeatedFrontStr.append(frontStr);
            }
            return repeatedFrontStr.toString();
        }
    }
}