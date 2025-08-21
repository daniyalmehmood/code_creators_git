public class GGroupChecker {
    public boolean allGsHaveNeighbors(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' && !(((i > 0 && str.charAt(i - 1) == 'g') || (i < str.length() - 1 && str.charAt(i + 1) == 'g')))) {
                return false;
            }
        }
        return true;
    }
}