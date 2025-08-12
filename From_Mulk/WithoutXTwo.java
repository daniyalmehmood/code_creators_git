public class WithoutXTwo {
    public String trimXFromStartTwo(String str) {
        if (str.isEmpty()) {
            return "";

        }
        if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        }

        if (str.length() >= 1 && str.charAt(0) == 'x') {
            return str.substring(1);
        }
        if (str.length() >= 1 && str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        }
        return str;

    }
}