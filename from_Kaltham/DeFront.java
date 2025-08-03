public class DeFront {
    public String deFront(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals("ab")) {
            return str;
        }
        if (str.length() >= 2 && str.charAt(0) == 'a') {
            return str.substring(0, 1) + str.substring(2);
        }
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            return str.substring(1, 2) + str.substring(2);
        }

        if (str.length() >= 2) {
            return str.substring(2);
        }
        return str;
    }
}
