//Recursion-1 > countX

public class XCounter {
    public int countXInString(String str) {
        int n = 0;
        if (str.length() > 0) {
            if (str.charAt(n) == ('x')) {
                return 1 + countXInString(str.substring(n + 1));
            } else {
                return countXInString(str.substring(n + 1));
            }
        }

        return 0;
    }
}