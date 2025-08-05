public class StringDoubleXChecker {
    public boolean checkDoubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'x') {
                return str.charAt(i) == str.charAt(i + 1);
            }

        }
        return false;
    }

}
