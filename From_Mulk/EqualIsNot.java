public class EqualIsNot {
    public boolean hasEqualIsAndNotCount(String str) {
        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                countIs++;
            }
            if (i + 2 < str.length() && str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
        }
        return countIs == countNot;
    }

}