public class LastTwo {
    public int lastTwo(String str) {
        int count = 0;
        if (str.length() > 1) {
            String str1 = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(str1)) {
                    count++;
                }
            }

        }
        return count;
    }

}