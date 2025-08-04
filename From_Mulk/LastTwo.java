public class LastTwo {
    public int lastTow(String str) {
        int countLastChar = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) {
                countLastChar++;
            }
        }

        return countLastChar;
    }

}