public class SameEnds {
    public String sameEnds(String string) {
        int len = string.length();
        int max = 0;
        for (int i = 1; i <= len / 2; i++) {
            if (string.substring(0, i).equals(string.substring(len - i))) {
                max = i;
            }
        }
        return string.substring(0, max);
    }
}