public class StringRepeat {
    public String repeatFrontNTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        if (n > 0) {

            if (str.length() >= 3) {
                for (int i = 0; i < n; i++) {
                    result.append(str, 0, 3);
                }
            } else {
                result.append(str.repeat(n));
            }
            return result.toString();
        } else
            return "";
    }
}