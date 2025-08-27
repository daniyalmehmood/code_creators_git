public class IsNotEqualChecker {
    public boolean hasEqualIsAndNot(String str) {
        int countNot = 0;
        int countIs = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 3 && str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
            if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
                countIs++;
            }
        }
        return countNot == countIs;
    }
}