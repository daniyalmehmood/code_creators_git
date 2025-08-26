//String-3 > equalIsNot
public class StringCounter {
    public boolean equalIsAndNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 3 <= str.length() && str.substring(i, i + 3).equals("not")) {
                notCount++;
            }
            if (i + 2 <= str.length() && str.substring(i, i + 2).equals("is")) {
                isCount++;
            }
        }
        return notCount == isCount;
    }
}
